public class SelectionSort {
    public static int[] logic(int arr[]) {
        int start = 0;
        int end = arr.length;
        sort(arr, start, end);
    }

    public static int[] sort(int arr[], int start, int end) {
        if (start >= end) {
            return arr;
        }
        for (int i = 0; i < end; i++) {
            int max = Integer.MIN_VALUE;
            int index = 0;

            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
    }

}
