package Leetcode;

/**
 * Created by srujith reddy on 17-11-2016.
 */
public class countbits {
    public static void main(String[] args) {
        int num=5;
//        countbit(num);
        System.out.println(4%6);
    }

    private static void countbit(int num) {
        int count =0;
        char[] n = new char[num];
        String[] k= new String [num];
        for (int i = 0; i < num; i++) {
            k[1] = Integer.toBinaryString(i);

        }
        for (int i = 0; i < k.length; i++) {

           if(k[i].charAt(i)=='1'){
               count = count +1;
           }
        }
        System.out.println(count);
    }
}

