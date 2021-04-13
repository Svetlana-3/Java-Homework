package com.company.Homework6;

public class ToDoItem {
    //description: String
    //priority: Priority
    //completed: boolean

    //klases lauki:
    private String description;
    private Enum priority;
    private String priorityWord;
    private boolean completed;

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        this.description = description;
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
    public void setCompleted(){
        this.completed=completed;
    }

    //priority Main klasē, jo šeit ar kļūdām, bet tur nav.

    public Enum getPriority() {
        return priority;
    }


    public String setPriority(PriorityEnum priority) {
        System.out.print("Enter priority (HIGH, MEDIUM or LOW): ");
        this.priority = priority;
        PriorityEnum c = PriorityEnum.valueOf(setPriority(priority));
        System.out.println(c);
        return null;
    }
    public void setPriority(){
        this.priorityWord = priorityWord;
    }

    public void setPriority(String priorityWord) {
        System.out.print("Enter priority (HIGH, MEDIUM or LOW): ");
        this.priorityWord = priorityWord;
    }
    /*private static PriorityEnum valueOf(PriorityEnum priority) {
        return priority;
    }
    */

    public ToDoItem() {
    }
    public ToDoItem(String description, String priorityWord, boolean completed){
        this.description = description;
        this.priorityWord = priorityWord;
        this.completed = completed;
    }

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
    public void markCompleted(){
        this.completed = completed;
        return;
    }

    @Override
    public String toString() {
        return String.format( "Description: " + description +
                        ", Priority: " + priorityWord +
                ", Completed: " + completed);
    }
}