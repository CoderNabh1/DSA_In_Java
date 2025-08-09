import java.util.HashMap;
import java.util.Scanner;

public class NextRound {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int k_place = sc.nextInt();
        int count = 0;
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (int i = 1; i <= input; i++) {
            int num = sc.nextInt();
            nums.put(i, num);
        }
        int k = nums.get(k_place);
        for (int i = 1; i <= input; i++) {
            if (nums.get(i) >= k && nums.get(i) > 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}