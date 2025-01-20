import java.util.Scanner;

public class recursionBasics{

    static void printLetters(int n){
        if(n == 0){
            return;
        }

        System.out.println("HELLO");
        printLetters(n-1);
        
    }

    static void printNos(int n){
        if(n ==0){
            return;
        }

        printNos(n-1);
        System.out.print(n+" ");
    }

    static void printNosRev(int n){
        if (n == 0 ){
            return;
        }

        System.out.print(n+" ");
        printNosRev(n-1);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your input: ");
            int n = sc.nextInt();
            printLetters(n);
            printNos(n);
            printNosRev(n);
        }
    }
}