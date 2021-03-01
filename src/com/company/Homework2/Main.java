package com.company.Homework2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselo skaitli X no -10 līdz 10: ");
        int x = scanner.nextInt();
        System.out.println("Ievadiet veselo skaitli Y no -10 līdz 10: ");
        int y = scanner.nextInt();
        scanner.close();

        if (x > -2 && x < 3 && y < 1 && y > -4) {
            System.out.println("Koordinātas (" + x + "; " + y + ") atrodas figurās iekšpusē!");
        }
        else if ((x >= -2 && x <= 3) && (y <= 1 && y >= -4)) {
            System.out.println("Koordinātas (" + x + "; " + y + ") atrodas uz figūras līnijas!");
        } else
            System.out.println("Koordinātas (" + x + "; " + y + ") atrodas ārpus figūras!");
    }
}