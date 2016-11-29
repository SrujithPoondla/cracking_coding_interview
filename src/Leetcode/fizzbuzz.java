package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srujithpoondla on 11/28/16.
 */
public class fizzbuzz {
    public static void main(String[] args) {
        int n=15;
        String str = createString(n);
        System.out.println(str);
    }

    private static String createString(int n) {
        StringBuffer str =new StringBuffer();
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if(i%15==0){
                list.add("FizzBuzz");
            }else if (i%3==0){
               list.add("Buzz");
            }else if(i%5==0){
                list.add("Fizz");
            }else{
                list.add(Integer.toString(i));
            }
        }
        return str.toString();
    }
}
