import java.util.HashMap;

public class twoSum {

    static int[] twoSumfunc(int[] nums, int target){
        // int n = nums.length;
        //brute force approach: t.c O(n^2).
        // for(int i = 0; i < n; i++){
        //     for(int j = i+1; i < n ; i++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i, j}; 
        //         }
        //     }
        // }

        // return new int[]{};

        //more optimized solution where i am going to use hashmap for it.

        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};

    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSumfunc(nums, target);

        for(int i: result){
            System.out.print( i+ " ");
        }
    }
}