package chuong3;

public class ex9 {
    public static void main(String[] args) {
        int num= 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                num = i;
            }
        }
        System.out.println("Largest number divisible by 7: " + num);

    }
}
