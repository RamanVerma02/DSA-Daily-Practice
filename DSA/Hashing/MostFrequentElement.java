import java.util.HashMap;

public class MostFrequentElement {

    public static void mostfreq(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int maxfreq = 0;
        int result = arr[0];

        for(int key : map.keySet()){
            if(map.get(key) > maxfreq){
                maxfreq = map.get(key);
                result = key;
            }
        }

        System.out.println(result);
        // System.out.println(result+" "+map.get(result));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,3,1,1,4,6};
        mostfreq(arr);
    }
}
// TC & SC --> O(n)
