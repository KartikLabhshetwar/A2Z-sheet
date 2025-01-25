

public class SecondLargestElement {

    static int[] secondLargestEle(int[] arr, int n){
        //brute force approach:
        //do bubble sort and get the values.
        //but the problem in this solution is it's take O(n^2) time and if there are duplicate values then it can show errors

        // for(int i = n-1; i >=0; i--){
        //     for(int j = 0; j <= i-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // int sl = arr[n-2];
        // int ss = arr[1];
        // int[] result = {sl, ss};
        // return result;

        //so, here is the optimized approach: this solution has O(n) time complexity.
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;

        //finding the second largest element from here:

        for(int i = 0; i < n; i++){
            if(arr[i] > l){
                sl = l;
                l = arr[i];
            } else if(arr[i] > sl && arr[i] != l){
                sl = arr[i];
            }
        }

        //finding the second smallest element from here:

        for(int i=0; i < n; i++){
            if(arr[i] < s){
                ss = s;
                s = arr[i];
            } else if(arr[i] < ss && arr[i] != s){
                ss = arr[i];
            }
        }

        int[] result = {sl, ss};

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4,5, 3, 6, 7};
        int n = arr.length;
        int[] result = secondLargestEle(arr, n);
        System.out.println("The second largest value is: " + result[0] + " and second smallest value is: " + result[1]);
        for(int i= 0; i < result.length; i++){
            System.out.print(result[i]+ " ");
        }
    }
}
