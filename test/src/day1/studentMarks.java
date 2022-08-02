
import javax.security.auth.Subject;
import java.util.Scanner;

public class studentMarks {
    public static void main(String args[]){
        Scanner Scanner = new Scanner((System.in));

        System.out.println("subject1: ");
        byte mark1 = Scanner.nextByte();
        System.out.println("Tamil="+ mark1);

        System.out.println("subject2: ");
        byte mark2 = Scanner.nextByte();
        System.out.println("English="+ mark2);

        System.out.println("subject3: ");
        byte mark3 = Scanner.nextByte();
        System.out.println("Maths="+ mark3);

        System.out.println("subject4: ");
        byte mark4 = Scanner.nextByte();
        System.out.println("Science="+ mark4);

        System.out.println("subject5: ");
        byte mark5 = Scanner.nextByte();
        System.out.println("Social="+ mark5);


        int Sum = mark1+mark2+mark3+mark4+mark5;
        System.out.println("TotalMarks = " + Sum);
        System.out.println("AverageValue = " +((Sum) / 5));
    }
}
