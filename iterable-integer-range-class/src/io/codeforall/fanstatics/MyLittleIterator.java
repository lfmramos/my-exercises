package io.codeforall.fanstatics;

public class MyLittleIterator implements java.util.Iterator {

    Integer next;
    Integer initRange;
    Integer endRange;

    @Override
    public boolean hasNext() {
        if (initRange != endRange) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return next;
    }

    // @Override
/*    public void remove() {
        java.util.Iterator.super.remove();
    }*/
}
