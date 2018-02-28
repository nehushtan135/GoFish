package com.EVDeV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck extends Stack{
    public  Stack<Card> deck;

    public Deck(){
        deck = new Stack<>();
        for(int j = 0; j < 4; j++){
            for(int i = 0; i < 13; i++){
                Card ctd = new Card(i,j);
                deck.push(ctd);
            }
        }
        Collections.shuffle(deck);
    }

    public Card getTop() {
        Card c = new Card(this.deck.peek().v,this.deck.peek().s);
        this.deck.pop();
        return c;
    }
}
