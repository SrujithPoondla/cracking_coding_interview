package chapter1;


/**
 * Created by srujith reddy on 08-11-2016.
 */
public class UniqueString {
    static boolean unique=false;
    public static void main(String[] args) {
        String str="srujith";
        boolean unique = checkString(str);
        System.out.println(unique);
    }

    private static boolean checkString(String str) {
        if(str.length()>128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i=0;i<str.length();i++){
            int val= str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val]=true;
        }
        return true;

    }
}
