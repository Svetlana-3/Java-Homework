package com.company.Homework6;

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
              t.ToDoItems(titleName);

                ToDoItem oneItem = new ToDoItem();
                String itemName = scanner1.nextLine();
                oneItem.setDescription(itemName);

                String priorityName = scanner1.nextLine();
                oneItem.setPriority(priorityName);
                //oneItem.setPriority((PriorityEnum) PriorityEnum.valueOf(priorityName)); //nestrada šī metode

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
                        //System.out.println(oneItem);
                    }
                    //for (int i = 0; i < toDoItem.size(); i++) {
                    //  System.out.println(toDoItem.get(i));
                }
                break;

            case 2:
                System.out.println("case2 Display items vēl jātaisā");
                ToDoItem displayItems = new ToDoItem();
                System.out.println(displayItems);
                //Completed completed = new Completed();
                //completed.setCompleted();
                break;
            case 3:
                System.out.println("case 3 completed items vēl jāuztaisā");
                break;
            case 4:
                System.out.println("case 4 uncompleted items vēl jāuztaisā");
                break;
            case 5:
                System.out.println("case 5 mark Completion int.boolean vēl jāuztaisā");
                break;
            default:
                System.out.println("Try from 1 to 5!");
                break;
        }
    }
}



