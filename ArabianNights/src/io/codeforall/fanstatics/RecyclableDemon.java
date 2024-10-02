package io.codeforall.fanstatics;

public class RecyclableDemon extends Genie{

    public RecyclableDemon(){
       super(0);
    }
    @Override
    public  void grantsWishes(){
        // Can be called only "maximumWishes" times
        // Each time it is called, it needs to decrease 1 from the available wishes
        //availableWishes = availableWishes - 1;
            System.out.println("Your wish has been granted.");
        }
}