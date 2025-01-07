package Lab_1;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = scanner.nextInt();
        System.out.println("The number entered is :" + a);
        scanner.close();
        if (a<2) {
            System.out.println("Number is not prime.");
        }
        for (int i=2; i <= a/2;) {
            if (a%i==0) {
                System.out.println(a + " is not a prime number.");
                break;
            }
            else {
                System.out.println(a + " is a prime number.");
                break;
            }
        }
    }
}
