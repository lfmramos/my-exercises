package io.codeforall.fanstatics;

import java.util.Iterator;

public class RangeTest {

    public static void main(String[] args) {

        Range r = new Range(3, 10);

        System.out.println("--- USING FORWARD ITERATOR ---");
        Iterator<Integer> it = r.iterator();

        for (Integer i : r) {
            System.out.println(i);

        }

        System.out.println("--- USING REVERSE ITERATOR ---");
        r.setInverted(true);
        for (Integer i : r) {
            System.out.println(i);
        }
    }
}