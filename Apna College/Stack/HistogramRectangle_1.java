import java.util.*;

class HistogramRectangle_1 {
    public static void calculate(int arr[]) {
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int minHeight = arr[i];
            for (int j = i; j < arr.length; j++) {
                minHeight = Math.min(minHeight, arr[j]);
                int area = minHeight * (j - i + 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        System.out.println("Max Histogram Area: " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3, 0, 2, 1, 5, 6, 2, 3 };
        calculate(arr);
    }
}