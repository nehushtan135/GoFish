package com.EVDeV;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Go Fish! \n");
        Game theGame = new Game();
        System.out.println("Dealing...");
        theGame.dealer.Deal();
    }
}
