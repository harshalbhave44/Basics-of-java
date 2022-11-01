import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<Integer, Character> hmap = new HashMap<Integer, Character>();
        hmap.put(1, 'a');
        hmap.put(2, 'r');
        hmap.put(3, 'p');
        hmap.remove(2);
        System.out.println("To check if particular key is present or not " + hmap.containsKey(3));
        System.out.println("To check if particular value is present or not " + hmap.containsValue(3));
        System.out.println("To check if hashMap is empty or not " + hmap.isEmpty());
        System.out.println("To check size of hashMap " + hmap.size());
        hmap.replace(3, 'h');
        System.out.println(hmap);
        Set set = hmap.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry mentry = (Map.Entry) itr.next();
            System.out.println(mentry.getKey());
            System.out.println(mentry.getValue());
        }
        hmap.clear();// To delete hashMap
        System.out.println(hmap.isEmpty());
    }
}
