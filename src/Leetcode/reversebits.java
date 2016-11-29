package Leetcode;

import sun.misc.FloatingDecimal;

/**
 * Created by srujithpoondla on 11/26/16.
 */
public class reversebits {
    public static void main(String[] args) {
        int a= 13;
        int b=reverse(a);
        System.out.println(b);
    }

    private static int reverse(int a) {
       int c = Integer.reverseBytes(a);
//        char temp=' ';
//        for(int i=0;i<c.length/2;i++){
//            temp=c[i];
//            c[i]=c[c.length-i-1];
//            c[c.length-i-1]=temp;
//        }
//        String d=new String(c);
//        return (Integer.parseInt(d,2));
        return c;

    }
}
