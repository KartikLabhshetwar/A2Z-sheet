public class countDigits {

    static int countDigit(int N){
        int cnt = 0;
        int orgNum = N; //stores the original number.
        while( N > 0){
            int a = N % 10; // get the last digit
            if(a != 0 && orgNum % a == 0){ // Check if the digit divides the original number
                cnt = cnt + 1;// increment the count if the condition is satisfied.
            }
            N = N / 10; // remove the last digit.
        }
        return cnt;
    }
    public static void main(String[] args) {
        int N = 373;
        System.out.println("N: "+ N);
        int digits = countDigit(N);
        System.out.print("Number of digits in N: "+ digits);
    }
}
