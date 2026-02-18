import java.util.HashMap;

public class AllDuplicateElement {
    
    public static void duplicates(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        // ShortCut to check if array has duplicate 
        if(map.size() < arr.length)
            System.out.println("YES");

        // Get All Duplicate Element
        System.out.println("Duplicate Elements");
        for(int x : map.keySet()){
            if(map.get(x) > 1 ){
                System.out.println(x);
            }
        }

        int count=0;
        // Unique Element count
        for(int x : map.keySet()){
            if(map.get(x) == 1 ){
                count++;
            }
        }
        System.out.println("No of Unique Elements = "+count);

        // Element with minimum frequency
        int minfreq = Integer.MAX_VALUE;
        int ele = 0;
        for(int x : arr){
            if(map.get(x) <= minfreq){
                minfreq = map.get(x);
                ele = x;
            }
        }
        System.out.println("Element with minimum frequency = "+ele);

        // if minimum freq's element are > 1 than 
        for(int x : arr){
            if (map.get(x) == minfreq) {
                System.out.println("Element with minimum frequency = "+x);
            }
        }

    }

    // public static void freqSort(int[] arr){
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int x : arr){
    //         map.put(x, map.getOrDefault(x, 0)+1);
    //     }
    // }
    public static void main(String[] args) {    
        int[] arr = {1,2,3,5,2,3,1,1,4,6};
        duplicates(arr);
    }
}
