import java.util.ArrayList;
import java.util.HashSet;

public class unionOfTwoSortedArr {

    static ArrayList<Integer> sortedArray(int[] arr1, int[] arr2){
        HashSet <Integer> s = new HashSet<>();
        ArrayList <Integer> Union = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            s.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            s.add(arr2[i]);
        }

        for(int i: s){
            Union.add(i);
        }

        return Union;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        System.out.println("the values are: ");
        for(int i: sortedArray(arr1, arr2)){
            System.out.print(i+" ");
        }

        
    }
}
