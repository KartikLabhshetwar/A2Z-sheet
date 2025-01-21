import java.util.Scanner;

public class recursionFibonacci {
    static int fibonacci(int n){

        if( n <= 1){
            return n;
        }

        int f1 =  fibonacci(n-1);
        int f2 = fibonacci(n-2);

        int fib = f1+f2;

        return fib;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your number");
            int n = sc.nextInt();
            System.out.println("Solution is: "+ fibonacci(n));
        }
    }
}
