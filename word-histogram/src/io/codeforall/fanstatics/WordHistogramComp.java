package io.codeforall.fanstatics;

import java.util.*;

/** Class capable of producing a histogram of words in a string, implements Iterable.
 * Perform 2 solutions, one using inheritance, the other using Composition. */
public class WordHistogramComp implements Iterable<String>{

    private Map<String, Integer> string;

    public WordHistogramComp(String string){
        this.string = new HashMap<>();
        String[] words = string.split(" ");
        for (String word: words) {
            this.string.put(word, this.string.getOrDefault(word,0) + 1);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return string.keySet().iterator();
    }

    public int size(){
        return string.size();
    }
    public int get(String string) {
        return this.string.getOrDefault(string,0);
    }
}