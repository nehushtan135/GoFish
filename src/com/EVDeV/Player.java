package com.EVDeV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
            System.out.println(entry.getKey() + "s");
            }
    }

    public void checkForSets() {
        HashMap<Card.Value, Integer>currentCards = new HashMap<>();
        List<Card> toRemove = new ArrayList<>();
        for (Card card: hand) {
            toRemove.add(card);
            if (currentCards.containsKey(card.v)) {
                int current = currentCards.get(card.v);
                int toAdd = current + 1;
                currentCards.replace(card.v, current, toAdd++);
            } else {
                currentCards.put(card.v, 1);
            }

        }
        for (Map.Entry<Card.Value,Integer> entry: currentCards.entrySet())
        {
            if(entry.getValue() == 4){
                sets.put(entry.getKey(),1);
                for(Card card : toRemove){
                    if(card.v == entry.getKey()){
                        hand.remove(card);
                    }
                }

            }
        }
    }
}
