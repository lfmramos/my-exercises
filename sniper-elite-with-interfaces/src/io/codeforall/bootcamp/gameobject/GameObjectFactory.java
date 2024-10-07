package io.codeforall.bootcamp.gameobject;

import io.codeforall.bootcamp.Main;
import io.codeforall.bootcamp.gameobject.decor.Barrel;
import io.codeforall.bootcamp.gameobject.decor.BarrelType;
import io.codeforall.bootcamp.gameobject.enemy.ArmouredEnemy;
import io.codeforall.bootcamp.gameobject.enemy.Enemy;
import io.codeforall.bootcamp.gameobject.enemy.SoldierEnemy;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;

    public static Destroyable createEnemy() {

       // return Math.random() > 0.5 ? new SoldierEnemy(ENEMY_HEALTH) : new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);
        int enemies = (int) (Math.random() * 4);
        System.out.println(enemies);
        if(enemies < 1){
            System.out.println("created enemy");
            return new SoldierEnemy(ENEMY_HEALTH);
        }
        if(enemies < 2){
            System.out.println("created enemy");
            return new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);
        } else{
            return createBarrel();
        }
    }

    public static Barrel createBarrel(){
        int random = (int) (Math.random() * BarrelType.values().length);
        BarrelType objectType = BarrelType.values()[random];

        Barrel object = null;

        switch(objectType){
            case PLASTIC:
                if(random == 0){
                    object = new Barrel(BarrelType.PLASTIC);
                    break;}
            case WOOD:
                if(random == 1){
                    object = new Barrel(BarrelType.WOOD);
                    break;}
            case METAL:
                if(random == 2)
                    object = new Barrel(BarrelType.METAL);
        }
        return object;
    }
}
