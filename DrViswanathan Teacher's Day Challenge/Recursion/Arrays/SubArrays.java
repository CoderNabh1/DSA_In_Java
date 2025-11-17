public class SubArrays {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        System.out.print("[");
        for (int j = 0; j < n; j++) {
            System.out.print("{");
            for (int k = 0 + j; k <= j; k++) {
                System.out.print(arr[k]);
            }
            System.out.print("},");
        }
        System.out.print("]");
    }
}
