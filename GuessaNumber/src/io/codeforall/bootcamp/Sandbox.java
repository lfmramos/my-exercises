package io.codeforall.bootcamp;

public class Sandbox {

    public static void main(String[] args) {

        Game game1 = new Game();

        Player1 player1 = new Player1();
      
        while(game1.generatedNumGame != player1.generatedNumPlayer1){
            player1.generatedNewNumPlayer1();
            if (game1.generatedNumGame == player1.generatedNumPlayer1) {
                System.out.println("Both numbers are equal: " + game1.generatedNumGame + " and " + player1.generatedNumPlayer1);
            } else {
                System.out.println("The numbers are different: " + game1.generatedNumGame + " and " + player1.generatedNumPlayer1);
            }
        }
    }
}