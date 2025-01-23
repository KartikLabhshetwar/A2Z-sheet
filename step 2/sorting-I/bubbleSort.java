

public class bubbleSort {
    
    static void bubbleSrt(int n, int[] arr){
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Array after bubble sort: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;

        System.out.println("Array before sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        bubbleSrt(n, arr);
    }
}
