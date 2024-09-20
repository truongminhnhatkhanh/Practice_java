import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int width, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        height = sc.nextInt();
        System.out.println("The area of the rectangle is " + (width * height));
        System.out.println("The perimeter of the rectangle is " + (2 * width * height));
    }
}
