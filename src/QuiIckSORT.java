public class QuiIckSORT {
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int findPivotElement(int[] arr, int lower, int higher) {
        int pivotElement = arr[lower];
        int index = lower;
        lower = lower + 1;
        while (lower < higher) {
            while (arr[lower] < pivotElement) {
                lower++;
            }
            while (arr[higher] > pivotElement) {
                higher--;
            }
            swap(arr, lower, higher);
            lower++;
            higher--;
        }
        swap(arr, index, higher);
        return lower;

    }

    static void quickSort(int[] arr, int lower, int higher) {
        int pivot = findPivotElement(arr, lower, higher);
        quickSort(arr, lower, pivot);
        quickSort(arr, pivot + 1, higher);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
