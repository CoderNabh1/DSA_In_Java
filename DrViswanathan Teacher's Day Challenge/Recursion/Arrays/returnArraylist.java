import java.util.ArrayList;

public class returnArraylist {
    public static ArrayList<Integer> logic(int arr[], int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> answerBelow = logic(arr, index + 1, target);
        list.addAll(answerBelow);
        return list;
    }

    public static void main(String agrgs[]) {
        int arr[] = { 1, 2, 5, 4, 5 };
        System.out.println(logic(arr, 0, 5));
    }
}