public class maxConsecutiveOnes {

    static int maxConsecutiveOne(int[] arr){
        int count = 0;
        int count2 = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
                int maxConsecutive = Math.max(count, count2);
                count2 = maxConsecutive;
            } else{
                count = 0;
            }
        }

        return count2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1};
        System.out.println("The maximum consective one's are: "+ maxConsecutiveOne(arr));
    }
}
