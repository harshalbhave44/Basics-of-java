import java.util.*;

public class gfg {
    public static void main(String[] args) {
        int[] arr = { 54, 546, 548, 60, 9, 1234 };
        int max = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        String s = Integer.toString(max);
        int length = s.length();
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i : arr){
            
            hmap.put(i,);

        }
    }
}