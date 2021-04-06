package com.company.Homework6;

import java.util.Scanner;

public class ToDoItem {

    public static ToDoItem getToDoItem() {
        System.out.println("Enter title: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        return getToDoItem();
    }
}
