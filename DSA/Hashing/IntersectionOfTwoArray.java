import java.util.HashSet;

// Only Common element to display
public class IntersectionOfTwoArray {

    public static void intersect(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr2.length;
        
        for (int x : arr1)
            set.add(x);

        for (int i = 0; i < n; i++) {
            if (set.contains(arr2[i])) {
                System.out.println(arr2[i]);
                set.remove(arr2[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        intersect(arr1, arr2);
    }
}
