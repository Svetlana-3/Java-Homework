package com.company.Homework6_DRAFT;

import java.util.ArrayList;
import java.util.List;

import static com.company.Homework6_DRAFT.PriorityEnum.LOW;

public class ToDoItems {
    public String title;
    List<ToDoItem> toDoItems;

    List<ToDoItem> oneItem = new ArrayList<>();

    ToDoItem one = new ToDoItem("", LOW, true);


    public void toDoList() {
        System.out.println("What do you wish to do?");
        System.out.println("1. Add To-Do Items\n" +
                "2. Mark Task as comleted\n" +
                "3. Display all To-Do Items\n" +
                "4. Display uncompleted To-Do Items\n" +
                "5. Display completed To-Do Items");
    }
    // 1.
    public void addItem() {
        int count = 0;
        System.out.println("Adding item " + "#" + count + " to list ");
        count++;
        //ToDoItem one = new ToDoItem(" ", LOW, true);
        one.addToDoItem("", LOW, true);
        System.out.println("\nPress anything to continue or 'q' to stop adding items...");
    }

    //2.
    public void displayItems() {}
    // 3.
    public void displayCompletedItems(){}

    // 4.
    public void displayUnCompletedItems(){}
    // 5.
    //public void markCompleted (int, boolean){}

    // exit q
    public void exitList(String input) {
        System.out.println("\nPress anything to continue or 'q' to stop adding items...");
    }

       /* ToDoItem c = new ToDoItem(c.getDescription() + c.getPriority() + c.getCompleted());
        System.out.println("Description: " + c.getDescription() + ", Priority: " + c.getPriority() + ", Completed: " + c.getCompleted());
    }*/

}
