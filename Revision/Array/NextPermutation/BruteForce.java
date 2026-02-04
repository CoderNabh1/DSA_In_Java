import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class BruteForce {

    public static void computePermute(int arr[]) {
        int krr[] = new int[arr.length];
        for (int i = 0; i < krr.length; i++) {
            krr[i] = arr[i];
        }
        Arrays.sort(krr);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];

        recurAnswer(freq, ans, ds, krr);
        System.out.println(ans);

        int index = ans.indexOf(Arrays.asList(arr));
        if (index + 1 < ans.size()) {
            System.out.println(ans.get(index + 1));
        }
    }

    public static void recurAnswer(boolean freq[], List<List<Integer>> ans, List<Integer> ds, int arr[]) {
        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                recurAnswer(freq, ans, ds, arr);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        computePermute(arr);
    }
}