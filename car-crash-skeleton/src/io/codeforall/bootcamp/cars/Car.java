package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.Game;
import io.codeforall.bootcamp.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;

    private int speed;

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public Car(){
        Position position = new Position();
        this.speed = getSpeed();
    }
    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }
}
