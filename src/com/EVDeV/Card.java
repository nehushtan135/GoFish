package com.EVDeV;

public class Card {
    public enum Value {
        ACE, TWO, THREE, FOUR,
        FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING
    }
    public Value v;
    public enum  Suit {
        HEART, SPADE, CLUB, DIAMOND
    }
    public Suit s;
    public Card(int val, int suit){
        v = Value.values()[val];
        s = Suit.values()[suit];
    }
    public Card(Value y, Suit x){
        v = y;
        s = x;
    }

    public Value getValue(){
        Value v = this.v;
        return v;
    }
    public Suit getSuit(){
        Suit s = this.s;
        return s;
    }

    public Card equals(Card card){
        this.s = card.s;
        this.v = card.v;
        return this;
    }
}
