import java.util.HashSet;    // (Optional) Used if working with unique sets (not needed here)
import java.util.Iterator;   // (Optional) Iterator - not used here
import java.util.HashMap;    // Import HashMap to store character-frequency pairs
import java.util.Map.Entry;  // Import Entry to iterate over map entries if needed

class Main {
    public static void main(String[] args) {

        // Step 1: Create a HashMap to store character as key and its frequency as value
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 2: Define the input string
        String s = "helloworld";

        // Step 3: Traverse each character in the string
        for (char ch : s.toCharArray()) {
            // Step 4: Use getOrDefault to increment frequency or start from 1
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 5: Print the entire map (unsorted)
        System.out.println("HashMap (Raw Output): " + map);

        // Step 6: Print each key-value pair using forEach and lambda
        System.out.println("Formatted Character Frequencies:");
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
