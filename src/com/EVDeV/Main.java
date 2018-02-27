package com.EVDeV;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Go Fish! \nHow many players do you want to play with? (2-4)\n");
        int numPlayers = reader.nextInt();
        Game theGame = new Game(numPlayers);
        System.out.println("Dealing...");
        theGame.dealer.Deal(numPlayers);
    }
}
