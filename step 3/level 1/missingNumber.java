public class missingNumber {
    static int missingNum(int[] arr){
        int n = arr.length;

        int sum = 0;

        for(int i = 0; i < n ; i++){
            sum += arr[i];
        }

        int sum2 = (n * (n+1)) / 2;

        int missingValue = sum2 - sum;
        
        return missingValue;

    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println("The missing number is: "+ missingNum(arr));
    }
}