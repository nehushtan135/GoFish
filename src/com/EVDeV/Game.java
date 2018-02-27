package com.EVDeV;

import java.util.ArrayList;

public class Game {
    public Dealer dealer;
    public ArrayList<Player> players;

    public Game(){}

    public Game(int numPlayers){
        dealer = new Dealer();
        players = new ArrayList<>();
        for(int i = 0; i<numPlayers; i++){
            Player a = new Player();
            players.add(a);
        }
    }
}
