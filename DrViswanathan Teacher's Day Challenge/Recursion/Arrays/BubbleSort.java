import java.util.Arrays;
/*Bubble sort bole toh baju walr ko dekhna aur phirr swap kar dena aur aisa tab takk karna jab takk sabse bada sabse last na chale jayye.*/

public class BubbleSort {

    public static int[] sort(int arr[]) {
        int l = arr.length;
        logic(arr, l);
        return arr;
    }

    public static void logic(int arr[], int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        logic(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println("Original array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}