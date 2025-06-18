import java.util.HashSet;    // Not used here; can be removed if not required
import java.util.Iterator;   // Not used here; optional import
import java.util.HashMap;    // Importing HashMap for key-value pair storage

class HashMapOperationsDemo {
    public static void main(String[] args) {

        // Step 1: Create a HashMap with Integer keys and Character values
        HashMap<Integer, Character> map = new HashMap<>();

        // Step 2: Add initial key-value pairs
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.put(4, 'd');

        // Step 3: Print the current state of the map
        System.out.println(map);  // {1=a, 2=b, 3=c, 4=d}

        // Step 4: Check if a key exists in the map
        System.out.println(map.containsKey(2));  // true

        // Step 5: Check if a value exists in the map
        System.out.println(map.containsValue('a'));  // true

        // Step 6: Update the value of key 1 to 'c' (replaces 'a')
        map.put(1, 'c');
        System.out.println(map);  // {1=c, 2=b, 3=c, 4=d}

        // Step 7: Try to remove key 1 with incorrect value 'z' — will fail
        map.remove(1, 'z');
        System.out.println(map);  // remains unchanged

        // Step 8: Remove key 1 with correct value 'c' — will succeed
        map.remove(1, 'c');
        System.out.println(map);  // key 1 is removed

        // Step 9: Re-add key 1 with value 'a'
        map.put(1, 'a');
        System.out.println(map);  // key 1 is back

        // Step 10: Replace value of key 1 with 'b'
        map.replace(1, 'b');
        System.out.println(map);  // {1=b, ...}

        // Step 11: Remove key 1 with correct value 'b'
        map.remove(1, 'b');
        System.out.println(map);  // key 1 removed
    }
}
