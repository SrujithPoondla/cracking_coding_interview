package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by srujith reddy on 17-11-2016.
 */
public class differenceinstring {
    public static void main(String[] args) {
        String s= "srujith";
        String t= "srujithk";
        difference(s,t);
    }

    private static void difference(String s, String t) {
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c:sarray
             ) {
            set.add(c);
        }
        for (char c:tarray
                ) {
            if(set.contains(c)){
                set.remove(c);
            }else{
                System.out.println(c);
            }
        }
    }
}
