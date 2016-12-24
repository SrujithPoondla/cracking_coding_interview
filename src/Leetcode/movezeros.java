package Leetcode;



/**
 * Created by srujith reddy on 17-11-2016.
 */
public class movezeros {
    public static void main(String[] args) {
        int[] a= {0,0,2, 0, 4};
        a=movezero(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    private static int[] movezero(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j++] = nums[i];
                nums[i] = temp;
            }
        }

        return nums;
    }
}

