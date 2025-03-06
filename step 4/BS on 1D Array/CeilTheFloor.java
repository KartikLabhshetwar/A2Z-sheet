public class CeilTheFloor{

    static int getFloor(int[] arr, int target){
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] <= target){
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static int getCeil(int[] arr, int target){
        int ans = -1;
        int low = 0;
        int high = arr.length - 1; 

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= target){
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    static int[] ceilTheFloor(int[] arr, int target){
        int f = getFloor(arr, target);
        int c = getCeil(arr, target);

        return new int[] {f, c};
    }

    public static void main(String[] args){
        int target = 5;
        int[] arr = { 3, 4, 7, 8, 8, 10};

        int[] result = ceilTheFloor(arr, target);

        for(int i: result){
            System.out.println("the result is: "+ i);
        }
    }
}