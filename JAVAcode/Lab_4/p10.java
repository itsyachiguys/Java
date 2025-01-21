package Lab_4;
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        System.out.println("Enter salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter the Designation : ");
        String designation = sc.next();
        System.out.println("Enter Basic Pay : ");
        int basicpay = sc.nextInt();

        employee Emp = new employee(name, salary, designation, basicpay, salary, basicpay);

        System.out.println("Employee details are : ");
        Emp.display();
        sc.close();
    }
}

class employee {
    String name;
    int salary;
    String designation;
    int basicpay;
    float hra;
    float da;
    employee(String name, int salary, String designation, int basicpay, float hra, float da) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.basicpay = basicpay;
        this.hra = basicpay/10;
        this.da = (45*basicpay)/100;
    }
    public void display() {
        System.out.println("Name : " + name); 
        System.out.println("Salary :" + salary);
        System.out.println("Designation : " + designation);
        System.out.println("Basic Pay : " + basicpay);
        System.out.println("HRA is : " + hra);
        System.out.println("DA is : " + da);
    }
}