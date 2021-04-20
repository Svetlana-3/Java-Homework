package com.company.FinalWork;

public class KreditCalculator {
    private double kreditSum;
    private double procentiGada;
    private int termMonths;
    private double firstInvest;

    public double getKreditSum(){
        return this.kreditSum;
    }
    public double getProcentiGada(){
        return this.procentiGada;
    }
    public int getTermMonths(){
        return this.termMonths;
    }
    public double getFirstInvest(){
        return this.firstInvest;
    }

    public KreditCalculator(double kreditSum, double procentiGada, int termMonths, double firstInvest){
        this.kreditSum = kreditSum;
        this.procentiGada = procentiGada;
        this.termMonths = termMonths;
        this. firstInvest = firstInvest;
    }

    public void howMuchPay(){
        double procentiMonth = this.procentiGada/100/12;
        double aPow = Math.pow(1+procentiMonth, this.termMonths);
        double payment = (this.kreditSum-this.firstInvest) * ((procentiMonth*aPow)/(aPow-1));
        System.out.printf("\nJūsu ikmēneša maksājums = %.2f EUR", payment);
        System.out.println();
    }


}
