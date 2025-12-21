import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegative {
    public static void findFirstNegative(int arr[], int w) {
        Queue<Integer> q = new LinkedList<>();
        if (w > arr.length) {
            System.out.println("Invalid Range");
            return;
        }
        for (int j = 0; j < arr.length - w + 1; j++) {
            for (int i = 0 + j; i < w + j; i++) {
                if (arr[i] < 0) {
                    q.add(i);
                    break;
                }
            }
            if (!q.isEmpty()) {
                if (q.peek() > j) {
                    q.add(q.peek());
                    j++;
                }
            }
        }
        System.out.println("First Negatives are:-");
        for (int num : q) {
            System.out.print(arr[num] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 3, -5, -3, -3, 5, 6, 4, 3, -8, -2, -1, 0, -1 };
        int krr[] = { 12, -1, -7, 8, 15, 30, -16, 28 };
        System.out.print("Enter Window Size:");
        int c = sc.nextInt();
        sc.close();
        System.out.println();
        findFirstNegative(krr, c);
    }
}