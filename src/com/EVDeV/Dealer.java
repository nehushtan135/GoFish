package com.EVDeV;


public class Dealer extends Game {
    public Deck theDeck;

    public Dealer(){
        theDeck = new Deck();
    }

    public void Deal() {
        System.out.print("Dealing...\n");
        for(int i = 0; i< 7; i++){
            super.giveCard(theDeck.getTop(),0);
            super.giveCard(theDeck.getTop(), 1);
            }

        }
}

