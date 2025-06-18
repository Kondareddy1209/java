import java.util.HashMap;         // Importing HashMap to store character-frequency pairs
import java.util.Map.Entry;       // Importing Entry to iterate over the map

class Main {
    public static void main(String[] args) {
        // Step 1: Create a HashMap to store characters and their frequency
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 2: Define the input string
        String s = "helloworld";

        // Step 3: Traverse the string and update the frequency in the map
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 4: Print the raw map
        System.out.println("Character Frequencies: " + map);

        // Step 5: Print each key-value pair (character and count)
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        // Step 6: Initialize variables to track the most frequent character
        int max = 0;
        char cMax = '\u0000';  // Unicode null character as initial value

        // Step 7: Find the character with the highest frequency
        for (Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                cMax = e.getKey();
            }
        }

        // Step 8: Print the character with the highest frequency
        System.out.println("Most Frequent Character: " + cMax + " (Occurred " + max + " times)");
    }
}
