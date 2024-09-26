import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Fill LinkedList with values
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        // Read by Index
        long startTime = System.nanoTime();
        int value = linkedList.get(500000);
        long endTime = System.nanoTime();
        System.out.println("LinkedList Read by Index Time: " + (endTime - startTime) + " ns");

        // Read by Value
        startTime = System.nanoTime();
        linkedList.contains(999999);
        endTime = System.nanoTime();
        System.out.println("LinkedList Read by Value Time: " + (endTime - startTime) + " ns");

        // Insert at Head
        startTime = System.nanoTime();
        linkedList.addFirst(-1);
        endTime = System.nanoTime();
        System.out.println("LinkedList Insert at Head Time: " + (endTime - startTime) + " ns");

        // Insert in Mid
        startTime = System.nanoTime();
        linkedList.add(500000, -1);
        endTime = System.nanoTime();
        System.out.println("LinkedList Insert in Mid Time: " + (endTime - startTime) + " ns");

        // Insert at Tail
        startTime = System.nanoTime();
        linkedList.addLast(-1);
        endTime = System.nanoTime();
        System.out.println("LinkedList Insert at Tail Time: " + (endTime - startTime) + " ns");

        // Delete from Head
        startTime = System.nanoTime();
        linkedList.removeFirst();
        endTime = System.nanoTime();
        System.out.println("LinkedList Delete from Head Time: " + (endTime - startTime) + " ns");

        // Delete from Mid
        startTime = System.nanoTime();
        linkedList.remove(500000);
        endTime = System.nanoTime();
        System.out.println("LinkedList Delete from Mid Time: " + (endTime - startTime) + " ns");

        // Delete from Tail
        startTime = System.nanoTime();
        linkedList.removeLast();
        endTime = System.nanoTime();
        System.out.println("LinkedList Delete from Tail Time: " + (endTime - startTime) + " ns");
    }
}
