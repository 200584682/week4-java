import java.util.ArrayList;

public class IntegerListPerformanceTest {  // Changed class name for better clarity
    public static void main(String[] args) {
        // Create an ArrayList to hold integer values
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Populate the ArrayList with integers from 0 to 999,999
        for (int i = 0; i < 1000000; i++) {
            numbersList.add(i);
        }

        // Measure time for reading an element by its index
        long startTime = System.nanoTime();
        int retrievedValue = numbersList.get(500000);  // Retrieve the value at index 500,000
        long endTime = System.nanoTime();
        System.out.println("Time taken to read from ArrayList by Index: " + (endTime - startTime) + " ns");

        // Measure time for checking if the ArrayList contains a specific value
        startTime = System.nanoTime();
        boolean exists = numbersList.contains(999999);  // Check if the value 999,999 exists
        endTime = System.nanoTime();
        System.out.println("Time taken to read from ArrayList by Value: " + (endTime - startTime) + " ns");

        // Measure time for inserting an element at the head of the ArrayList
        startTime = System.nanoTime();
        numbersList.add(0, -1);  // Insert -1 at index 0
        endTime = System.nanoTime();
        System.out.println("Time taken to insert into ArrayList at Head: " + (endTime - startTime) + " ns");

        // Measure time for inserting an element in the middle of the ArrayList
        startTime = System.nanoTime();
        numbersList.add(500000, -1);  // Insert -1 at index 500,000
        endTime = System.nanoTime();
        System.out.println("Time taken to insert into ArrayList in Middle: " + (endTime - startTime) + " ns");

        // Measure time for appending an element at the tail of the ArrayList
        startTime = System.nanoTime();
        numbersList.add(-1);  // Append -1 at the end
        endTime = System.nanoTime();
        System.out.println("Time taken to insert into ArrayList at Tail: " + (endTime - startTime) + " ns");

        // Measure time for deleting an element from the head of the ArrayList
        startTime = System.nanoTime();
        numbersList.remove(0);  // Remove the first element
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from ArrayList at Head: " + (endTime - startTime) + " ns");

        // Measure time for deleting an element from the middle of the ArrayList
        startTime = System.nanoTime();
        numbersList.remove(500000);  // Remove the element at index 500,000
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from ArrayList in Middle: " + (endTime - startTime) + " ns");

        // Measure time for deleting an element from the tail of the ArrayList
        startTime = System.nanoTime();
        numbersList.remove(numbersList.size() - 1);  // Remove the last element
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from ArrayList at Tail: " + (endTime - startTime) + " ns");
    }
}
