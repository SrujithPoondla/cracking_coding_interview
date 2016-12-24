package Leetcode;

import java.util.ArrayList;

/**
 * Created by srujith reddy on 17-11-2016.
 */
public class summingdigits {

    public static void main(String[] args) {
        int i= 777;
        int sum= summing(i);
        System.out.println(sum);
    }

    private static int summing(int i) {
        int num=0;
        num=num+i%10;
        i=num+i/10;
        if(i>10){
            i=summing(i);
            return i;
        }else {
            return i;
        }

    }
}

