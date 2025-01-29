import java.util.HashMap;

public class singleElement {

    static int getSingleElement(int[] arr){
        HashMap <Integer, Integer> element = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            element.put(arr[i], element.getOrDefault(arr[i], 0)+1);
        }

        for(int key: element.keySet()){
            if(element.get(key) == 1){
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println("The single element is: "+ getSingleElement(arr));
    }
}