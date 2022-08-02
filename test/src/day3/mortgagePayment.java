package mortageSample;

import java.text.NumberFormat;
import java.util.Scanner;

public class  mortgagePayment {
    static void myMethod() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
         float monthlyInterest=0;
         int numberOfPay=0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal:");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 100000)
                break;
            System.out.println("Enter the value between  1000 and 100000");
        }

        while (true) {
            System.out.print("Annual Interest Rate:");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30){
                 monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            break;
        }
        System.out.println("Enter a value greater than 0 and less than or equal to 30");
    }

        while(true){
            System.out.print("period Years:");
            byte years= scanner.nextByte();
            if(years>=1 && years<=30) {
                numberOfPay = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter the value between 1 and 30");
        }

        double mortgage=principal*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPay))/(Math.pow(1+monthlyInterest,numberOfPay)-1);

        String currencyFormatted= NumberFormat.getCurrencyInstance().format(mortgage);
        
        System.out.print("mortgage:" +currencyFormatted);
    }
}
