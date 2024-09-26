public class ArrayExample {
    public static void main(String[] args) {
        int size = 1000000;  // Adjusted for 1,000,000 elements
        int[] array = new int[size];

        // Fill array with values
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        // Read by Index
        long startTime = System.nanoTime();
        int value = array[500000];
        long endTime = System.nanoTime();
        System.out.println("Array Read by Index Time: " + (endTime - startTime) + " ns");

        // Read by Value
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            if (array[i] == 999999) break;
        }
        endTime = System.nanoTime();
        System.out.println("Array Read by Value Time: " + (endTime - startTime) + " ns");

        // Insertion at Head (shift elements)
        startTime = System.nanoTime();
        System.arraycopy(array, 0, array, 1, size - 1);  // Shift elements
        array[0] = -1;
        endTime = System.nanoTime();
        System.out.println("Array Insert at Head Time: " + (endTime - startTime) + " ns");

        // Insertion in Middle
        startTime = System.nanoTime();
        System.arraycopy(array, 500000, array, 500001, size - 500001);  // Shift elements
        array[500000] = -1;
        endTime = System.nanoTime();
        System.out.println("Array Insert in Mid Time: " + (endTime - startTime) + " ns");

        // Insertion at Tail
        startTime = System.nanoTime();
        array[size - 1] = -1;  // No shifting needed
        endTime = System.nanoTime();
        System.out.println("Array Insert at Tail Time: " + (endTime - startTime) + " ns");

        // Deletion from Head
        startTime = System.nanoTime();
        System.arraycopy(array, 1, array, 0, size - 1);  // Shift elements
        endTime = System.nanoTime();
        System.out.println("Array Delete from Head Time: " + (endTime - startTime) + " ns");

        // Deletion from Middle
        startTime = System.nanoTime();
        System.arraycopy(array, 500001, array, 500000, size - 500001);  // Shift elements
        endTime = System.nanoTime();
        System.out.println("Array Delete from Mid Time: " + (endTime - startTime) + " ns");

        // Deletion from Tail
        startTime = System.nanoTime();
        array[size - 1] = 0;  // No shifting needed
        endTime = System.nanoTime();
        System.out.println("Array Delete from Tail Time: " + (endTime - startTime) + " ns");
    }
}
