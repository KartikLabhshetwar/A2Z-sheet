

public class sortColors {

    static void sortColor(int[] nums){
        int zeros = 0, ones = 0;

        for(int num: nums){
            if(num == 0){
                zeros++;
            } else if(num == 1){
                ones++;
            }
        }

        for(int i = 0; i < zeros; i++){
            nums[i] = 0;
        }

        for(int i = zeros; i < zeros+ones; i++){
            nums[i] = 1;
        }

        for(int i= zeros+ones; i < nums.length; i++){
            nums[i] = 2;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        sortColor(nums);
        for(int i: nums){
            System.out.print(i+ " ");
        }

    }
}
