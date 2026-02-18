public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int comparison=0;
        int swaps=0;
        boolean swapped;

        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-1-i; j++){
                comparison++;  // counting comparison
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                    swaps++;  // counting swap
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("Comparison: "+comparison);
        System.out.println("Swapped: "+swaps);
    }
    public static void main(String[] args) {
        int[] arr = {7,9,8,2,5};
        bubbleSort(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    // TC -- O(n^2)
}



/*




<--Final TC Summary Table -->
Case	        Time Complexity

Best Case       	O(n)
Average Case        O(n²)
Worst Case      	O(n²)

-if arr is given like 1,2,3,5,4 ya jisme kewal ek hi line element ko sort karna ho 
toh us case me TC --> O(n)


*/