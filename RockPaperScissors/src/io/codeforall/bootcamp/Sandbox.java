package io.codeforall.bootcamp;

public class Sandbox {

    public static void main(String[] args) {

        Player[] players = new Player[] {
                new Player("Luis"),
                new Player("José")
        };

        Game game = new Game(5, players);
        game.start();
    }
}