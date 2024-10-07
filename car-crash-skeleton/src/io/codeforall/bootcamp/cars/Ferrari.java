package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

public class Ferrari extends Car{

    public Ferrari(){
        super(new Position());
    }

    // Ferraris have a fixed speed of 2
    @Override
    public int getSpeed() {
        return 2;
    }

    // Ferrari representation on the screen is "F"
    @Override
    public String toString() {
       return "F";
    }
}