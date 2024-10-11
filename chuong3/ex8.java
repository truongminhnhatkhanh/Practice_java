package chuong3;

public class ex8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        double average = sum / 100.0;
        System.out.println("Average: " + average);
    }
}
