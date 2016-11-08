package chapter1;

/**
 * Created by srujith reddy on 08-11-2016.
 */
public class palindromePermutation {
    public static void main(String[] args) {
        String str = "tactcoaa";
        boolean status= checkPalindrome(str);
        System.out.println(status);
    }

    private static boolean checkPalindrome(String str) {
        int[] count = new int[128];
        int j=0;
        char[] s = str.toCharArray();
        for (char c:s
             ) {
            count[c]=count[c]+1;
        }
        for (int i:count
             ) {
            if (i%2!=0){
                j=j+1;
            }
        }
        if(j>1){
            return  false;
        }
        return true;
    }

}
