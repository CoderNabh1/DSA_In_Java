import java.util.ArrayList;
import java.util.Collections;

public class FractionalKnapsack {
    public static void main(String[] args) {
        double val[] = { 60, 100, 120 };
        double wt[] = { 10, 20, 30 };
        double capacity = 50;
        ArrayList<Double> frac = new ArrayList<>();
        double count = 0;
        double profit = 0;

        for (int i = 0; i < val.length; i++) {
            frac.add(val[i] / wt[i]);
        }

        while (capacity != count) {
            Double maxVal = Collections.max(frac);
            int index = frac.indexOf(maxVal);
            profit = profit + val[index];
            count = count + wt[index];
            frac.remove(index);
        }

        System.out.println(profit);
    }
}
