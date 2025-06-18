import java.util.HashSet;    // Importing HashSet for storing unique characters
import java.util.Iterator;   // (Optional here) Importing Iterator — not used in this code

class Main {
    public static void main(String[] args) {
        // Step 1: Create an empty HashSet to store unique characters
        HashSet<Character> set = new HashSet<>();

        // Step 2: Define the input string
        String s = "hello World";

        // Step 3: Initialize a variable to hold the first repeating character
        // '\u0000' is the default null character in Java
        char repeat = '\u0000';

        // Step 4: Convert the string to a character array and iterate through it
        for (char ch : s.toCharArray()) {

            // Step 5: Check if the current character is already in the set
            if (set.contains(ch)) {
                // If it is, then it's the first repeating character
                repeat = ch;

                // Step 6: Break out of the loop after finding the first repeat
                break;
            } else {
                // If not, add the character to the set
                set.add(ch);
            }
        }

        // Step 7: Print the first repeating character
        // If no character is repeated, it will print the null character (non-printable)
        System.out.println("First Repeating Character: " + repeat);
    }
}
