import java.util.HashMap;

public class FirstNonRepetive {

        public static void firstNonRepetive(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        // adding the element with value
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        // now printing element which came first 
        for(int x : arr){
            if(map.get(x) == 1){
                System.out.println(x);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,3,1,1,4,6};
        firstNonRepetive(arr);
    }
}
// TC & SC --> O(n)