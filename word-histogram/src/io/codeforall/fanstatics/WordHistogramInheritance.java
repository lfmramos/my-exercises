package io.codeforall.fanstatics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WordHistogramInheritance extends HashMap<String, Integer> implements Iterable<String>{

    public WordHistogramInheritance(String string){
        String[] words = string.split(" ");
        for (String word: words) {
            super.put(word, super.getOrDefault(word,0) + 1);
        }
    }

    @Override
    public Iterator iterator() {
        return keySet().iterator();
    }
}