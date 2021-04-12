package com.company.Homework6;

import java.util.ArrayList;

public class ToDoItems {
    //klases lauki:

    //title: String
    //toDoItems: List<ToDoItem>
    private String title;
    //private List<ToDoItem>; //???kluda

    //metodes un konstruktori:

    public String ToDoItems(String title) {
        //title = titleS;
        //System.out.println("Please name your To-Do List: ");
        return this.title;
    }
    public ToDoItems() {               //konstruktors
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
    }

    public static String exitList(String input) {
        System.out.println("\nPress anything to continue or 'q' to stop adding items...");
        return input;
    }
}

