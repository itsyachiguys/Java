package Lab_1;

import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        if (a>b) { 
            if (a>c) {
                System.out.println(a + " is the largest number.");
            }
        }
        else if (b>c) {
            System.out.println(b + " is the largest number.");
        }
        else {
            System.out.println( c + " is the largest number.");
        }
    }
}
