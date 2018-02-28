package com.EVDeV;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
      //  this.dealer.Deal();

        //happens at the beginning of each turn
        Card test = new Card(Card.Value.ACE, Card.Suit.HEART);
        Card test1 = new Card(Card.Value.ACE, Card.Suit.CLUB);
        Card test2 = new Card(Card.Value.ACE, Card.Suit.SPADE);
        Card test3 = new Card(Card.Value.ACE, Card.Suit.DIAMOND);
        this.dealer.player1.addCard(test);
        this.dealer.player1.addCard(test1);
        this.dealer.player1.addCard(test2);
        this.dealer.player1.addCard(test3);
        this.dealer.player1.checkForSets();
        this.dealer.player1.showHand();

        this.dealer.player1.displaySets();
        //to test checkForSets()



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
