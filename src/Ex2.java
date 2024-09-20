
import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
        byte ASCIIcode;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        ASCIIcode = keyboard.nextByte();
        System.out.println("The ASCII code " + ASCIIcode + " is " + (char)ASCIIcode + ".");
    }
}


