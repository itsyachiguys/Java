package Lab_2;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements :");
        int a = scanner.nextInt();

        double[] nums = new double[a];

        System.out.println("Enter the numbers:");
        for (int i=0; i<a; i++) {
            nums[i] = scanner.nextDouble();
        }
        
        double sum=0;
        for (int i=0; i<a; i++) {
            sum+= nums[i];
        }

        double average = sum/a;
        System.out.println("The average is: " + average);

        scanner.close();
    }
}
