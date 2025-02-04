import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutive{

    static int longestConsecutives(int[] nums){
        /* brute force solution will be to sort the element and then count the streak 
           here the time complexity will be O(n.log(N)).
           but my question asks me to give t.c of O(n).
          
        */
        // if(nums.length == 0){
        //     return 0;
        // }

        // Arrays.sort(nums);
        // int currentStreak = 1;
        // int longestStreak = 1;

        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] == nums[i-1]){
        //         continue;
        //     } else if(nums[i] == nums[i-1]+1){
        //         currentStreak++;
        //         longestStreak = Math.max(longestStreak, currentStreak);
        //     } else {
        //         currentStreak = 1;
        //     }
        // }

        // return longestStreak;


        /* so to tackle this i will be using hashset to get our optimize solution
         * due to using hashset our t.c will be O(n).
         * as hashset stores unique values in ascending order.
         */

         if(nums.length == 0) return 0;
         HashSet<Integer> set = new HashSet<>();

         for(int i: nums){
            set.add(i);
         }

         int longest = 0;

         for(int i: set){
            if(!set.contains(i-1)){
                int currNum = i;
                int currentStreak = 1;

                while(set.contains(currNum+1)){
                    currNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
         }

         return longest;

    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        int result = longestConsecutives(nums);

        System.out.println("the longest streak of consecutive number are: "+ result);
    }
}