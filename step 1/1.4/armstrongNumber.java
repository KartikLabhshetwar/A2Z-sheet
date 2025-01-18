import java.util.Scanner;

public class armstrongNumber{

    static boolean solution(int n){
        int sum = 0;
        int numOfDigits = String.valueOf(n).length();
        int a = n;
        while(n > 0){
            int temp = n % 10;
            sum += Math.pow(temp, numOfDigits);
            n /= 10;
        }

        if( sum == a){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            System.out.println("Answer is: "+ solution(n));
        }
    }
} 