package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

public class Toyota extends Car{

    public Toyota(){
        super(new Position());
    }

    // Ferraris have a fixed speed of 1
    @Override
    public int getSpeed() {
        return 1;
    }

    // Toyota representation on the screen is "T"
    @Override
    public String toString() {
        return "T";
    }

}
