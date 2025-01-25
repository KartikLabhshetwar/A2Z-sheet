

public class LargestElementArray{

    static int largestElement(int[] arr, int n){
        int max = 0;
        for(int i = 0; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 4, 8, 4, 3, 10};
        int n = arr.length;

        System.out.println("The largest element in an array is: "+ largestElement(arr, n));

    }
}