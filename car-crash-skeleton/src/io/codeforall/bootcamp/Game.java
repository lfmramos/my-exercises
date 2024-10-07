package io.codeforall.bootcamp;

import io.codeforall.bootcamp.cars.Car;
import io.codeforall.bootcamp.cars.CarFactory;
import io.codeforall.bootcamp.field.Field;

public class Game {

    /** Defines the number of cars to be created */
    public static final int MANUFACTURED_CARS = 20;

    /** Container of Cars */
    private Car[] cars;

    /** Animation delay */
    private int delay;

    // Initialize the field using provided dimensions
    public Game(int cols, int rows, int delay) {
        Field.init(cols, rows);
        this.delay = delay;
    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    /** Uses the CarFactory for creating the cars */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }
        Field.draw(cars);
    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    //This method continuously moves all cars and updates the screen.
    public void start() throws InterruptedException {

        while (true) {
            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);
        }

    }
    /** This method iterates through the cars[],checking for collisions and moving each car randomly */
    private void moveAllCars() {

        /** The method iterates through the cars array using a for loop.
         *  This ensures that each car in the simulation has a chance to move and be checked for collisions.*/
        for (int i = 0; i < cars.length; i++) {
            /** Check for collisions between current car and all other cars.
             * This nested loop checks if the current car (i) occupies the same position (col and row) as any other car (j) in the array.
             * If a collision is detected (i.e., both cars occupy the same position), the setIsCrashed method is called on the current car (i) to set its crashed flag to true.
             * */
            for (int j = 0; j < cars.length; j++) {
                if(i != j && cars[i].getPos().getCol() == cars[j].getPos().getCol()
                    && cars[i].getPos().getRow() == cars[j].getPos().getRow()){
                    cars[i].setIsCrashed(true);
                }
             // If the car is not crashed, move it randomly
            } if(!cars[i].isCrashed()){
                cars[i].moveRandom();
            }
        }
    }
}