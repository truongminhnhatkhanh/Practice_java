package chuong3;

public class ex16 {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        do{
            System.out.println(a);
            a = a + b;
            b = b + 2;
        }
        while(a <= 10000);
}
}
