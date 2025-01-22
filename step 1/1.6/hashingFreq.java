import java.util.HashMap;

/**
 * Program to count frequency of elements in an array using HashMap
 */
public class hashingFreq {
    
    static void hash(int[] arr, int n) {
        // Create HashMap to store element-frequency pairs
        HashMap<Integer, Integer> newHash = new HashMap<>();
        
        // Count frequency of each element
        for(int i = 0; i < n; i++) {
            if(newHash.containsKey(arr[i])) {
                newHash.put(arr[i], newHash.get(arr[i]) + 1);
            } else {
                newHash.put(arr[i], 1);
            }
        }

        // Print element frequencies
        for(HashMap.Entry<Integer, Integer> entry: newHash.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;
        hash(arr, n);
    }
}