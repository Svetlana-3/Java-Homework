package com.company.Homework6_DRAFT;

import com.company.Homework6.PriorityEnum;

public class ToDoItem {
    private String description;
    private Enum priority;
    private boolean completed;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        System.out.print("Enter title: ");
        this.description = description;
    }

    public boolean getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Enum getPriority() {
        return priority;
    }

    public void markCompleted(){
        this.completed = completed;
        return;
    }

    /*private static PriorityEnum valueOf(PriorityEnum priority) {
        return priority;
    }
    */

    public ToDoItem(String description, Enum priority, boolean completed){
            this.description = description;
            this.priority = priority;
            this.completed = completed;
            System.out.println("Description: " + description +
                    ", Priority: " + this.priority.toString() +
                    ", Completed: " + completed);
    }
public void addToDoItem(String description, Enum priority, boolean completed){
    this.description = description;
    this.priority = priority;
    this.completed = completed;
    System.out.println("Description: " + description +
            ", Priority: " + this.priority.toString() +
            ", Completed: " + completed);
}


    @Override
    public String toString() {
        return String.format( "Description: " + description +
                ", Priority: " + this.priority.toString() +
                ", Completed: " + completed);
    }
}

