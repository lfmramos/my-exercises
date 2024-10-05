package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.Game;

public class CarFactory {

    /**
     * Creates a new Car object based on a random chance.
     * - Adjusts the probabilities of creating Ferrari and Toyota.
     * - For 2 values in the switch, it's a 50-50 chance of creating Ferraris or Toyotas
     * - Adding new values in the switch (even without returns) would decrease the chance of creating Ferraris
     *
     * @return A new Car object (either Ferrari or Toyota)
     */

    public static  Car getNewCar() {

        int index = (int) (Math.random() * 10);

        switch (index){
            case 0:
                return new Ferrari();

            default:
                return new Toyota();
        }

    }
}
