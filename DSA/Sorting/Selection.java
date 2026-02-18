// Selection Sort  || Time Complexity --> O(n^2) || S.C-> O(1)
public class Selection {
    public static void selectionSort(int[] arr){
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for(int i=0; i<n-1; i++){
            // Assume the minimum element is at index i
            int minIndex = i;
            // Find the minimum element in unsorted part
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap the found minimum element with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,1,5,2,3};
        selectionSort(arr);
        for(int x :arr)
            System.out.print(x+" ");
    }
}


/*
Rule yaad rakh:
👉 har pass mein minimum element ka index dhoondho
👉 end mein sirf ek swap

Swaps ki baat (interview favourite 💯)
Selection Sort
Max swaps = n − 1
Isliye jab swap costly ho, selection sort better hota hai


🎯 Interview Answer (direct bol sakta hai)

“Selection sort ka time complexity best, average aur worst case mein O(n²) hota hai kyunki har pass mein poora unsorted part scan hota hai.
Space complexity O(1) hoti hai kyunki ye in-place algorithm hai.”
*/