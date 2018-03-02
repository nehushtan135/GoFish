package com.EVDeV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
        if(sets.isEmpty()){
            System.out.print("None\n");
        }
        else {
            for (Map.Entry<Card.Value, Integer> entry : this.sets.entrySet()) {
                System.out.println(entry.getKey() + "s");
            }
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

    public void playTurn() {
        Scanner scanner = new Scanner(System.in);
        String request;
        System.out.println("What Card do you want to ask for?");
        HashSet<Card.Value> options = new HashSet<>();

        //get options
        for (Card card: hand) {
            options.add(card.v);

        }
        //display options
        for(Card.Value c : options){
            System.out.println(c);
        }
        request = scanner.next();
        Card.Value requestValue =  this.parseValue(request);
    }

    public Card.Value parseValue(String input){
        Card.Value returnValue;
        switch (input){
            case "ace":
                returnValue = Card.Value.ACE;
                break;
            case "two":
                returnValue = Card.Value.TWO;
                break;
            case "three":
                returnValue = Card.Value.THREE;
                break;
            case "four":
                returnValue = Card.Value.FOUR;
                break;
            case "five":
                returnValue = Card.Value.FIVE;
                break;
            case "six":
                returnValue = Card.Value.SIX;
                break;
            case "seven":
                returnValue = Card.Value.SEVEN;
                break;
            case "eight":
                returnValue = Card.Value.EIGHT;
                break;
            case "nine":
                returnValue = Card.Value.NINE;
                break;
            case "ten":
                returnValue = Card.Value.TEN;
                break;
            case "jack":
                returnValue = Card.Value.JACK;
                break;
            case "queen":
                returnValue = Card.Value.QUEEN;
                break;
            case "king":
                returnValue = Card.Value.KING;
                break;
            default:
                returnValue = null;
                break;
        }
        return returnValue;
    }
}
