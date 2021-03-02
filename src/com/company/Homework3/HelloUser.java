package com.company.Homework3;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet vārdu un uzvārdu vienā rindā ar atstarpi: ");
        String text1 = scanner.next();
        String text2 = scanner.nextLine();

        scanner.close();

        String output1 = text1.substring(0, 1).toUpperCase() + text1.substring(1);
        String output2 = text2.substring(text2.lastIndexOf(" ") + 1).toUpperCase();

        System.out.println(output1);
        System.out.println("\'"+ output2+"\'");
    }
}
