import java.util.HashMap;

public class MajorityElement {

    public static void freq(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Storing Unique Key with frequency
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // getting key which have frequency > n/3
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3)
                System.out.println(key);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        freq(arr);
    }
}
// TC & SC : O(n)