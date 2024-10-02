package io.codeforall.fanstatics;

public class MagicLamp {

    private int maximumWishes;
    private int maximumGenies; // Defines the maximum number of genies each lamp can release
    private int recharges; // Counts how many times the lamp has been recycled/recharged
    public int releasedGenies = 0; // Counts how many of the possible maximumGenies the lamp has released

    public MagicLamp(int maximumGenies) {
        this.maximumGenies = maximumGenies;
    }

/*    public int getMaximumWishes(){*/
/*        return maximumWishes;*/
/*    }*/
    public Genie rub(int maximumWishes) {
        releasedGenies++;
        if (releasedGenies > maximumGenies) {
            // release RECYCLABLE DEMON
            Genie recyclableDemon = new RecyclableDemon();
            System.out.println("You summoned a DEMON");
            //recyclableDemon.grantsWishes();
            return recyclableDemon;
        }
        if (releasedGenies % 2 == 0) {
            // release FRIENDLY GENIE
            Genie friendlyGenie = new FriendlyGenie(maximumWishes);
            System.out.println("You released a FRIENDLY genie");
            //friendlyGenie.grantsWishes(5);
            return friendlyGenie;
        }
        // release GRUMPY GENIE
        Genie grumpyGenie = new GrumpyGenie();
        System.out.println("You release a GRUMPY genie");
        //grumpyGenie.grantsWishes(5);
        return grumpyGenie;
    }

    public void recyclesGenie(Genie recyclableDemons){
        if (recyclableDemons instanceof RecyclableDemon)
        // Needs to increase a counter of recharges, increasing each time the method is called
        // When called, the method needs to reset the counter releasedGenies*/
       recharges++;
       releasedGenies = 0;
        System.out.println("The lamp has been recharged.");
        return;
    }
}
