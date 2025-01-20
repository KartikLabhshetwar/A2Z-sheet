public class reverseArray {

    static void printArr(int arr[], int n){
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void revArray(int arr[], int start, int end){
        if(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            revArray(arr, start+1, end-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = 5;
        revArray(arr, 0, n-1);
        printArr(arr, n);

    }
}
