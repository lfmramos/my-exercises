package io.codeforall.bootcamp;

public class Sandbox {

    public static void main(String[] args) {

        Game game1 = new Game();

        Player player1 = new Player("Luis");
      
        while(game1.generatedNumGame != player1.generatedNumPlayer){
            player1.generatedNewNumPlayer1();
            if (game1.generatedNumGame == player1.generatedNumPlayer) {
                System.out.println(player1.name + " won. You rightly guessed the number chosen by the game: " + game1.generatedNumGame);
            } else {
                System.out.println("You chose: " + player1.generatedNumPlayer + "\n You did not guessed the chosen number. Try again.");
            }
        }
    }
}