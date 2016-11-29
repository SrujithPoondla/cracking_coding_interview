package Leetcode;

/**
 * Created by srujithpoondla on 11/28/16.
 */
public class reversestring {
    public static void main(String[] args) {
        String str = "hello";
        str=reverse(str);
        System.out.println(str);
    }

    private static String reverse(String str) {
        byte[] s = str.getBytes();
        for(int i=0;i<s.length/2;i++){
            byte temp=s[s.length-1-i];
            s[s.length-i-1]=s[i];
            s[i]=temp;
        }
        return new String(s);
    }
}
