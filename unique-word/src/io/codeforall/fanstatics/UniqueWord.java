package io.codeforall.fanstatics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class UniqueWord implements Iterable<String>{

    private HashSet string;
    public UniqueWord(String string){

        this.string = new HashSet(List.of(string.split(" ")));
    }

    @Override
    public Iterator <String> iterator() {
        return string.iterator();
    }
}