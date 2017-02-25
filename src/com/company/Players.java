package com.company;

/**
 * Created by AlexPanteleev on 24.02.2017.
 */
public class Players {
    int player1;
    int player2;
    int player3;

    public void playerGuess(){
        player1 = (int) (Math.random() *10);
        player2 = (int) (Math.random() *10);
        player3 = (int) (Math.random() *10);
    }
}
