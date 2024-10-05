package io.codeforall.bootcamp;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Initialize the game with desired field dimensions and animation delay
        Game g = new Game(100, 25, 200);

        // Start the game
        g.init(); // Creates a bunch of cars and randomly puts them in the field
        g.start(); // Starts the car crash animation

    }
}
