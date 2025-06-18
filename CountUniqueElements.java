import java.util.HashSet;    // Step 1: Import HashSet to store only unique elements
import java.util.Iterator;   // Step 2: Import Iterator (optional here, not used)

class CountUniqueElements {   // Step 3: Class name reflects the purpose
    public static void main(String[] args) {

        // Step 4: Declare and initialize an array with some duplicate values
        int[] arr = {1, 2, 3, 4, 1, 2, 5, 6};

        // Step 5: Create a HashSet to store only unique elements
        HashSet<Integer> set = new HashSet<>();

        // Step 6: Loop through the array and add each element to the HashSet
        // Duplicates will be ignored automatically
        for (int a : arr) {
            set.add(a);
        }

        // Step 7: Print the size of the HashSet which represents the number of unique elements
        System.out.println("Number of unique elements: " + set.size());
    }
}
