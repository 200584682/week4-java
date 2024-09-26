import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        // Fill HashSet with values
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }

        // Read by Value (search)
        long startTime = System.nanoTime();
        hashSet.contains(500000);
        long endTime = System.nanoTime();
        System.out.println("HashSet Read by Value Time: " + (endTime - startTime) + " ns");

        // HashSet doesn't support index-based access
        System.out.println("HashSet doesn't support Read by Index or Insert/Delete at specific positions.");

        // Insertion
        startTime = System.nanoTime();
        hashSet.add(-1);
        endTime = System.nanoTime();
        System.out.println("HashSet Insert Time: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        hashSet.remove(999999);
        endTime = System.nanoTime();
        System.out.println("HashSet Delete Time: " + (endTime - startTime) + " ns");
    }
}
