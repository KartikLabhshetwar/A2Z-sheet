public class insertionSort {
    static void insertionSrt(int n, int[] arr) {
        // Iterate through array starting from index 1
        for(int i = 0; i < n; i++) {
            int j = i;
            // Keep swapping elements until correct position is found
            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        
        // Print sorted array
        System.out.println("Array after insertion sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("Before sorting the array: ");
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        insertionSrt(n, arr);
    }
}
