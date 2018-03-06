package com.EVDeV;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Game {
    public Player player1;
    public Player player2;
    public Dealer dealer;
    public Game(){
        player1 = new Player();
        player2 = new Player();

    }


    public Game(int i){
        dealer = new Dealer();
        player1 = new Player();
        player2 = new Player();
    }
    public void play(){
        //happens once at beginning of game
        this.dealer.Deal();
        //happens at the beginning of each turn

        this.dealer.player1.checkForSets();
        this.dealer.player1.showHand();
        //for testing purposes
        this.dealer.player2.showHand();
        this.dealer.player1.displaySets();
        Card.Value req = this.dealer.player1.playTurn();
        if(this.dealer.player2.checkHand(req)){
            //confirm other player2 has at least one card
            System.out.println("Player 2 has that!");
            // remove cards from player2's hand
            Set<Card.Suit> toAdd = new HashSet<>();
            toAdd = this.dealer.player2.removeRequested(req);
            //add cards to player 1's hand
            this.dealer.player1.addReqCard(req,toAdd);
            //check for sets
            this.dealer.player1.checkForSets();
        }
        else{
            //tell player1 that player2 doesn't have card so they need to go fish
            //add card from deck to player hand.
            //if the card is of the same value as what was requested the player gets to go again
        }
    }


    public void giveCard(Card c, int i){
        if(i == 0){
            this.player1.addCard(c);
        }
        else{
            player2.addCard(c);
        }
    }

}
