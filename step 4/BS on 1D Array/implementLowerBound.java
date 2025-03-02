public class implementLowerBound {

    static int lowerBound(int[] arr, int x, int low, int high, int lb){
       if(low > high) return lb; 
       int mid = (low + high) / 2;

       if(arr[mid] >= x){
        lb = Math.min(lb, mid);
        return lowerBound(arr, x, low, mid - 1, lb);
       } else {
        return lowerBound(arr, x, mid+1, high, lb);
       }
    }


    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 3, 5};
        int lb = 2;
        int low = 0;
        int high = arr.length - 1;

        int result = lowerBound(arr, high, low, high, lb);
        System.out.println("The result is : "+ result);
    }
}