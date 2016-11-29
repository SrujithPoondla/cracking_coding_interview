package Leetcode;

import java.util.*;

/**
 * Created by srujithpoondla on 11/28/16.
 */
public class stringdifference {
    public static void main(String[] args) {
        String s= "q";
        String t = "qq";
        char e=difference(s,t);
        System.out.println(e);
    }

    private static char difference(String s, String t) {
        List<Character> set = new ArrayList<>();
        char[] a= s.toCharArray();
        char[] b= t.toCharArray();
        if(s.length()>t.length()){
            for (int i=0;i<s.length();i++){
                set.add(a[i]);
            }
            for (int i=0;i<t.length();i++){
                set.remove(((Character) b[i]));
            }
            return (char) (set.toArray())[0];

        }else {
            for (int i=0;i<t.length();i++){
                set.add(b[i]);
            }
            for (int i=0;i<s.length();i++){
                set.remove(((Character) a[i]));
            }
            return (char) (set.toArray())[0];


        }

    }
}
