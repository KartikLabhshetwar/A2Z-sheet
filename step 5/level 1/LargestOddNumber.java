public class LargestOddNumber {

    static String largestOddString(String num){
        int i = num.length() - 1;

        while( i >= 0){
            int n = num.charAt(i);

            if(n % 2 == 1){
                return num.substring(0, i+1);
            }

            i--;
        }

        return "";
    }
    public static void main(String[] args) {
        String num = "4206";

        String result = largestOddString(num);

        System.out.println("The largest odd number is: "+result);
    }
}