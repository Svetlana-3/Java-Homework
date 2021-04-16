package com.company.Homework6_DRAFT;

import com.company.Homework6.ToDoItem;
import com.company.Homework6.ToDoItems;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please name your To-Do List: ");
        Scanner scanner1 = new Scanner(System.in);
        String titleName = scanner1.nextLine();

        ToDoItems t = new ToDoItems();
        t.ToDoItems(titleName);

        int wish = scanner1.nextInt();

        switch (wish) {
            case 1:
                t.addItem();

                ToDoItem oneItem = new ToDoItem();
                String itemName = scanner1.nextLine();
                oneItem.setDescription(itemName);

                String priorityName = scanner1.nextLine();
                oneItem.setPriority(priorityName);

                String exitList = scanner1.nextLine();
                t.exitList(exitList);

                while (true) {
                    String userInput = scanner1.nextLine();
                    if (userInput.equalsIgnoreCase("q")) {
                        break;
                    } else {
                        t.addItem();
                        System.out.println(titleName);
                        oneItem.setDescription(itemName);
                        String itemName2 = scanner1.nextLine();
                        oneItem.setPriority(priorityName);
                        String priorityName2 = scanner1.nextLine();
                    }
                }
        }
    }
}
