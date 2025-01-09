import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//this is how buffer reader is been used you should also this for coding regularly.

public class basics {
    public static void main(String args[]) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        System.out.print("enter your integer: ");
        int x = Integer.parseInt(bf.readLine());
        int y = Integer.parseInt(bf.readLine());
        int sum = x+y;
        System.out.println("Sum of two number is: "+ sum);

    }
}
