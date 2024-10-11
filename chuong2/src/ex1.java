public class ex1 {
    public static void main(String[]args){
        System.out.println("Method 1: Character.isUpperCase");
        boolean a = Character.isUpperCase('A');
        System.out.println("is A uppercase ?" + " " + a);


        System.out.println("Method 2: Character.isLowerCase");
        boolean b = Character.isLowerCase('B');
        System.out.println("is b lowercase ?" + " " + b);


        System.out.println("Method 3: Character.toUpperCase");
        char c = Character.toUpperCase('c');
        System.out.println("uppercase c: " + c);


        System.out.println("Method 4: Character.toLowerCase");
        char d=Character.toLowerCase('D');
        System.out.println("lowercase D: " + d);


        System.out.println("Method 5: Character.isLetter");
        boolean e=Character.isLetter('1');
        System.out.println("is 1 a letter ?" + " " + e);


        System.out.println("Method 6: Character.isDigit");
        boolean f=Character.isDigit('f');
        System.out.println("is f a digit ?" + " " + f);


        System.out.println("Method 7: Character.isAlphabetic");
        boolean g=Character.isAlphabetic('G');
        System.out.println("is G alphabetic ?" + " " + g);


        System.out.println("Method 8: Character.isWhitespace");
        boolean h=Character.isWhitespace('H');
        System.out.println("is variable h a whitespace ?" + " " + h);


        System.out.println("Method 9: Character.getNumericValue");
        char i = 'I'; int j = Character.getNumericValue(i);
        System.out.println("numberic value of I=" + j);


        System.out.println("Method 10: Character.compare");
        char k = 'K'; char l = 'L'; int m=Character.compare(k,l);
        if(m==0){
            System.out.println(k + " is equal to " + l);
                 }
        else if(m<0){
            System.out.println(k + " is numerically greater than " + l); }
        else if(m>0){ System.out.println(k + " is numerically lesser than " + l);
        }
    }
}
