package Leetcode;

import java.util.Arrays;

/**
 * Created by srujithpoondla on 11/29/16.
 */
public class assigncookie {
    public static void main(String[] args) {
        int[] child ={1,2,2};
        int[] cookie = {1,1};

        int contentchild = assign(child,cookie);
    }

    private static int assign(int[] child, int[] cookie) {
        Arrays.sort(child);
        Arrays.sort(cookie);
        int count=0;
        if(child.length>cookie.length){
            for (int i=0;i<cookie.length;i++){
                if(child[i]>=cookie[i]){
                    count=count+1;
                }
            }
            return count;
        }else if(cookie.length>child.length){
            for(int i=0;i<child.length;i++){
                if(child[i]>cookie[])
            }

        }
    }
}
