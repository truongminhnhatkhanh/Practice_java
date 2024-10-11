public class ex2 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("I'm");
        //Method 1
        sb.append(" sad");
        System.out.println(sb);
        // Method 2
        sb.insert(4,"so ");
        System.out.println(sb);
        // Method 3
        System.out.println(sb.delete(4, 7));
        // Method 4
        System.out.println(sb.lastIndexOf("s"));
        // Method 5
        System.out.println(sb.length());
        // Method 6
        System.out.println(sb.replace(0, 3, "He's"));
        // Method 7
        System.out.println(sb.reverse());
        // Method 8
        System.out.println(sb.capacity());
        // Method 9
        System.out.println(sb.indexOf("s"));
        // Method 10
        System.out.println(sb.substring(4));
        }
}
