import java.util.Scanner;

public class sumOfDivision {

    static int solution(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
                sum = sum + i * (n/ i);
        }
        return sum;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter your number: ");
            int n = sc.nextInt();
            System.out.println("the is the solution: "+ solution(n));
        }
    }
}
