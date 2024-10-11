package io.codeforall.fanstatics;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

    private Integer initRange;
    private Integer endRange;

    Range(Integer initRange, Integer endRange) {
        this.initRange = initRange;
        this.endRange = endRange;
    }

    /** The iterator() method requires a return of type Iterator.
     * In this case, we have the class MyLittleIterator that is of type Iterator.
     * It is possible to return an instance of the class to satisfy the need for an Iterator object.*/
    @Override
    public Iterator iterator() {
/*        Iterator iterator = new MyLittleIterator();
        return iterator;*/
        return new MyLittleIterator(); // This is the same as the commented code above.
    }
}