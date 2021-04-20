package com.company.FinalWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kredītu kalkulators!");

        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() <= 0) {
            System.out.println("Ievadiet lūdzu pozitīvo skaitli!");
        } else {
            System.out.print("Ievadiet kredīta summu EUR: ");
            double kreditSum = scanner.nextDouble();
            System.out.print("Ievadiet gada procentu likmi %: ");
            double procentiGada = scanner.nextDouble();
            System.out.print("Ivadiet kredīta termiņu mēnešos: ");
            int termMonths = scanner.nextInt();
            System.out.print("Ievadiet pirma maksājuma apmēru EUR: ");
            double firstInvest = scanner.nextDouble();

            KreditCalculator maksajums = new KreditCalculator(kreditSum, procentiGada, termMonths, firstInvest);
            maksajums.howMuchPay();
        }
    }
}
