package com.company.Homework6;

import java.util.ArrayList;
import java.util.List;

public class ToDoItems {
    //title: String
    //toDoItems: List<ToDoItem>
    private String title;
    private List<ToDoItem> toDoItems;
    private ToDoItem toDoItem;


    //metodes un konstruktori:
    public String ToDoItems(String title) {
      return this.title; }

    public ToDoItems() {       //konstruktors
        System.out.println("What do you wish to do?");
        ArrayList<String> toDoItems = new ArrayList<>();
        toDoItems.add("1. Add To-Do Items");
        toDoItems.add("2. Mark Task as comleted");
        toDoItems.add("3. Display all To-Do Items");
        toDoItems.add("4. Display uncompleted To-Do Items");
        toDoItems.add("5. Display completed To-Do Items");

        for (int i = 0; i < toDoItems.size(); i++) {
            System.out.println(toDoItems.get(i));

        }
        System.out.println(" ");
        return;
    }

    public void displayItems(){
        ToDoItem display = new ToDoItem();
        //System.out.println("Description: " + display.setDescription() + "Priority: " + display.setPriority() + "Completed: " + display.setCompleted());
    }

    public void exitList(String input) {
        System.out.println("\nPress anything to continue or 'q' to stop adding items...");
        //return input;
    }
    public void addItem(){
        int count=1;
        //for(int i=0; i<1; i++) {
            System.out.println("Adding item " + "#" + count + " to list ");
        count++;
    }
    }


