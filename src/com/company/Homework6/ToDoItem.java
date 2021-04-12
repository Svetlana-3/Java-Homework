package com.company.Homework6;

import static com.company.Homework6.PriorityEnum.*;

public class ToDoItem {
    //description: String
    //priority: Priority
    //completed: boolean

    //klases lauki:
    private String description;
    private Enum priority;
    private boolean completed;
    //private int wish;

    public String getDescription() {
        return description;
    }
    public void setDescription() { this.description = description; }

    public void setDescription(String description) {
        System.out.println("Enter title: ");
        this.description = description;
    }
    /*public enum getPriority(){
    return priority;
}
public PriorityEnum(getPriority priority){
        this.priority;
}*/
//priority Main klasē, jo šeit ar kļūdām, bet tur nav.

    public boolean getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public void doOneItem(){
        setDescription(description);
        setPriority((PriorityEnum) priority);
    }


    public Enum getPriority() {
        return priority;
    }
    public void setPriority(PriorityEnum priority) {
        System.out.println("Enter priority (HIGH, MEDIUM or LOW): ");
        this.priority = priority;
        PriorityEnum c = PriorityEnum.valueOf(HIGH);
        System.out.println(c);
    }
    private static PriorityEnum valueOf(PriorityEnum priority) {
        return priority;
    }

    /*public ToDoItem(String description) {   //konstruktors
        System.out.println("Enter title: ");
        this.description = description;
    }

    public void toDoItem(String description) {
        this.description = description;
    }*/

    public boolean completed(String completed) {
        System.out.println("Enter: completed or uncompleted ");
        if (completed == completed) {
            System.out.println("YES");
            return true;
        } else {
            System.out.println("No");
            return false;
        }
    }
    public void main (String[] args){
    System.out.println("Completed: " + completed);
    }



    @Override
    public String toString() {
        return "ToDoItem{" +
                "Enter title: '" + description +
                "Completed: '" + completed +
                "}";
    }
                //"Enter priotity: HIGH, MEDIUM or LOW '" + setPriority(Enum priority)
}