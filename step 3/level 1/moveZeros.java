public class moveZeros{

    static void moveZ(int[] nums){
        int n = nums.length;

        int j = -1;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return;
        }

        for(int i = j+1; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int n = nums.length;

        System.out.println("The array before: ");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();

        System.out.println("The array after: ");
        moveZ(nums);
        for(int a: nums){
            System.out.print(a + " ");
        }
    }
}