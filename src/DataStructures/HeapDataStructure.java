
//This code contains implementation of Max Min Heap using Priority Queue
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDataStructure {
    public void minSort(int[] arr) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            p.add(arr[i]);
        }
        while (!p.isEmpty()) {
            System.out.println(p.poll());
        }
    }

    public void maxSort(int[] arr) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            p.add(arr[i]);
        }
        while (!p.isEmpty()) {
            System.out.println(p.poll());
        }
    }

    public static void main(String[] args) {
        HeapDataStructure h = new HeapDataStructure();
        int arr[] = { 5, 4, 9, 12, 1, 2, 7 };
        h.minSort(arr);
        System.out.println("--------------------------------");
        h.maxSort(arr);

    }
}