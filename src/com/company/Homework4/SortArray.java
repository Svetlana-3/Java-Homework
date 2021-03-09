package com.company.Homework4;

import java.util.Random;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int cip, arr[];
        System.out.println("Ievadi masīvu ar izmēru no 20 līdz 30: ");
        Scanner scanner = new Scanner(System.in);
        cip = scanner.nextInt();
        arr = new int[cip];
        scanner.close();

        Random rnd = new Random();
        int randomInt = rnd.nextInt(11) + 90; // 2) Masīvs tiek aizpildīts ar gadījuma skaitļiem(int) robežās no 10 līdz 99
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * randomInt); // Kā bez Math.random????
        //arr [i] = randomInt;
        for (int i : arr) {
            System.out.print(i + ", "); // 3) Izvadam uz ekrāna visus masīvā esošos skaitļus atdalītus ar komatu un atstarpi
        }
        // otrā daļa
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; // 4) Veicam masīvā esošo elementu kārtošanu augošā secībā (neveidojam jaunu masīvu)
                }
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]); // 5) Izvadam uz ekrāna sakārtotos masīva elementus
        }
    }
}
