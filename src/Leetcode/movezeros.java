package Leetcode;

/**
 * Created by srujith reddy on 17-11-2016.
 */
public class movezeros {
    public static void main(String[] args) {
        int[] a= {0,0,2, 0, 4};
        movezero(a);
    }

    private static void movezero(int[] a) {
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count = count +1;
            }
        }
        for(int j=0;j<count;j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] == 0) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;

                } else {

                }
            }
        }
    }
}

