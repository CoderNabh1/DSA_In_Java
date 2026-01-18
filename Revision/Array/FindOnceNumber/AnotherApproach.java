package Revision.Array.FindOnceNumber;

import java.util.HashMap;
import java.util.Map;

public class AnotherApproach {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6 };
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];

            if (freq.containsKey(currentNum)) {
                freq.put(currentNum, freq.get(currentNum) + 1);
            } else {
                freq.put(currentNum, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("The number appearing once is: " + entry.getKey());
                break;
            }
        }
    }
}
