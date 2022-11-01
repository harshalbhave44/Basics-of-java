import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        System.out.println("To check if arraylist is empty or not " + arr.isEmpty());// To check if arraylist is empty
                                                                                     // or
                                                                                     // not
        System.out.println("To check the size " + arr.size()); // To check the size
        System.out.println("To get the first element " + arr.get(1)); // To get the first element
        for (int i : arr) {
            System.out.println(i);
        }
        arr.set(1, 12342); // To change the first index

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(1234);
        a2.add(3453);
        a2.add(97889);

        arr.addAll(a2); // To add the complete arraylist to other arraylist

        for (int i : arr) {
            System.out.println(i);
        }
        Collections.sort(arr);
        System.out.println("After Sorting");
        for (int i : arr) {
            System.out.println(i);
        }
        Collections.sort(arr, Collections.reverseOrder()); // Sorting in descending order
        System.out.println("After Sorting in descending order");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Traversing using Iterator");
        Iterator itr = arr.iterator(); // Another way of traversing the arraylist
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
