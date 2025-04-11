public class reverseWords{

    public static String revWords(String s){
        String[] arr = s.trim().split("\\s+");

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            String t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

        return String.join(" ",arr);

    }
    public static void main(String[] args) {
        String s = "the sky is blue";

        String r = revWords(s);

        System.out.println(r);
    }
}