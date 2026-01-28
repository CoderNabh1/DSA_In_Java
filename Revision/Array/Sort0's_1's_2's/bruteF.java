import java.util.Scanner;

public class bruteF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int z = 0;
        int o = 0;
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                z++;
            } else if (arr[i] == 1) {
                o++;
            } else {
                t++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (z != 0) {
                arr[i] = 0;
                z--;
            } else if (o != 0) {
                arr[i] = 1;
                o--;
            } else {
                arr[i] = 2;
                t--;
            }
        }
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
