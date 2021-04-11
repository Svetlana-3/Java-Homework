package com.company.Homework6;

import static com.company.Homework6.PriorityEnum.*;

public class ToDoItem {
    //description: String
    //priority: Priority
    //completed: boolean

    //klases lauki:
    private String description;
    private String priority;
    private boolean completed;

    public String getDescription() {
        return this.description;
    }

    public String setDescription() {
        return this.description;
    }

    public String getPriority() {
        return this.priority;
    }

    public String setPriority() {
        return this.priority;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    //klases metodes un konstruktori:

    public ToDoItem(String description) {   //konstruktors
        System.out.println("Enter title: ");
        this.description = description;
    }

    public Enum getPriority(String priority) {
        System.out.println("Enter priotity: HIGH, MEDIUM or LOW");
        switch (priority.toUpperCase()) {
            case "HIGH":
                return HIGH;
            case "MEDIUM":
                return MEDIUM;
            case "LOW":
                return LOW;
            default:
                System.out.println("Try again!");
        }
        return HIGH;
    }

    public Enum setPriotity(String priority) {
        return HIGH;
    }

    public boolean completed(String completed) {
        System.out.println("Enter: completed or uncompleted");
        if (completed == completed) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "Enter title: '" + description +
                "Enter priotity: HIGH, MEDIUM or LOW '" + priority +
                "Enter: completed or uncompleted '" + completed +
                "}";
    }
}