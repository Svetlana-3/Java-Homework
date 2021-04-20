package com.company.Homework6_DRAFT;

import java.util.ArrayList;
import java.util.List;

import static com.company.Homework6_DRAFT.PriorityEnum.LOW;

public class ToDoItems {
    private String title;
    private List<ToDoItem> toDoItems;

    public ToDoItems (String title, List<ToDoItem> toDoItems){
        this.title = title;
        this.toDoItems = toDoItems;
    }
    public String getTitle(){
        return title;
    }
    public List<ToDoItem> toDoItems(){
        return toDoItems;
    }
    @Override
    public String toString(){
        return String.format("Title: %s list: %s", title, toDoItems.toString());
    }

    public void toDoList() {
        System.out.println("What do you wish to do?");
        System.out.println("1. Add To-Do Items\n" +
                "2. Mark Task as comleted\n" +
                "3. Display all To-Do Items\n" +
                "4. Display uncompleted To-Do Items\n" +
                "5. Display completed To-Do Items");
    }
    // 1.
    public void addItem(ToDoItem item) {
        toDoItems.add(item);
        int count = 1;
        System.out.println("Adding item " + "#" + count + " to list " + title);
        count++;
        //ToDoItem one = new ToDoItem(" ", LOW, true);
        //one.addToDoItem("", LOW, true);
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
