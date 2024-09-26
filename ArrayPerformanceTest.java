public class ArrayPerformanceTest {
    public static void main(String[] args) {
        int numberOfElements = 1_000_000;  // Set the array size to 1 million
        int[] numbers = new int[numberOfElements];

        // Initialize the array with values from 0 to 999999
        for (int index = 0; index < numberOfElements; index++) {
            numbers[index] = index;
        }

        // Measure time taken to read an element by its index
        long startTime = System.nanoTime();
        int retrievedValue = numbers[500_000];  // Access the middle element
        long endTime = System.nanoTime();
        System.out.println("Time to Read by Index: " + (endTime - startTime) + " ns");

        // Measure time taken to find a value (search by value)
        startTime = System.nanoTime();
        for (int index = 0; index < numberOfElements; index++) {
            if (numbers[index] == 999_999) break;  // Search for the last element
        }
        endTime = System.nanoTime();
        System.out.println("Time to Search by Value: " + (endTime - startTime) + " ns");

        // Measure time taken to insert an element at the start
        startTime = System.nanoTime();
        System.arraycopy(numbers, 0, numbers, 1, numberOfElements - 1);  // Shift elements to the right
        numbers[0] = -1;  // Insert -1 at the beginning
        endTime = System.nanoTime();
        System.out.println("Time to Insert at Start: " + (endTime - startTime) + " ns");

        // Measure time taken to insert an element in the middle
        startTime = System.nanoTime();
        System.arraycopy(numbers, 500_000, numbers, 500_001, numberOfElements - 500_001);  // Shift elements
        numbers[500_000] = -1;  // Insert -1 in the middle
        endTime = System.nanoTime();
        System.out.println("Time to Insert in Middle: " + (endTime - startTime) + " ns");

        // Measure time taken to insert an element at the end
        startTime = System.nanoTime();
        numbers[numberOfElements - 1] = -1;  // Directly insert at the last position
        endTime = System.nanoTime();
        System.out.println("Time to Insert at End: " + (endTime - startTime) + " ns");

        // Measure time taken to delete the first element
        startTime = System.nanoTime();
        System.arraycopy(numbers, 1, numbers, 0, numberOfElements - 1);  // Shift elements left
        endTime = System.nanoTime();
        System.out.println("Time to Delete from Start: " + (endTime - startTime) + " ns");

        // Measure time taken to delete an element from the middle
        startTime = System.nanoTime();
        System.arraycopy(numbers, 500_001, numbers, 500_000, numberOfElements - 500_001);  // Shift elements
        endTime = System.nanoTime();
        System.out.println("Time to Delete from Middle: " + (endTime - startTime) + " ns");

        // Measure time taken to delete the last element
        startTime = System.nanoTime();
        numbers[numberOfElements - 1] = 0;  // Set last element to 0 (no shifting needed)
        endTime = System.nanoTime();
        System.out.println("Time to Delete from End: " + (endTime - startTime) + " ns");
    }
}
