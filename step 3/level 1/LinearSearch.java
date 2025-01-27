public class LinearSearch {

    static int linearSearch(int[] arr, int num){

       int i = 0;
       while( i < arr.length){
        if(arr[i] == num){
            return i;
        }
        i++;
       }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 7 ,8, 10};
        int num = 8;
        System.out.println("The index is: "+ linearSearch(arr, num));
    }
}
