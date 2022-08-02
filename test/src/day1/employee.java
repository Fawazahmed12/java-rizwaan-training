public class employee {
    private String empId;
    private String empName;
    public static void main(String[] args) {

        employee emp1=new employee("P001","fawaz");
        emp1.print();

    }
    employee (String id,String name){
        this.empId=id;
        this.empName=name;
    }

    void print(){
        System.out.println(this.empId);
        System.out.println(this.empName);
    }
}



