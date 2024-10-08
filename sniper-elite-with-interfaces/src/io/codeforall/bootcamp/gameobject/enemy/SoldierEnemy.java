package io.codeforall.bootcamp.gameobject.enemy;

import io.codeforall.bootcamp.gameobject.Destroyable;

/**
 * A Soldier enemy without any special behaviour
 */
public class SoldierEnemy extends Enemy implements Destroyable {

    /**
     * @see Enemy#Enemy(int)
     */
    public SoldierEnemy(int health) {
        super(health);
    }

    @Override
    public void hit(int n){
    }

    @Override
    public boolean isDestroyed(){
        if(getHealth() == 0){
            return true;
        }
        return false;
    }
}