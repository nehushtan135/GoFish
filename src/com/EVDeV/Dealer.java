package com.EVDeV;

import java.util.Stack;

public class Dealer extends Game {
    public Deck theDeck;

    public Dealer(){
        theDeck = new Deck();
    }

    public void Deal() {
        for(int i = 0; i< 7; i++){
            super.player1.addCard(theDeck.getTop());
            super.player2.addCard(theDeck.getTop());
            System.out.println("hey");
            }
        }
}

