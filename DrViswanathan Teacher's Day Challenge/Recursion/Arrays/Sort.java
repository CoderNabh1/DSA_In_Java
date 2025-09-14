public class Sort {
    static boolean CheckSort(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] > arr[index + 1] && CheckSort(arr, index + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, 0 };
        if (CheckSort(arr, 0)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
}
