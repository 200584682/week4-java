import java.util.LinkedList;

public class CustomLinkedListDemo {  // Changed class name for uniqueness
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();  // Using a descriptive name for the LinkedList

        // Filling the LinkedList with a million integers
        for (int i = 0; i < 1000000; i++) {
            numberList.add(i);  // Adding values from 0 to 999999
        }

        // Measuring the time to read a value by index
        long startTime = System.nanoTime();
        int retrievedValue = numberList.get(500000);  // Getting the value at index 500000
        long endTime = System.nanoTime();
        System.out.println("LinkedList Read by Index Time: " + (endTime - startTime) + " ns");

        // Measuring the time to check if a value exists (Read by Value)
        startTime = System.nanoTime();
        boolean exists = numberList.contains(999999);  // Checking for the existence of the value 999999
        endTime = System.nanoTime();
        System.out.println("LinkedList Read by Value Time: " + (endTime - startTime) + " ns");

        // Measuring the time for insertion at the head
        startTime = System.nanoTime();
        numberList.addFirst(-1);  // Inserting -1 at the beginning
        endTime = System.nanoTime();
        System.out.println("LinkedList Insert at Head Time: " + (endTime - startTime) + " ns");

        // Measuring the time for insertion in the middle
        startTime = System.nanoTime();
        numberList.add(500000, -1);  // Inserting -1 in the middle at index 500000
        endTime = System.nanoTime();
        System.out.println("LinkedList Insert in Mid Time: " + (endTime - startTime) + " ns");

        // Measuring the time for insertion at the tail
        startTime = System.nanoTime();
        numberList.addLast(-1);  // Adding -1 at the end of the list
        endTime = System.nanoTime();
        System.out.println("LinkedList Insert at Tail Time: " + (endTime - startTime) + " ns");

        // Measuring the time for deletion from the head
        startTime = System.nanoTime();
        numberList.removeFirst();  // Removing the first element
        endTime = System.nanoTime();
        System.out.println("LinkedList Delete from Head Time: " + (endTime - startTime) + " ns");

        // Measuring the time for deletion from the middle
        startTime = System.nanoTime();
        numberList.remove(500000);  // Removing the element at index 500000
        endTime = System.nanoTime();
        System.out.println("LinkedList Delete from Mid Time: " + (endTime - startTime) + " ns");

        // Measuring the time for deletion from the tail
        startTime = System.nanoTime();
        numberList.removeLast();  // Removing the last element
        endTime = System.nanoTime();
        System.out.println("LinkedList Delete from Tail Time: " + (endTime - startTime) + " ns");
    }
}
