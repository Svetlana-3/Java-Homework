package com.company.Homework6;

public enum PriorityEnum {
    LOW,
    MEDIUM,
    HIGH;

    private Enum priority;


    public Enum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
        PriorityEnum c = PriorityEnum.valueOf(priority);
        System.out.println(c);
    }

    private static PriorityEnum valueOf(PriorityEnum priority) {
        return priority;
    }
}


