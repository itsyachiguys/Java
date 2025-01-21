package Lab_4;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        Person person = new Person(name, age, salary);

        System.out.println("Personal details: ");
        person.display();

        sc.close();
    }

}

class Person {
    String name;
    int age;
    int salary;
    public Person( String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
     public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
     }
    
}
