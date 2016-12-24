package Leetcode;

import java.util.Arrays;

/**
 * Created by srujith reddy on 17-11-2016.
 */
public class minmoves {
    static int count=0;
    public static void main(String[] args) {
        int[] n = {1,1,1};
        move(n);
        System.out.println(count);
    }

    private static void move(int[] n) {
        count=count+1;
        Arrays.sort(n);
        for(int k=0;k<n.length-1;k++){
            n[k]=n[k]+1;

        }
        for(int k=0;k<n.length;k++){
           if(n[0]!=n[k]){
               move(n);
           }
        }
    }
}
