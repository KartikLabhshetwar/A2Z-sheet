public class BinarySearch {

    static int recursiveBS(int[] arr, int low, int high, int target){
        if(low > high){
            return -1;
        }

        int mid = (low + high) / 2;

        if(target == arr[mid]) return mid;

        if(target > arr[mid]){
            return recursiveBS(arr, mid+1, high, target);
        } else {
            return recursiveBS(arr, low, mid-1, target);
        }

    }
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;

        int low = 0;
        int high = arr.length -1;

        int result = recursiveBS(arr, low, high, target);

        System.out.println("the result is: "+ result);
    }
}