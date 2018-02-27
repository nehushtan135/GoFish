package com.EVDeV;

import java.util.ArrayList;

public class Player {
    public ArrayList<Card> hand;

    public Player(){
        hand = new ArrayList<>();
    }

    public void addCard(Card c){
        hand.add(c);
    }
}
