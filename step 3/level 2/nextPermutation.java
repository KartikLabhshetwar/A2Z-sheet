public class nextPermutation {

    static void nextPermutations(int[] arr){
        int ind1 = -1;
        int ind2 = -1;

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                ind1 = i;
                break;
            }
        }

        if(ind1 == -1){
            reverse(arr, 0);
        } else{
            for(int i = arr.length-1; i >= 0; i--){
                if(arr[i] > arr[ind1]){
                    ind2 = i;
                    break;
                }
            }

            swap(arr, ind1, ind2);
            reverse(arr, ind1 + 1);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int start){
        int i = start;
        int j = arr.length - 1;
        while(i < j){
            swap(arr, i , j);
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,1,5};
        nextPermutations(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}


