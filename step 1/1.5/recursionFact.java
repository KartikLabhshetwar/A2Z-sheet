import java.util.Scanner;

public class recursionFact {

    static int recFactorial(int n){
        if(n == 0){
            return 1;
        }

        int fact = n * recFactorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            System.out.println("The solution is: "+ recFactorial(n));
        }
    }
}
