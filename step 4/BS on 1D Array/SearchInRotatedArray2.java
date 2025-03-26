public class SearchInRotatedArray2 {

    public static boolean search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                return true;
            }

            if(nums[mid] > nums[low] || nums[mid] > nums[high]){
                if(target < nums[mid] && target >= nums[low]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < nums[low] || nums[mid] < nums[high]){
                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                high--;
            }
        }
         return false;
    }
    public static void main(String[] args){
        int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
        int target = 2;

        boolean result = search(nums, target);

        System.out.println(result);
    }
}
