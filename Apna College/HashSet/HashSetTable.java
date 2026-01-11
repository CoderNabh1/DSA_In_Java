import java.util.HashSet;

public class HashSetTable {
    public static int findPair(int num[]) {
        HashSet<Integer> st = new HashSet<>();
        st.add(num[0]);
        int i = 1;
        int maxSize = 0;
        int size;
        while (!st.isEmpty()) {
            size = st.size();
            if (st.contains(num[i])) {
                st.remove(num[i]);
                i++;
            } else {
                st.add(num[i]);
                i++;
            }
            maxSize = Math.max(maxSize, size);
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 2, 3, 4, 4, 5, 7, 5, 7 };
        int arr[] = { 2, 1, 1, 3, 2, 3 };
        int ex[] = { 1, 1 };
        System.out.println(findPair(nums));
        System.out.println(findPair(arr));
        System.out.println(findPair(ex));
    }
}
