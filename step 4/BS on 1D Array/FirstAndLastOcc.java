public class FirstAndLastOcc {

    static int[] solution(int[] arr, int target){

        int[] result = new int[2];
        result[0] = startIdx(arr, target);
        result[1] = endIdx(arr, target);

        return result;
    }

    static int startIdx(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == target) idx = mid;
            if(arr[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return idx;
    }

    static int endIdx(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;

        while (low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target) idx = mid;
            if(arr[mid] <= target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        int[] result = solution(arr, target);

        for(int i: result){
            System.out.println(i);
        }
    }
}
