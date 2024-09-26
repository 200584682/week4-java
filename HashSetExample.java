import java.util.HashSet;

public class UniqueHashSetExample {  // Changed class name for uniqueness
    public static void main(String[] args) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();  // Using a descriptive name for the HashSet

        // Filling the HashSet with a million integers
        for (int i = 0; i < 1000000; i++) {
            uniqueNumbers.add(i);
        }

        // Measuring the time to check if a value exists (Read by Value)
        long startTime = System.nanoTime();
        boolean exists = uniqueNumbers.contains(500000);  // Searching for the value 500000
        long endTime = System.nanoTime();
        System.out.println("HashSet Read by Value Time: " + (endTime - startTime) + " ns");

        // Important Note: HashSet does not support index-based access
        System.out.println("Note: HashSet doesn't support Read by Index or Insert/Delete at specific positions.");

        // Measuring the time for Insertion
        startTime = System.nanoTime();
        uniqueNumbers.add(-1);  // Inserting a new value
        endTime = System.nanoTime();
        System.out.println("HashSet Insert Time: " + (endTime - startTime) + " ns");

        // Measuring the time for Deletion
        startTime = System.nanoTime();
        uniqueNumbers.remove(999999);  // Removing a value from the HashSet
        endTime = System.nanoTime();
        System.out.println("HashSet Delete Time: " + (endTime - startTime) + " ns");
    }
}
