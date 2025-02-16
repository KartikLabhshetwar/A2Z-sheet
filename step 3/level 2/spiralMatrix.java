import java.util.ArrayList;

public class spiralMatrix {

    static ArrayList<Integer> spiralOrder(int[][] arr){
        ArrayList <Integer> res = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;

        while (true){
            for(int i = left; i <= right; i++){
                res.add(arr[top][i]);
            }
            top++;
            if(left > right || top > bottom){
                break;
            }

            for(int i = top; i <= bottom ; i++){
                res.add(arr[i][right]);
            }
            right--;
            if(left > right || top > bottom) break;

            for( int i = right; i >= left ; i--){
                res.add(arr[bottom][i]);
            }
            bottom--;
            if(left > right || top > bottom ) break;

            for(int i = bottom; i >= top ; i--){
                res.add(arr[i][left]);
            }
            left++;
            if(left > right || top > bottom) break;
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> result = spiralOrder(arr);
        System.out.println("Spiral Order: " + result);


    }
}