import java.util.HashMap;              // Importing HashMap to store key-value pairs
import java.util.Map.Entry;           // Importing Entry interface to access key-value pairs

class Main {
    public static void main(String[] args) {
        // Step 1: Create a HashMap with Integer keys and Character values
        HashMap<Integer, Character> map = new HashMap<>();

        // Step 2: Add key-value pairs to the map
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.put(5, 'd');

        // Step 3: Print key-value pairs using forEach() (Java 8+)
        System.out.println("Using forEach():");
        map.forEach((k, v) -> System.out.println(k + " " + v));

        // Step 4: Print the entire map directly
        System.out.println("Full Map: " + map);

        // Step 5: Use Entry set and for-each loop to access keys and values
        System.out.println("Using Entry Set:");
        for (Entry<Integer, Character> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
