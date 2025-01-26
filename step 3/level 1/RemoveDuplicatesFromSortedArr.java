public class RemoveDuplicatesFromSortedArr {

    static int removeDuplicateFromSortedArr(int[] arr){
        int j = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int result = removeDuplicateFromSortedArr(arr);
        System.out.println("The solution is: "+result);

    }
}
