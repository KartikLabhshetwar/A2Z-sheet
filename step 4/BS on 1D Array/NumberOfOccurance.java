public class NumberOfOccurance {

    public static int firstOcc(int[] arr, int x){
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                idx = mid;
            }

            if(arr[mid] >= x){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return idx;
    }

    public static int lastOcc(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                idx = mid;
            }

            if (arr[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return idx;
    }

    public static int[] firstAndLast(int[] arr, int x) {
        int first = firstOcc(arr, x);
        int last = lastOcc(arr, x);

        if(first == -1){
            return new int[] { -1, -1};
        }

        return new int[] { first, last};
    }

    public static int count(int[] arr, int x){
        int[] ans = firstAndLast(arr, x);

        if(ans[0] == -1) return 0;

        return (ans[1] - ans[0] + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 3};
        int x = 3;

        int ans = count(arr, x);

        System.out.println("The occurence of the target in the array is: " + ans);
    }
}