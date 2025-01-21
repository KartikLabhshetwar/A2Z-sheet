import java.util.Scanner;

public class validPalindrome {

    static boolean recPalindrome(String n, int i){

        if(i >= n.length()/2){
            return true;
        }

        if(n.charAt(i) != n.charAt(n.length()-i-1)){
            return false;
        }
        
        return recPalindrome(n, i+1);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your string: ");
            String n = sc.nextLine();
            System.out.println("Your solution is: "+ recPalindrome(n, 0));
        }
    }
}