import java.util.Scanner;

public class palindrome {

    static boolean isPalindrome(int n){
        int rev = 0;
        int a = n;
        while(n > 0){
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        return rev == a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Output: "+ isPalindrome(n));

    }
}
