import java.util.HashSet;

public class HashSet_Intro {
    public static void main(String args[]) {
        int arr[] = { 100, 1, 2, 3, 200, 99, 23, 45 };
        // Output should be 4 (because of sequence: 99, 100) -> Wait, 1,2,3 is len 3.
        // 99, 100 is len 2.
        // Actually, looking at the data: 1, 2, 3 (len 3). 99, 100 (len 2).
        // Max length is 3.

        HashSet<Integer> st = new HashSet<>();
        for (int num : arr) {
            st.add(num);
        }

        int maxCount = 0; // Initialize to 0, not MIN_VALUE

        for (int num : st) { // Iterate over the SET, not the array (optimization)
            // 1. Check if this number is the "start" of a sequence
            // If the set contains (num - 1), then 'num' is NOT the start.
            if (!st.contains(num - 1)) {

                int currentNum = num;
                int currentCount = 1; // Start count at 1 (for the number itself)

                // 2. Look for the next numbers in the sequence (num+1, num+2...)
                while (st.contains(currentNum + 1)) {
                    currentNum++;
                    currentCount++;
                }

                // 3. Update global max
                maxCount = Math.max(maxCount, currentCount);
            }
        }

        System.out.println("Longest Consecutive Sequence Length: " + maxCount);
    }
}