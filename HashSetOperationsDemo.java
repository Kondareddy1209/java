import java.util.HashSet;     // Step 1: Import the HashSet class from java.util package
import java.util.Iterator;    // Step 2: Import the Iterator interface for iterating through the set

class Main {
    public static void main(String[] args) {
        // Step 3: Create a new HashSet to store Integer values
        HashSet<Integer> set = new HashSet<>();

        // Step 4: Add elements to the HashSet
        // HashSet does not allow duplicates and does not guarantee insertion order
        set.add(0);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);

        // Step 5: Print the original HashSet
        System.out.println("Original Set: " + set);

        // Step 6: Remove the element '60' from the set
        set.remove(60);

        // Step 7: Print the set after removing an element
        System.out.println("After Removing 60: " + set);

        // Step 8: Check if the set contains the value 50
        System.out.println("Does the set contain 50? " + set.contains(50));

        // Step 9: Check if the set is empty
        System.out.println("Is the set empty? " + set.isEmpty());

        // Step 10: Iterate over the set using an Iterator
        System.out.println("Using Iterator:");
        Iterator it = set.iterator();  // Create an iterator for the set
        while (it.hasNext()) {         // Loop until all elements are iterated
            System.out.println(it.next());  // Print each element
        }

        // Step 11: Iterate over the set using a for-each loop
        System.out.println("Using For-Each Loop:");
        for (int a : set) {
            System.out.println(a);
        }

        // Step 12: Iterate using the Java 8 forEach() method with lambda expression
        System.out.println("Using forEach() Method:");
        set.forEach(value -> System.out.println(value));  // Functional-style iteration
    }
}
