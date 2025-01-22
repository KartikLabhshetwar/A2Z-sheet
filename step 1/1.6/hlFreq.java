import java.util.HashMap;

public class hlFreq {

    static void highestLowestFreq(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxF = 0;
        int minF = n;
        int maxEle = 0;
        int minEle = 0;

        for(HashMap.Entry<Integer, Integer> entry: map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > maxF){
                maxEle = element;
                maxF = count;
            }

            if(count < minF){
                minEle = element;
                minF = count;
            }
        }

        System.out.println("The highest Frequency element is: "+maxEle);
        System.out.println("The lowest Frequency element is: " + minEle);

    }
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 4, 4, 2 };
        int n = arr.length;
        highestLowestFreq(arr, n);
    }
}
