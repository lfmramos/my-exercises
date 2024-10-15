package io.codeforall.fanstatics;

import java.util.PriorityQueue;

public class TodoList{

    public PriorityQueue<Task> priorityQueue = new PriorityQueue<>();

    public boolean add(Importance importance, int priority, String description) {
        Task task = new Task(importance, priority, description);
        priorityQueue.add(task);
        return true;
    }
    public Task remove(){
        return priorityQueue.remove();
    }
    public boolean isEmpty(){
        return priorityQueue.isEmpty();
    }
}