
//This code is not working
import java.util.Arrays;

public class MergeSort {

    static int[] merge(int[] arr, int lower, int mid, int higher) {
        int b[] = new int[higher];
        int i = lower;
        int j = mid;
        int k = 0;
        while (i < lower && j < higher) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
        }
        if (i >= lower) {
            while (j < higher) {
                b[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i < lower) {
                b[k] = arr[i];
                i++;
                k++;
            }
        }
        return b;
    }

    static void mergesort(int[] arr, int lower, int higher) {
        int mid = 0;
        if (lower < higher) {
            mid = (lower + higher) / 2;
            mergesort(arr, lower, mid);
            mergesort(arr, mid + 1, higher);
            arr = merge(arr, lower, mid, higher);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 2, 1, 8, 9 };
        mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
}