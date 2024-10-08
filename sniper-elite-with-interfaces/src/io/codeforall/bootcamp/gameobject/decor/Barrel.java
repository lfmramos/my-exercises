package io.codeforall.bootcamp.gameobject.decor;

import io.codeforall.bootcamp.gameobject.Destroyable;
import io.codeforall.bootcamp.gameobject.GameObject;
import io.codeforall.bootcamp.gameobject.GameObjectFactory;

public class Barrel extends GameObject implements Destroyable {
    BarrelType barrelType;
    int currentDamage = 0;
    boolean destroyed;

    public Barrel(BarrelType barrelType){
        this.barrelType = barrelType;
        this.destroyed = false;
    }
    @Override
    public void hit(int n){
        currentDamage++;
    }

    @Override
    public boolean isDestroyed() {
        //This method needs to get the maxDamage from BarrelType and compare with the currentDamage from this class, and turn True when currentDamage == 0;
        if (currentDamage == barrelType.getMaxDamage()) {
            return true;
        }
        return false;
    }
    @Override
    public String getMessage(){
        return "I'm a " + barrelType + " barrel and I've been hit.";
    }
}