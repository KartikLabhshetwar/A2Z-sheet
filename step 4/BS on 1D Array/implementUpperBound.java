public class implementUpperBound{

    static int upperBound(int[] arr, int x, int low, int high, int up){

        if(low > high){
            return up;
        }

        int mid = (low + high )/ 2;

        if(arr[mid] > x){
            up = mid;
            return upperBound(arr, x, low, mid-1, up);
        } else {
            return upperBound(arr, x, mid+1, high, up);
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 10};
        int target = 7;
        int up = arr.length;
        int low = 0;
        int high = arr.length - 1;

        int result = upperBound(arr, target, low, high, up);

        System.out.println("the result is: "+ result);

    }
}