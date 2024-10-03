package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.Game;

public class CarFactory {

    public static  Car getNewCar() {
        if((Math.random() * 10) < 2){
        // Creates a FERRARI
        Car ferrari = new Ferrari();
        return ferrari;
        }
        // Creates a TOYOTA
        Car toyota = new Toyota();
        return toyota;
        //return null;

    }
}
