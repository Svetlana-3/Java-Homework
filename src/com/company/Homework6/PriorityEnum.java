package com.company.Homework6;

import java.util.Scanner;

public enum PriorityEnum {
    LOW,
    MEDIUM,
    HIGH;

    public static PriorityEnum getPriority(int priority) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter priority:\n 1 - ja augsta prioritāte,\n 2 - ja vidēja prioritāte,\n 3 - ja zema prioritāte");
        priority = scanner.nextInt();
        scanner.close();
        switch (priority) {
            case 1:
                System.out.println("Augsta prioritāte!");
                return HIGH;
            case 2:
                System.out.println("Vidēja prioritāte.");
                return MEDIUM;
            case 3:
                System.out.println("Zema prioritāte.");
                return LOW;
        }
        return HIGH;
    }
}

