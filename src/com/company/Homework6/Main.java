package com.company.Homework6;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Homework6.ToDoItem.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please name your To-Do List: ");
        Scanner scanner1 = new Scanner(System.in);
        String titleName = scanner1.nextLine();

        ToDoItems t = new ToDoItems();
        t.ToDoItems(titleName);
        scanner1.close();

        Scanner scanner2 = new Scanner(System.in);
        int wish = scanner2.nextInt();
        scanner2.close();

        switch (wish) {
            case 1:
                ToDoItem oneItem = new ToDoItem();
                //oneItem.doOneItem();
                Scanner scanner3 = new Scanner(System.in);
                String itemName = scanner3.nextLine();
                scanner3.close();
                oneItem.setDescription(itemName);
                Scanner scanner4 = new Scanner(System.in);
                String priorityName = scanner4.next();
                oneItem.setPriority((PriorityEnum) PriorityEnum.valueOf(priorityName));
                scanner4.close();

                ToDoItems exitToDo = new ToDoItems();
                Scanner scanner5 = new Scanner(System.in);
                String exitList = scanner5.nextLine();
                exitToDo.exitList(exitList);
                scanner5.close();

            //exitList();
            break;
            //return;

        case 2:
            System.out.println( "case2");
            //Completed completed = new Completed();
            //completed.setCompleted();


            //return;
                /*case 3:
                    System.out.println("uncompleted items vēl jāuztaisā");
                    break;*/
                //case q:
                //  break;
            default:
                System.out.println("case3");

        }
    }
}

            //return; //vienalga ar return programma finished







            /*
            public static void exitList() {
        System.out.println("\nPress anything to continue or 'q' to stop adding items...");
        Scanner scanner4 = new Scanner(System.in);
        String userInput = scanner4.next();
        if (userInput.equalsIgnoreCase("q")) {
            //break;
            System.out.println("EXIT");
            /*} else {
                System.out.println("vēl jāpierakstā kods");
                //for (int i = 0; i < toDoItem.size(); i++) {
            //System.out.println(toDoItem.get(i));
            }*/




            //pēc lietas ievades:
        /*System.out.println("\nPress anything to continue or 'q' to stop adding items...");
        while(true) {
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("q")) {
                break;
            }
            for (int i = 0; i < toDoItem.size(); i++) {
                System.out.println(toDoItem.get(i));
            }*/
