import java.util.HashMap;

public class LongestSubArrayWithSumK {

    static int longestSubArraySumK(int[] nums, int k){
        
        //solution 1 using hashmap:
        // the solution 1 can be used for both positive and negative elements in an array. so, if they are asking you to find
        // longestsubarray length in an array then use this solution. this is much better.
        HashMap <Long, Integer> preMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }

            long rem = sum - k;

            if(preMap.containsKey(rem)){
                int len = i - preMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if(!preMap.containsKey(sum)){
                preMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;

        int len = longestSubArraySumK(nums, k);
        System.out.println("The length of the longest Subarray is: "+len);
    }
}
