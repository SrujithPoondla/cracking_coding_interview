package Leetcode;

import java.util.ArrayList;

/**
 * Created by srujith reddy on 18-11-2016.
 */
public class bitsaddition {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        a.remove(0);
        int k=1;
        a.set(0,a.get(0)+1);
        for(int i=a.size()-1;i>0;i--){
            if(a.get(i)+k>=10){
                a.set(i,0) ;
            }else{
                a.set(i,a.get(i)+k);
                return a;
            }

        }

        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        plusOne(arr);
    }
}

