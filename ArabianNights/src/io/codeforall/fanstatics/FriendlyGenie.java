package io.codeforall.fanstatics;

public class FriendlyGenie extends Genie{

    //private int maximumWishes;
    private int grantedWishes = 0;

    public FriendlyGenie(int maximumWishes){
       super(maximumWishes);
    }

    @Override
    public  void grantsWishes(){
        // Can be called only "maximumWishes" times
        // Each time it is called, it needs to decrease 1 from the available wishes
        //availableWishes = availableWishes - 1;
        if(grantedWishes < getMaximumWishes()){
            System.out.println("Your wish has been granted.");
            grantedWishes++;
            return;
        }
            System.out.println("You have no more wishes to be granted.");
        }
    }
