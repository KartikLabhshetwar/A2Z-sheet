import java.util.Scanner;

public class recursionSum {

    static int recSum(int n){
        if(n == 0){
            return 0;
        }
        int sum = n + recSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            System.out.println("Sum is: "+ recSum(n));

        }
    }
}
