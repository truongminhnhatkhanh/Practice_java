import java.util.Scanner;

public class SoKiTu {
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        string = sc.nextLine();
        System.out.println("The string have " + String.valueOf(string.length()) + " characters");

    }
}
