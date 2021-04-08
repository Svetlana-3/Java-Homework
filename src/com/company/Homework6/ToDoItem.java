package com.company.Homework6;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoItem {

    public static void toDoTitle() {
        System.out.println("Enter title: ");}

        public static void prioritySv() {
            System.out.println("Enter priotity: HIGH, MEDIUM or LOW");
            Scanner scanner1 = new Scanner(System.in);
            String priority = scanner1.nextLine();
            scanner1.close();

            PriorityEnum[] priorArray = PriorityEnum.values();
            PriorityEnum svarigums = priorArray[Integer.parseInt(priority)];

            switch (svarigums) {
                case HIGH:
                    break;
                case MEDIUM:
                    break;
                case LOW:
                    break;
                default:
                    System.out.println("Try again!");
            }
        }

    public static boolean completed() {
        Scanner scanner2 = new Scanner(System.in);
        String comp = scanner2.nextLine();
        switch (comp){
            //toDoItem.add(completed());
            case "completed":
            System.out.println("Completed");
                case "uncompleted":
                System.out.println("Uncompleted");
            }
        return (completed());
    }
}



    /*
         Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        return getToDoItem();
        */