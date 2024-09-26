package io.codeforall.bootcamp;

import java.util.Random;

public class RandomNum {
    public static int min = 0;
    public static int max = 11;
    public static int generate(){

        return (int)(Math.random() * max) + min;
    }
}
