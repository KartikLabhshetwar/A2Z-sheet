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

        //ternary operator:
        // var = (condition)? statement1 : statement2;
        //why use this?
        //instead of doing this verbose work

        // int time = 20;
        // if (time < 18) {
        //     System.out.println("Good day.");
        // } else {
        //     System.out.println("Good evening.");
        // }

        int time = 20;
        String result = (time > 18)? "Good evening": "Good day";
        System.out.println(result);

        String a = "kartik";
        int b = (a == "apple")? 0 : 1;
        System.out.println(b);


        //switch statement example

        int day = 3;
        switch(day){
            case 1: System.out.println("monday");
            break;
            case 2: System.out.println("tuesday");
            break;
            case 3: System.out.println("wednesday");
            break;
            case 4: System.out.println("thrusday");
            break;
            case 5: System.out.println("friday");
            break;
            case 6: System.out.println("saturday");
            break;
            default: System.out.println("sunday");
        }
    }
}
