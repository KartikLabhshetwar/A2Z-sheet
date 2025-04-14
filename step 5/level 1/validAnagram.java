import java.util.Arrays;

public class validAnagram {

    static boolean isValidAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String s2 = new String(s1);

        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        String t2 = new String(t1);


        return s2.equals(t2);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isValidAnagram(s, t);

        System.out.println("The result is: "+ result);
    }

}
