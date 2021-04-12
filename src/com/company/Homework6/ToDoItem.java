package com.company.Homework6;

import static com.company.Homework6.PriorityEnum.*;

public class ToDoItem {
    //description: String
    //priority: Priority
    //completed: boolean

    //klases lauki:
    private String description;
    //private enum priority;
    private boolean completed;
    //private int wish;

    public String getDescription() {
        return description;
    }
    public void setDescription() {
        this.description = description;
    }

/*public enum getPriority(){
    return priority;
}
public PriorityEnum(getPriority priority){
        this.priority;
}*/

    public boolean getCompleted() {
        return completed;
    }

    public void setDescription(boolean completed) {
        this.completed = completed;
    }

    //klases metodes un konstruktori:
    //priority Main klasē, jo šeit ar kļūdām, bet tur nav.

    public ToDoItem(String description) {   //konstruktors
        System.out.println("Enter title: ");
        this.description = description;
    }

    public void toDoItem(String description) {
        this.description = description;
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
                "Enter: completed or uncompleted '" + completed +
                "}";
    }
                //"Enter priotity: HIGH, MEDIUM or LOW '" + setPriority(Enum priority)
}