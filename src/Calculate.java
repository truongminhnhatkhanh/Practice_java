import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        n = sc.nextInt();
        System.out.println("sin(n) = " + Math.sin(n));
        System.out.println("cos(n) = " + Math.cos(n));
        System.out.println("sqrt(n) = " + Math.sqrt(n));
    }
}
