public class rotateString {

    /**
     * Checks if goal string can be obtained by rotating string s
     * @param s The input string
     * @param goal The target string to match after rotation
     * @return true if goal can be obtained by rotating s, false otherwise
     */
    static boolean checkRotateString(String s, String goal){
         // Check if lengths of the strings are different
         if(s.length() != goal.length()){
            return false;
         }

         // Concatenate the string with itself
         String ans = s+s;

         // Check if the concatenated string contains the goal string
         if(ans.contains(goal)){
            return true;
         }

         // Return false if no match is found
         return false;
    }

    public static void main(String[] args){
        // Input strings
        String s = "abcde";
        String goal = "bcdea";

        // Call the function to check if goal can be obtained by rotating s
        boolean result =  checkRotateString(s, goal);

        // Print the result
        System.out.println("The solution is: "+result);
    }
}