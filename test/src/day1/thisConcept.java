
// import java.awt.*;
import java.util.Date;
import java.util.ArrayList;

public class thisConcept {

    public static void main(String[] args) {
        int age = 22;
        Date today = new Date();

        System.out.println("HEllo World");
        System.out.println(age);

        Employee emp1 = new Employee("PS0001", "provility");

        System.out.println(today);

        emp1.count(age);
        emp1.show();
    }
}

class Employee {
    public String empName;
    public String empId;

    Employee(String id, String name) {
        this.empId = id;
        this.empName = name;
    }

    void show() {
        System.out.println(this.empId);
        System.out.println();
        System.out.println(this);
    }

    void count(int age) {
        ArrayList<Integer> a1 = new ArrayList<Integer>(age);
        for (int i = 1; i <= age; i++) {
            a1.add(i);
        }
        System.out.println(a1);
        System.out.println(a1.size()); // 30
    }
}