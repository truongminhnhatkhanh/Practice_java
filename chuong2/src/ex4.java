import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class ex4 {
    public static void main(String[] args) {
        //java.lang
        //1String
        String str = "Hello, World!";
        double num =-97;
        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt(int index)
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. substring(int beginIndex, int endIndex)
        System.out.println("Substring (0, 5): " + str.substring(0, 5));

        // 4. contains(CharSequence sequence)
        System.out.println("Contains 'World': " + str.contains("World"));

        // 5. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        //2.Math
        // 1. abs(double a)
        System.out.println("Absolute value: " + Math.abs(num));

        // 2. ceil(double a)
        System.out.println("Ceiling: " + Math.ceil(5.3));

        // 3. floor(double a)
        System.out.println("Floor: " + Math.floor(5.8));

        // 4. max(int a, int b)
        System.out.println("Max between 5 and 10: " + Math.max(5, 10));

        // 5. sqrt(double a)
        System.out.println("Square root of 16: " + Math.sqrt(16));

        //java.util
        //ArrayList;
        ArrayList<String> list = new ArrayList<>();

        // 1. add(E e)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List after adding elements: " + list);

        // 2. get(int index)
        System.out.println("Element at index 1: " + list.get(1));

        // 3. remove(int index)
        list.remove(1); // removes "Banana"
        System.out.println("List after removing element at index 1: " + list);

        // 4. size()
        System.out.println("Size of the list: " + list.size());

        // 5. clear()
        list.clear();
        System.out.println("List after clearing: " + list);

        //HasgMap
        HashMap<String, Integer> map = new HashMap<>();

        // 1. put(K key, V value)
        map.put("Apple", 1);
        map.put("Banana", 2);
        System.out.println("Map after adding elements: " + map);

        // 2. get(Object key)
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // 3. remove(Object key)
        map.remove("Banana");
        System.out.println("Map after removing key 'Banana': " + map);

        // 4. containsKey(Object key)
        System.out.println("Map contains 'Apple': " + map.containsKey("Apple"));

        // 5. size()
        System.out.println("Size of the map: " + map.size());




    }

}