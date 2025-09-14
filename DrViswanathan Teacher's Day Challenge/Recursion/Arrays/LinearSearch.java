public class LinearSearch {
    public static boolean check(int arr[], int index, int target) {
        if (arr[index] == target) {
            return true;
        } else if (index == arr.length - 1) {
            return false;
        }
        return check(arr, index + 1, target);
    }

    public static void main(String args[]) {
        int arr[] = { 12, 3, 4, 5, 6, 7, 8, 9 };
        if (check(arr, 0, 123)) {
            System.out.println("Target Found");
        } else {
            System.out.print("Target is not Found");
        }
    }
}