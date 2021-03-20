package com.company.Homework5;

import java.util.Random;
import java.util.Scanner;

public class SortArray2D {
    public static void main(String[] args) {
        System.out.println("Ievadi 2D masīva rindu skaitu no 5 līdz 15: ");
        Scanner scanner = new Scanner(System.in);
        int rindas = scanner.nextInt(11) + 5; //(max-min+1) +min
        Random otrais = new Random();
        int numberN = otrais.nextInt(12) + 4;
        int[][] masiv2D = new int[rindas][numberN];
        Random random = new Random();
        for (int i = 0; i < masiv2D.length; i++) {
            for (int j = 0; j < masiv2D[i].length; j++) {
                masiv2D[i][j] = random.nextInt(900) + 100; //aizpildam ar random 100-999
            }
        }
        for (int[] row : masiv2D) {
            for (int column : row) {
                System.out.printf("%4d ", column); // izvadam uz print
            }
            System.out.println();
        }
        //5.) Veic katras rindas elementu kārtošanu dilstošā secībā:
        System.out.println("Sakārtots masīvs:");
        for (int i = 0; i < masiv2D.length; i++) {
            for (int j = 0; j < masiv2D[i].length; j++) {
                for (int k = 0; k < masiv2D[i].length - j - 1; k++) {
                    if (masiv2D[i][k] > masiv2D[i][k + 1]) {
                        int temp = masiv2D[i][k];
                        masiv2D[i][k] = masiv2D[i][k + 1];
                        masiv2D[i][k + 1] = temp;
                    }
                }
            }
        }
        for (int[] row : masiv2D) {
            for (int column : row) {
                System.out.printf("%4d ", column); // izvadam uz print
            }
            System.out.println();
        }
        //6.) Apmaina masīva 1. rindu un pēdējo rindu ar vietām:
        System.out.println("Apmaina masīva 1.rindu un pēdējo rindu ar vietām:");
        for (int i = 0; i < masiv2D.length / 2; i++) {
            // numberArray[i] <=> numberArray[numberArray.length - i - 1]
            int[] temp = masiv2D[i];
            masiv2D[i] = masiv2D[masiv2D.length - i - 1];
            masiv2D[masiv2D.length - i - 1] = temp;
        }
        for (int[] row : masiv2D) {
            for (int column : row) {
                System.out.printf("%4d ", column); // izvadam uz print
            }
            System.out.println();
        }
    }
}