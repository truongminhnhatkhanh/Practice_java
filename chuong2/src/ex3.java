import java.util.Random;
import java.util.stream.DoubleStream;

public class ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        //Method 1
        boolean m1 = rand.nextBoolean();
        System.out.println("m1 random boolean: " + m1);
        //Method 2
        int m2 = rand.nextInt();
        System.out.println("m2 random int: " + m2);
        //Method 3
        long a =5;
        DoubleStream m3 = rand.doubles(a);
        m3.forEach(System.out::println);
        //Method 4
        double m4 = rand.nextDouble();
        System.out.println("m4 random double: " + m4);
        //Method 5
        float m5 = rand.nextFloat();
        System.out.println("m5 random float: " + m5);
        //Method 6
        long m6 = rand.nextLong();
        System.out.println("m6 random number very long: " + m6);
        //Method 7
        double m7 = rand.nextExponential();
        System.out.println("m7 random exponential: " + m7);
        //Method 8
        double m8 = rand.nextGaussian();
        System.out.println("m8 random something: " + m8);
        //Method 9
        int m9 = rand.nextInt(-10,10);
        System.out.println("m9 random -10 to 10: " + m9);
        //Method 10
        int m10 = rand.nextInt();
        System.out.println("m10 random int with bound: " + m10);
    }
}
