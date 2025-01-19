import java.util.Scanner;

public class checkPrime {

    static boolean solution(int n){

        if( n <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the your number: ");
            int n = sc.nextInt();
            System.out.println("Your solution is: "+solution(n));
        }
    }
}