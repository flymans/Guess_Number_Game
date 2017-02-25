package com.company;

public class Game {
    private int winning_number = 0;
    private boolean isplayer1right = false;
    private boolean isplayer2right = false;
    private boolean isplayer3right = false;

    public void Startinggame(){
        Scoreboard scoreboard = new Scoreboard();
        while(scoreboard.player1score <10 && scoreboard.player2score <10 && scoreboard.player3score <10) {
            winning_number = (int) (Math.random() * 10);
            Players players = new Players();
            players.playerGuess();
            System.out.println("Игрок 1 выбрал: " + players.player1);
            System.out.println("Игрок 2 выбрал: " + players.player2);
            System.out.println("Игрок 3 выбрал: " + players.player3);


            if (players.player1 == winning_number) {
                isplayer1right = true;
                scoreboard.player1score++;
            }
            if (players.player2 == winning_number) {
                isplayer1right = true;
                scoreboard.player2score++;
            }

            if (players.player3 == winning_number) {
                isplayer1right = true;
                scoreboard.player3score++;
            }

            System.out.println("Победное число: " + winning_number);
            scoreboard.ShowsScoreboard();


        }
        if (scoreboard.player1score ==10)
            System.out.println("Игрок 1 - победитель");
        else if (scoreboard.player2score ==10)
            System.out.println("Игрок 2 - победитель");
        else if (scoreboard.player3score ==10)
            System.out.println("Игрок 3 - победитель");
    }
}
