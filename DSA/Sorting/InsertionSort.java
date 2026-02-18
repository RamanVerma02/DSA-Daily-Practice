// InsertionSort    >> efficient for small data set
// T.C -> best O(n) , worst O(n^2)
public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int key = arr[i];  // element to select
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];   // right side shift
                j--;
            }
            arr[j+1] = key;  // insert at correct position
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,1,5,2,3};
        insertionSort(arr);
        for(int x :arr){
            System.out.print(x+" ");
        }
    }
}

/*
Advanced Optimization (Binary Insertion Sort)
-----------------------------------------------------------
We can reduce comparisons using binary search to find correct position.
But shifting cost remains O(n).

If interviewer asks:
---------------------------
Why do we use shifting instead of swapping in insertion sort?
Answer:
Because swapping makes more operations.
Shifting moves elements in bulk and is more efficient.
*/