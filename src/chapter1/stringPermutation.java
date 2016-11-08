package chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by srujith reddy on 08-11-2016.
 */
public class stringPermutation {
    public static void main(String[] args) {
        String str1="abcc";
        String str2="bcaa";
        boolean status = checkString(str1,str2);
        System.out.println(status);
    }

    private static boolean checkString(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }
        Map<Character,Integer> map1= new HashMap<>();
        Map<Character,Integer> map2= new HashMap<>();
        for (int i=0;i<str1.length();i++){
            if(map1.containsKey(str1.charAt(i))){
                int val=map1.get(str1.charAt(i));
                val = val+1;
                map1.put(str1.charAt(i),val);
            }else {
                map1.put(str1.charAt(i),1);
            }
            int val=0;
            if(map2.containsKey(str2.charAt(i))){
                val=map2.get(str2.charAt(i));
                val = val+1;
                map2.put(str2.charAt(i),val);
            }else {
                map2.put(str2.charAt(i),1);
            }
        }
        for(int i=0;i<str1.length();i++){
            if(map1.get(str1.charAt(i))!=map2.get(str1.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
