package chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by srujith reddy on 08-11-2016.
 */
public class stringPermutation {
    public static void main(String[] args) {
        String str1="abc";
        String str2="bca";
        boolean status = checkString(str1,str2);
        System.out.println(status);
    }

    private static boolean checkString(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }
        int[] letters= new int[128];
        char[] s= str1.toCharArray();
        for (char c :s
             ) {
            letters[c]=letters[c]+1;
        }
        for (int i=0;i<str2.length();i++){
            int c = str2.charAt(i);
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }

        return true;
    }
}
