// import java.util.ArrayList;

public class rearrangeArrayEle{

    static int[] solution(int[] arr){

        //brute force solution:
        /*
         the brute solution would be to iterate through the array and get the
         valid element and segregate our positive and negative elements in the
         qs it is told that all the positive numbers have even index and negative have odd
         so we can use this to our advantage.
         */

        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();

        // for(int i: arr){

        //     if( i >= 0){
        //         pos.add(i);
        //     } else {
        //         neg.add(i);
        //     }

        // }

        // for(int i = 0; i < arr.length; i++){
        //     if(i % 2 == 0){
        //         arr[i] = pos.get(i/2);
        //     } else {
        //         arr[i] = neg.get(i/2);
        //     }
        // }

        // return arr;

        //optimized approach would be to use two pointer.
        /*
         earlier the t.c was o(n) and s.c was o(n) we were using extra time
         so to optimize our time we would be using two pointer approach as
         we already know that the index of all +ve and -ve numbers which are
         even for +ve and odd for -ve numbers.
         so we can optimize our t.c to O(n) if we use this approach.
         */

        int n = arr.length;
        int[] ans = new int[n];
        int pos = 0, neg = 1;

        for(int i =0 ; i < n; i++){
            if(arr[i] >= 0){
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4};

        int[] result = solution(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }
}