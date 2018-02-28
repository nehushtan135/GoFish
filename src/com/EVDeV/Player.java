package com.EVDeV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player {
    public ArrayList<Card> hand;
    public HashMap<Card.Value,Integer> sets;

    public Player(){
        hand = new ArrayList<>();
        sets = new HashMap<>();
    }

    public void addCard(Card c){
        hand.add(c);
    }
    public void showHand() {
        System.out.print("Your hand is:\n");
        for (Card card : this.hand) {
            card.showCard();
        }
    }

    public void displaySets(){
        System.out.println("You have sets of: ");
        for(Map.Entry<Card.Value,Integer> entry : this.sets.entrySet()) {
            System.out.println(entry.getKey() + "'s,");
            }
    }

    public void checkForSets() {
        int matches = 0;
        for (Card card: hand) {
            matches = 0;
            for(Card card1: hand){
                if(card1.v == card.v){
                    matches++;
                }
                if(matches == 4){
                    sets.put(card.v,1);
                    for(Card c : hand){
                        if(c.v == card.v){
                            hand.remove(c);
                        }
                    }
                }
            }
        }
    }
}
