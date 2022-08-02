package studentMarksList;

import java.util.Scanner;

public class markcalculateMethods {
        static void myMethod() {
        int total = 0;
        String subjectList[] = {"Tamil", "English", "Maths", "Science", "Social"};
        for (int i = 0; i < subjectList.length; i++) {
            System.out.print("Enter the" + " " + subjectList[i] + " " + "mark" + ": ");
            Scanner scanner = new Scanner(System.in);
            int marks = scanner.nextInt();
            total = total + marks;
        }
        
        myTotal(total);
        average(subjectList,total);

    }


    static void myTotal(int total) {
        System.out.println("The Total marks : "+total);
    }
    static void average(String [] subject,int total){
        float average = (float)total/subject.length;
        System.out.println("The Average marks  : "+average);
    }
}
