package com.company.Homework4;

import java.util.Random;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int cip;
        int arr[];
        System.out.println("Ievadi masīvu ar izmēru no 20 līdz 40: ");
            Scanner scanner = new Scanner(System.in);
            cip = scanner.nextInt();
            if (cip < 20 || cip > 40) {
                System.out.println("Diemžēl nepareizi! Izlasi vēlreiz uzdevumu.");
                return;
            }
            arr = new int[cip];
            scanner.close();

        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(89) + 11;
            System.out.print(arr[i] + ", ");
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
