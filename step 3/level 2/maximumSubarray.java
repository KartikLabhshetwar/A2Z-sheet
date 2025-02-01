public class maximumSubarray {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for(int i = 0; i < n ; i++){
            maxEndingHere += nums[i];

            if(maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
            }

            if(maxEndingHere < 0){
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("The maximum subarray with highest sum is: "+ result);

    }
}