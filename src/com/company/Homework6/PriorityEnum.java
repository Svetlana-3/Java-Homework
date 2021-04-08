package com.company.Homework6;

public enum PriorityEnum {
    LOW,
    MEDIUM,
    HIGH;

    private String priority;

    public String getPriority() {
        return priority;
    }

    public void setPriority(String a) {
        priority = a;
        //System.out.println("Enter priority: HIGH, MEDIUM or LOW");
    }
}



  /*      Scanner scanner = new Scanner(System.in);
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
    }*/


