import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string you want to update : ");
        String a = scanner.nextLine();
        System.out.println("Enter the old string you want to replace : ");
        String b = scanner.nextLine();
        System.out.print("Enter the new string for updation : ");
        String c = scanner.nextLine();
        scanner.close();
        String d = b.replace(a,c);
        System.out.println("" + d);
    }
    
}