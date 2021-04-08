package com.company.Homework6;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Homework6.ToDoItem.completed;
import static com.company.Homework6.ToDoItem.toDoTitle;

public class ToDoItems {
    private static Object PriorityEnum; 

    public static void main(String[] args){
        System.out.println("Please name your To-Do List: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        ArrayList<String> toDoItem = new ArrayList<>();
        toDoItem.add("1. Add To-Do Items");
        toDoItem.add("2. Mark Task as comleted");
        toDoItem.add("3. Display all To-Do Items");
        toDoItem.add("4. Display uncompleted To-Do Items");
        toDoItem.add("5. Display completed To-Do Items");

        for (int i = 0; i < toDoItem.size(); i++) {
            System.out.println(toDoItem.get(i));
        }

        switch (title){
            case "1":
                toDoTitle();
                setPriority(PriorityEnum);
            case "2":
                completed();
            case "3":
                System.out.println("");
        }

        //pēc lietas ievades:
        System.out.println("\nPress anything to continue or 'q' to stop adding items...");
        while(true) {
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("q")) {
                break;
            }
            for (int i = 0; i < toDoItem.size(); i++) {
                System.out.println(toDoItem.get(i));
            }
        }
    }
}