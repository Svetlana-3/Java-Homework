package com.company.Homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        /*
        1.) Nejauši izvēlās veselo skaitli N robežās no 3 līdz 6
2.) Izveido 2D masīvu izmērā NxN (N rindas un N kolonnas)
3.) Pieprasa no lietotāja veikt izvēli:
A. Aizpildīt masīva elementa vērtības manuāli
B. Aizpildīt masīva elementa vērtības nejauši (ar skaitļiem no 1 līdz 100)
4.)
* Ja lietotājs izvēlās A iespēju: lietotājs pats ievada katra masīva elementa vērtību, piemēram:
masivs[0][0] = 2
masivs[0][1] = 23
masivs[0][2] = 44
masivs[1][0] = 35
... utt. līdz tiek ievadītas visas masīvu elementu vērtības

* Ja lietotājs izvēlās B iespēju: masīva elementi tiek aizpildīti ar gadījuma (Random) vērtībā robežās no 1 līdz 100.
         */
        // 1)
        Random rnd = new Random();
        int numberN = rnd.nextInt(4) + 3; //(max-min+1)+min
        System.out.println(numberN);
        // 2)
        int[][] masiv2d = new int[numberN][numberN];
        for (int i = 0; i < masiv2d.length; i++) {
            System.out.println(Arrays.deepToString(masiv2d) + " ");
         /*
         3.) Pieprasa no lietotāja veikt izvēli:
            A. Aizpildīt masīva elementa vērtības manuāli
            B. Aizpildīt masīva elementa vērtības nejauši (ar skaitļiem no 1 līdz 100)
          */
            System.out.println("Ievadi burtu A, ja gribi aizpildīt masīvu manuāli vai ievadi burtu B, ja vēlies najaušu izvēli: ");

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a) {

            //}
        }
    }
}
