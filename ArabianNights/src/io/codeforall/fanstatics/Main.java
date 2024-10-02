package io.codeforall.fanstatics;

public class Main {
    //Instantiates MagicLamp, setting the maximum number of genies to be released by the lamp

    public static void main(String[] args) {

        MagicLamp magicLamp = new MagicLamp(2);

        Genie genie = magicLamp.rub(5);
        genie.grantsWishes();
        genie.grantsWishes();

        Genie genie2 = magicLamp.rub(3);
        genie2.grantsWishes();
        genie2.grantsWishes();
        genie2.grantsWishes();
        genie2.grantsWishes();
        genie2.grantsWishes();
        genie2.grantsWishes();

        Genie genie3 = magicLamp.rub(5);
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        magicLamp.recyclesGenie(genie3);

        Genie genie4 = magicLamp.rub(5);
        genie4.grantsWishes();
        genie4.grantsWishes();

        Genie genie5 = magicLamp.rub(3);
        genie5.grantsWishes();
        genie5.grantsWishes();
        genie5.grantsWishes();
        genie5.grantsWishes();
        genie5.grantsWishes();
        genie5.grantsWishes();

        Genie genie6 = magicLamp.rub(5);
        genie6.grantsWishes();
        genie6.grantsWishes();
        genie6.grantsWishes();
    }
}
