package io.codeforall.bootcamp;

import java.util.Random;

public class Player {

    public String name;
    public int wins = 0;
    public Shapes chosenShape;

    public Player (String name){
        this.name = name;
    }

    public static Shapes getShape() {
        Shapes chosenShape = Shapes.values()[new Random().nextInt(Shapes.values().length)];
        return chosenShape;
    }
}
