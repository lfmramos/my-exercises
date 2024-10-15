package io.codeforall.fanstatics;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TodoList<Task> implements Comparable{

    PriorityQueue<Task> tasks;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public enum Importance {
        HIGH,
        MEDIUM,
        LOW
    }

    TodoList(){
        tasks = new PriorityQueue<Task>();


    }

}
