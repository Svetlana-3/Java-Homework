package com.company.Homework5;
import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        // 1)
        Random rnd = new Random();
        int numberN = rnd.nextInt(4) + 3; //(max-min+1)+min
        System.out.println(numberN);
        // 2)
        int[][] masiv2d = new int[numberN][numberN];
        for (int[] row : masiv2d) {
            for (int column : row) {
                System.out.printf("%4d ", column);
            }
            System.out.println();
        }
        // 3.) Pieprasa no lietotāja veikt izvēli: A-manuali, B-nejauši (1-100)
        System.out.println("Ievadi burtu A, ja gribi aizpildīt masīvu manuāli vai ievadi burtu B, ja vēlies najaušu izvēli: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if (a.equals("A")) {
            System.out.println("Aizpildi masīvu!");
            for (int i = 0; i < masiv2d.length; i++) {
                for (int j = 0; j < masiv2d[i].length; j++) {
                    System.out.printf("array[%d][%d] = ", i, j);
                    masiv2d[i][j] = scanner.nextInt();
                }
                System.out.println();
            }
            scanner.close();
            for (int[] row : masiv2d) {
                for (int column : row) {
                    System.out.printf("%4d ", column); // Izvadam uz print
                }
                System.out.println();
            }
            //6) Masīvs A tiek izvadīts diagonāli:

            System.out.println("Diagonāles matrica: ");
            //6) Masīvs tiek izvadīts diagonāli:
            for (int i = 0; i < numberN; i++) {
                for (int j = 0; j < numberN; j++)
                    masiv2d[i][j] = (i == j) ? masiv2d[i][j] : 0;
                continue;
            }

            //masiv2d[i][j] = 0;
            for (int i = 0; i < numberN; i++) {
                for (int j = 0; j < numberN; j++) {
                    System.out.printf("%4d ", masiv2d[i][j]); // Izvadam uz print
                }
                System.out.println();
            }
        }


        //6) Masīvs B tiek izvadīts diagonāli:

        if (a.equals("B")) {
            Random random = new Random();
            for (int i = 0; i < masiv2d.length; i++) {
                for (int j = 0; j < masiv2d[i].length; j++) {
                    masiv2d[i][j] = random.nextInt(100) + 1; // aizpildam ar random
                }
            }
            for (int[] row : masiv2d) {
                for (int column : row) {
                    System.out.printf("%4d ", column); // Izvadam uz print
                }
                System.out.println();
            }
            System.out.println("Diagonāles matrica: ");
            //6) Masīvs tiek izvadīts diagonāli:
            for (int i = 0; i < numberN; i++) {
                for (int j = 0; j < numberN; j++)
                    masiv2d[i][j] = (i == j) ? masiv2d[i][j] : 0;
                continue;
            }

            //masiv2d[i][j] = 0;
            for (int i = 0; i < numberN; i++) {
                for (int j = 0; j < numberN; j++) {
                    System.out.printf("%4d ", masiv2d[i][j]); // Izvadam uz print
                }
                System.out.println();
            }
        }
    }

}

