package com.EVDeV;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get scanner
        Scanner reader = new Scanner(System.in);
        System.out.print("Welcome to Go Fish! \n");
        Game theGame = new Game(1);
        theGame.play();
    }
}
