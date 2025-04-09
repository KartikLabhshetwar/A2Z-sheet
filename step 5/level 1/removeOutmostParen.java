

public class removeOutmostParen {

    static String removeParanthesis(String S){
        StringBuilder s = new StringBuilder();
        int opened = 0;

        for(char c: S.toCharArray()){
            if(c == '(' && opened++ > 0){
                s.append(c);
            }

            if(c == ')' && opened-- > 1){
                s.append(c);
            }
        }

        return s.toString();
    }
    public static void main(String[] args){
            String S = "(()())(())(()(()))";

            String result = removeParanthesis(S);

            System.out.println("The result is : "+ result);
    }
}
