package Leetcode;

import java.util.ArrayList;

/**
 * Created by srujith reddy on 17-11-2016.
 */
public class summingdigits {
    static ArrayList<Integer> arr= new ArrayList<>();


    public static void main(String[] args) {
        int n = 1987;
        int sum=sumofdigits(n);
        System.out.println(sum);
//        arr.s
    }

    private static int sumofdigits(int num) {
        int sum=0;
        if (num<10){
            return num;
        }else{
            sum = sum+ num%10;
            num= num/10;
            num = sum+num;
            sumofdigits(num);
            }

            return sum;
        }

    }

