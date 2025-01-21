import java.util.Scanner;

public class reverseInteger {

    static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        
        return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 : rev;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        reverse(n);
        System.out.println("Output: "+ reverse(n));
    }
    }
}