public class SearchInsertPosition {

    static int searchInsert(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        //we will use the lower bound logic here which i didn't got earlier now i understood it somewhat.
        int ans = arr.length;

        while (low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        int[] arr = { 1, 3, 5, 6};
        int target = 7;

        int result = searchInsert(arr, target);

        System.out.println("The result is: "+ result);
    }
}
