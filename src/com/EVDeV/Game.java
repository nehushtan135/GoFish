package com.EVDeV;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    public Player player1;
    public Player player2;
    public Dealer dealer;

    public Game(){
        dealer = new Dealer();
        player1 = new Player();
        player2 = new Player();
    }

}
