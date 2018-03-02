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
        this.dealer.Deal();
        //happens at the beginning of each turn

        this.dealer.player1.checkForSets();
        this.dealer.player1.showHand();
        this.dealer.player1.displaySets();
        this.dealer.player1.playTurn();



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
