package Lab_1;

import java.util.Scanner;

public class p4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        scanner.close();
        int t1 = 0, t2 = 1, nextTerm = 0;
        nextTerm = t1 + t2;

    while(nextTerm <= n) {
        System.out.println( nextTerm + ",");
        t1 = t2;
        t2 = nextTerm;
        nextTerm = t1 + t2;
    }
}
}
