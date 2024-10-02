package io.codeforall.fanstatics;

public class Genie {

    private int maximumWishes;

    public Genie(int maximumWishes){
        this.maximumWishes = maximumWishes;
    }

    //Needs to be able to call the classes FriendlyGenie and GrumpyGenie
    public void setMaximumWishes(int maximumWishes){
        this.maximumWishes = maximumWishes;
    }
    public int getMaximumWishes(){
        return maximumWishes;
    }

    public void grantsWishes(){

    }
}
