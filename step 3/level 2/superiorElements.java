import java.util.ArrayList;
import java.util.Collections;

public class superiorElements{

    static ArrayList<Integer> superiorElement(int[] arr){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int sup = arr[n-1];
        list.add(sup);

        for(int i = n-2; i >=0; i--){
            if(sup < arr[i]){
                list.add(arr[i]);
            }

            sup = Math.max(arr[i], sup);
        }

        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};

        ArrayList<Integer> list = new ArrayList<>();

        list = superiorElement(arr);

        for(int i: list){
            System.out.print(i+" ");
        }
    }
}