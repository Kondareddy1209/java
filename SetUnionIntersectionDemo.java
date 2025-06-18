  import java.util.HashSet;    // Step 1: Import HashSet for storing sets of integers
import java.util.Iterator;   // Step 2: (Optional) Import Iterator – not used here, can be removed

class SetUnionIntersectionDemo {  // Step 3: Class name that reflects the program's purpose
    public static void main(String[] args) {

        // Step 4: Create first HashSet and add integers
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        // Step 5: Create second HashSet and add integers
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(70);
        set2.add(60);
        set2.add(50);
        set2.add(80);

        // Step 6: Perform union of set and set2
        // This adds all elements of set2 into set
        set.addAll(set2);
        System.out.println("Union of set and set2: " + set);

        // Step 7: Perform intersection of set and set2
        // This modifies set to keep only elements also in set2
        set.retainAll(set2);
        System.out.println("Intersection of set and set2: " + set);
    }
}
