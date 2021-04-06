package com.company.Homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("What do you wish to do?");
        ToDoItem toDoItem = ToDoItem.getToDoItem();
        PriorityEnum priorityEnum = PriorityEnum.getPriority(1);

        System.out.println("Press anything to continue or 'q' to stop adding items: ");
        Scanner scanner = new Scanner(System.in);
        String button = scanner.nextLine();
        switch (button){
            case "q":
                break;
            default:
                System.out.println("Exit");;
        }


    }
}
