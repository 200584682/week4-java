import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Fill ArrayList with values
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        // Read by Index
        long startTime = System.nanoTime();
        int value = arrayList.get(500000);
        long endTime = System.nanoTime();
        System.out.println("ArrayList Read by Index Time: " + (endTime - startTime) + " ns");

        // Read by Value
        startTime = System.nanoTime();
        arrayList.contains(999999);
        endTime = System.nanoTime();
        System.out.println("ArrayList Read by Value Time: " + (endTime - startTime) + " ns");

        // Insert at Head
        startTime = System.nanoTime();
        arrayList.add(0, -1);
        endTime = System.nanoTime();
        System.out.println("ArrayList Insert at Head Time: " + (endTime - startTime) + " ns");

        // Insert in Mid
        startTime = System.nanoTime();
        arrayList.add(500000, -1);
        endTime = System.nanoTime();
        System.out.println("ArrayList Insert in Mid Time: " + (endTime - startTime) + " ns");

        // Insert at Tail
        startTime = System.nanoTime();
        arrayList.add(-1);
        endTime = System.nanoTime();
        System.out.println("ArrayList Insert at Tail Time: " + (endTime - startTime) + " ns");

        // Delete from Head
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        System.out.println("ArrayList Delete from Head Time: " + (endTime - startTime) + " ns");

        // Delete from Mid
        startTime = System.nanoTime();
        arrayList.remove(500000);
        endTime = System.nanoTime();
        System.out.println("ArrayList Delete from Mid Time: " + (endTime - startTime) + " ns");

        // Delete from Tail
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        endTime = System.nanoTime();
        System.out.println("ArrayList Delete from Tail Time: " + (endTime - startTime) + " ns");
    }
}
