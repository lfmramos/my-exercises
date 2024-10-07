package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.Game;
import io.codeforall.bootcamp.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;

    private int speed;

    private boolean isCrashed;

    public Car(Position position){
        pos = position;
        isCrashed = false;
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }
    /**
     *  This method should be overridden by subclasses to determine their crash state based on specific criteria.
     *  In this base class, it always returns false.
     *
     * @return True if the car is crashed, False otherwise
     */
    public void setIsCrashed(boolean isCrashed) {
        this.isCrashed = isCrashed;
    }

    public int getSpeed(){
        return speed;
    }

    /** This method randomly chooses a direction based on its speed */
    public void moveRandom() {

        int index = (int) (Math.random() * 4);

        switch(index) {
            case 0:
                pos.turnRight(getSpeed());
                break;
            case 1:
                pos.turnLeft(getSpeed());
                break;
            case 2:
                pos.moveforward(getSpeed());
                break;
            case 3:
                pos.moveBackward(getSpeed());
                break;
        }
    }
}