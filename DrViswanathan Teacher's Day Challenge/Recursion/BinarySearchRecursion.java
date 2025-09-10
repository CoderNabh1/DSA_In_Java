public class BinarySearchRecursion {
    public static int BinarySearch(int arr[], int target) {
        return BinarySearchLogic(arr, target, 0, arr.length - 1);
    }

    public static int BinarySearchLogic(int arr[], int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        } else if (arr[mid] == target) {
            return mid + 1;
        } else if (target > arr[mid]) {
            return BinarySearchLogic(arr, target, mid + 1, end);
        } else {
            return BinarySearchLogic(arr, target, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int result = BinarySearch(arr, 4);
        if (result != -1) {
            System.out.print("Your target is at:" + result);
        } else {
            System.out.println("Target is not present");
        }
    }
}