package mortageSample;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculation {
    static void myCalculation() {
        Scanner scanner = new Scanner(System.in);

        int MONTHS_IN_YEAR = 12;
        int PERCENT = 100;

        System.out.println("Principal : ");
        int principal = scanner.nextInt();

        System.out.println("Annual interest rate :");
        float interestRate = scanner.nextFloat();
        float monthlyInterestRate = interestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (years):");
        int period = scanner.nextInt();

        int numberOfPayments = period * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("MORTGAGE :" + mortgageFormatted);

    }
}
