
public class pattern {
    public static void main(String args[]){
        p22(4);
    }
    //question 1:
    static void p1(int n){
        for(int i = 0; i < n ; i++){
            for ( int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //question 2:

    static void p2( int n){
        for(int i = n ; i >= 0; i--){
            for (int j = i; j < n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //question 3
    static void p3(int n){
        for ( int i = 0 ; i <= n; i++){
            for ( int j = 1; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //question 4:
    static void p4(int n){
        for(int i = 0; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //question 5:
    static void p5(int n){
        for(int i = 0; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //question 6:
    static void p6(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //question 7:
    static void p7(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //question 8:
    static void p8(int n){
        for(int i=0; i < n ; i++){
            //space
            for(int k = 0; k < i; k ++){
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k < 2*n - (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //question 9:
    static void p9(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j ++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //question 10:
    static void p10(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0 ; i< n ; i++){
            for(int j = i; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //question 11:
    static void p11(int n){
        for(int i = 0; i <= n; i++){
            int start = 1;
            if( i % 2 == 0){
                start = 0;
            }
            for(int j = 0; j < i; j++){
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }

    //question 12:
    static void p12(int n){
        int space = 2 *(n-1);
        for( int i = 1; i <=n ; i++){
            //number
            for(int j = 1; j <= i ; j++){
                System.out.print(j);
            }

            //space
            for(int j= 1; j <=space; j++){
                System.out.print(" ");
            }

            //number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    //question 13:
    static void p13(int n){
        int k = 1;
        for(int i = 0; i <= n ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
            
        }
    }

    //question 14:
    static void p14(int n){
        for(int i = 0; i < n ; i++){
            for(char ch = 'A'; ch <= 'A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    //question 15:
    static void p15(int n){
        for(int i = n; i >= 1; i--){
            for(char ch = 'A'; ch < 'A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    //question 16:
    static void p16(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print( (char)('A'+i)+ " ");
            }
            System.out.println();
            
        }
    }

    //question 17:
    static void p17(int n){
        for(int i=0; i< n; i++){
            //space
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            //charcters
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int k =1; k <= 2*i + 1; k++){
                System.out.print(ch);
                if(k <= breakpoint){
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }

    //question 18:
    static void p18(int n){
        for(int i = 0; i < n ; i++){
            for(char ch = (char)(int)('A'+ n - 1 - i); ch <= 'A'+ n -1; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    //question 19:
    static void p19(int n){
        //upper part:
        for(int i = 0; i < n ; i++){
            //stars
            for(int j = 0; j <= n-i-1; j++){
                System.out.print("*");
            }

            //space
            for(int j = 0; j < 2*i +1; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 0; j <= n - i - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //lower part:
        for(int i = 0; i < n ; i++){
            //stars:
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            //space:
            for(int j=0; j < 2*n - (2*i+ 1); j++){
                System.out.print(" ");
            }
            //stars:
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //question 20:
    static void p20(int n){
        //upper part:
        for(int i = 0; i < n ; i++){
            //stars:
            for(int j =0; j <= i; j++){
                System.out.print("*");
            }
            //spaces:
            for(int j = 0; j < 2*n - (2*i + 1); j++){
                System.out.print(" ");
            }
            //stars:
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part:
        for(int i = 0; i < n ; i++){
            //stars:
            for(int j = 0; j <= n-i-1; j++){
                System.out.print("*");
            }
            //spaces:
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print(" ");
            }
            //stars:
            for(int j =0; j <= n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //question 21:
    static void p21(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                if( i == 0 || i == n - 1 || j == 0 || j == n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //question 22:
    static void p22(int n){
        for(int i = 0; i < 2*n-1 ; i++){
            for(int j = 0; j < 2*n - 1; j++){
                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;

                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }
    
}