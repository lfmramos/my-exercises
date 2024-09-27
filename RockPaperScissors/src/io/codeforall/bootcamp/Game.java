package io.codeforall.bootcamp;

public class Game {
    int counterRounds = 1;
    private int setMaxRounds;
    private Player[] players;
    public Game(int setMaxRounds, Player[] players){
        this.setMaxRounds = setMaxRounds;
        this.players = players;
    }

    public void start(){

        while(players. < (setMaxRounds/2)+1  && counterRounds < setMaxRounds){

            for (Player player : players){

            }
        System.out.println(" round nr : " + counterRounds);
        //player1.wins <= (setMaxRounds/2)+1 || player2.wins <= (setMaxRounds/2)+1 || counterRounds < setMaxRounds ){
        player1.chosenShape = Player.getShape();
        System.out.println(player1.name + " chose: " + player1.chosenShape);

        player2.chosenShape = Player.getShape();
        System.out.println(player2.name + " chose: " + player2.chosenShape);

        //Draw
        if(player1.chosenShape == player2.chosenShape) {
            System.out.println("It is a draw. There's no winner.");
        }
        //ROCK + SCISSORS
        if(player1.chosenShape == Shapes.ROCK && player2.chosenShape == Shapes.SCISSORS){
            System.out.println(player1.name + " wins.");
            player1.wins++;
            System.out.println("Number of victories by Player 1: " + player1.wins);
        }
        if(player1.chosenShape == Shapes.SCISSORS && player2.chosenShape == Shapes.ROCK) {
            System.out.println(player2.name + " wins.");
            player2.wins++;
        }
        //PAPER + SCISSORS
        if(player1.chosenShape == Shapes.PAPER && player2.chosenShape == Shapes.SCISSORS) {
            System.out.println(player2.name + " wins.");
            player2.wins++;
        }
        if(player1.chosenShape == Shapes.SCISSORS && player2.chosenShape == Shapes.PAPER) {
            System.out.println(player1.name + " wins.");
            player1.wins++;
        }
        //ROCK + PAPER
        if(player1.chosenShape == Shapes.ROCK && player2.chosenShape == Shapes.PAPER) {
            System.out.println(player2.name + " wins.");
            player2.wins++;
        }
        if(player1.chosenShape == Shapes.PAPER && player2.chosenShape == Shapes.ROCK) {
            System.out.println(player1.name + " wins.");
            player1.wins++;
        }
        ++counterRounds;
        System.out.println(player1.name + " Won " + player1.wins + " and " + player2.name + " won "+ player2.wins + "\n");
    }
    }
}
