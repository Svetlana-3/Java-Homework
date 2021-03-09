package com.company.Homework4;

import java.util.Random;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int n, arr[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi masīvu ar izmēru no 20 līdz 30: ");
        n = scanner.nextInt();
        arr = new int[n];

        Random rnd = new Random();
        int randomInt = rnd.nextInt(11) + 90;

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * randomInt);
        for (int i : arr)
            System.out.print(i + ", ");

            /*4) Veicam masīvā esošo elementu kārtošanu augošā secībā (neveidojam jaunu masīvu)
              5) Izvadam uz ekrāna sakārtotos masīva elementus
              ** Uzdevumu izpildīšanai neizmantojiet Arrays klases iebūvētās metodes masīva elementu kārtošanai !
              HINTS:
                Masīvus var kārtot izmantojot dažādus jau zināmus kārtošanas algoritmus.*/

        // Kā izdarīt, lai programma ņemtu izvadīto masīvu?

        int [] arr;
        //int temp;
        //int n = array.length;
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
    }
