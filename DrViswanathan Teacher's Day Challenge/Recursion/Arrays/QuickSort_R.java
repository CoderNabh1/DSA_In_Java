import java.util.Arrays;
import java.util.Random;

public class QuickSort_R {
    public static void sort(int arr[]) {
        if (arr == null || arr.length == 0) {
            return;
        }

        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static int partition(int arr[], int start, int end) {
        Random rand = new Random();
        int RandomPivotIndex = rand.nextInt(end - start + 1) + start;

        swap(arr, RandomPivotIndex, end);

        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);

        return i + 1;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5, 12, 4 };

        System.out.println("Original array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}
