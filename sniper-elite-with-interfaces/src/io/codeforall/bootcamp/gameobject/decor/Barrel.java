package io.codeforall.bootcamp.gameobject.decor;

import io.codeforall.bootcamp.gameobject.Destroyable;
import io.codeforall.bootcamp.gameobject.GameObject;

public class Barrel extends GameObject implements Destroyable {
    BarrelType barrelType;
    int currentDamage;
    boolean destroyed;

    public Barrel(BarrelType barrelType){
        this.barrelType = barrelType;
        this.destroyed = false;
        System.out.println("I'm a " + barrelType + " barrel.");
    }
    @Override
    public void hit(int n){

    }
    @Override
    public boolean isDestroyed(){
        return false;
    }
    @Override
    public String getMessage(){
        return "I'm a barrel and I've been hit.";
    }
}
