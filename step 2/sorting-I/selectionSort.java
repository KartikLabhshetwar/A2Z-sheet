public class selectionSort {

    static void selectionSrt(int n, int[] arr){
        for(int i =0; i < n- 1; i++){
            int mini = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }

            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort: ");
        for(int i = 0; i < n ; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("Array before sorting: ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        selectionSrt(n, arr);


    }
}