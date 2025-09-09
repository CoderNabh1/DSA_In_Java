public class ReversingArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int temp = arr[0];
        int temp_2 = arr[1];
        arr[0] = arr[n - 1];
        arr[n - 1] = arr[n - 2];
        arr[n - 2] = arr[n - 3];
        arr[n - 3] = temp_2;
        arr[1] = temp;
        System.out.println(arr);
    }
}
