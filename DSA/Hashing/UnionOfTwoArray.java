import java.util.HashMap;
import java.util.HashSet;

public class UnionOfTwoArray {
    // Ooption 1 Best --> TC & SC : (n+m)  

    public static void byHashSet(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        int n = arr1.length;
        int m = arr2.length;

        for(int x : arr1) set.add(x);
        for(int x : arr2) set.add(x);

        System.out.println(set.size());

        for(int xx : set){
            System.out.print(xx+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        byHashSet(arr1,arr2);
    }
}


/*
 // Ooption 2 
    public static void byHashMap(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Storing arr1 Unique element
        for(int i=0; i<n; i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i], 1);
            }
        }
        // Storing arr2 Unique element
        for(int i=0; i<m; i++){
            if(!map.containsKey(arr2[i])){
                map.put(arr2[i], 1);
            }
        }
        System.out.println(map.size());
    }
*/