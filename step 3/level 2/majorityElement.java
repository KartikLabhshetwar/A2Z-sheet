import java.util.HashMap;
import java.util.Map;

public class majorityElement {

    static int majorityEle(int[] nums){
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int n = nums.length / 2;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > n){
                return entry.getKey();
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        int result =  majorityEle(nums);
        
        System.out.println("The majority element in the array is : "+ result);

    }
}
