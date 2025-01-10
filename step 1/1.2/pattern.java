public class pattern {
    public static void main(String args[]){
        p8(5);
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
    
}