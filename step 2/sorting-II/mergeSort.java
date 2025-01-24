public class mergeSort{

    static void merge(int[] arr, int low, int mid, int high){

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = arr[low + i];
        }

        for(int j = 0; j < n2; j++){
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = low;

        while (i < n1 && j < n2) {
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
    }

    static void mergeSrt(int[] arr, int low, int high){
        if(low >= high) {
            return;
        }

        int mid = low + ((high - low) / 2);

        mergeSrt(arr, low, mid);
        mergeSrt(arr, mid+1, high);
        merge(arr, low, mid, high);

    }

    public static void main(String[] args) {
        // int[] arr = {4,2,1,6,7};
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        int n = arr.length;

        System.out.println("Array before sorting: ");
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        mergeSrt(arr, 0, n-1);

        System.out.println("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}