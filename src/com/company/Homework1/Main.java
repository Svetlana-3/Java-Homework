package com.company.Homework1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double far;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet temperatūru Fārenheita grādos: ");
        far = scanner.nextDouble();
        scanner.close();
        System.out.println("Ļoti interesanti, paldies!");
        double cen;
        cen = (5 * (far - 32))/9;
        System.out.println("Temperatūra Celsija grādos būs: " + cen);
        System.out.println("Lai Jums laba diena!");
    }
}
