package Lab_5;
import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
    SalariedEmployee Emp = new SalariedEmployee();
    Emp.getdata();
    Emp.showdata();
    Emp.finalSalary();
    }
}

class Employee {
    String name;
    int num;
    int salary;
    String gender;
    Employee(String name, int num, String gender, int salary) {
        this.name = name;
        this.gender = gender;
        this.num = num;
        this.salary = salary;
    }
    public void showdata() {
        System.out.println("Employee details are as follow :");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Number : "  + num);
        System.out.println("Employee Gender : " + gender);
    }
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following Employee details : ");
        System.out.println("What is the name of the employee ?");
        name = sc.nextLine();
        System.out.println("What is the number of the employee ?");
        num = sc.nextInt();
        //to consume the new line as on hitting enter nextInt does'nt consume new line character
        sc.nextLine(); 
        System.out.println("What is the salary of the employee ?");
        salary = sc.nextInt();
        //to consume the new line as on hitting enter nextInt does'nt consume new line character
        sc.nextLine();
        System.out.println("What is the gender of the employee ?");
        gender = sc.nextLine();
        sc.close();
    }
}

class SalariedEmployee extends Employee {
    double hra;
    double da;
    SalariedEmployee() {
        super(null, 0, null, 0); // calls the base class
    }
    public void finalSalary() {
        if (gender.equalsIgnoreCase("female")) {
            hra = salary/100;
            da = (9*salary)/100;
        }
        else if (gender.equalsIgnoreCase("male")) {
            hra = salary/20;
            da = (9*salary)/100;
        } 
        else {
            System.out.println("Gender not valid.");
        }
        System.out.println("Calculated Allowances:");
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
    }
}