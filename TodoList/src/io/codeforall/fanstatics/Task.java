package io.codeforall.fanstatics;

public class Task implements Comparable<Task>{
    private int priority;
    private String description;
    private Importance importance;

    public Task(Importance importance, int priority, String description){
        this.importance = importance;
        this.priority = priority;
        this.description = description;
    }

    @Override
    public int compareTo(Task o) {
        if(this.importance.ordinal() > o.importance.ordinal()){
            return 1;
        }else if(this.importance.ordinal() < o.importance.ordinal()){
            return -1;
        } else
        if(this.priority > o.priority){
            return 1;
        } else if(this.priority < o.priority){
            return -1;
        }return 0;
    }

    //Alternative way:
/*    @Override
    public int compareTo(Task task){
        if(importance.compareTo(task.importance) == 0){
            return priority - task.priority;
        }
        return importance.compareTo(task.importance);
    }*/

    @Override
    public String toString(){
        return "TodoItem{" +
                "importance=" + importance +
                ", priority=" + priority +
                ", description=" + description;
    }
}