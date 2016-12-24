package Leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by srujithpoondla on 11/29/16.
 */
public class assigncookie {
    public static void main(String[] args) {
        int[] child ={1,2,4};
        int[] cookie = {1,1,3};
        int contentchild = assign(child,cookie);
        System.out.println(contentchild);
    }

    private static int assign(int[] child, int[] cookie) {
        List<Integer> c =new ArrayList<>();
        int count=0;
        Arrays.sort(child);
        Arrays.sort(cookie);
        if(child.length>cookie.length){
            for (int i=0;i<cookie.length;i++){
                if(cookie[i]>=child[i]){
                    count=count+1;
                }
            }
        }else {
            for (int i=0;i<child.length;i++){
                if(cookie[i]>=child[i]){
                    count=count+1;
                }
            }
        }

 return count;
    }
}
