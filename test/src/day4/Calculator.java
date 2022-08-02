package Exercises.day4;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void mortgageCalc() {

        Scanner scanner = new Scanner(System.in);
        double principal = checkValues("Principal", 1000, 1000000, scanner);
        double interestRate = checkValues("Annual interest rate", 1, 30, scanner);
        double period = checkValues("Period (years):", 1, 30, scanner);
        calculateMortgage(period, interestRate, principal);
    }

    private static double checkValues(String prompt, int min, int max, Scanner scanner) {
        double value;
        while (true) {
            System.out.println(prompt + "(%):");
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter the value between " + min + "to" + max + ".");
        }
        return value;
    }

    private static double calculateMortgage(double period, double interestRate, double principal) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        double numberOfPayments = period * MONTHS_IN_YEAR;
        double monthlyInterestRate = interestRate / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("MORTGAGE : " + mortgageFormatted);
        return mortgage;
    }
}
