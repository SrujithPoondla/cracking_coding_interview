package chapter1;

/**
 * Created by srujith reddy on 08-11-2016.
 */
public class stringEdit {
    public static void main(String[] args) {
        String s1= "balerx";
        String s2= "bale";
        boolean status = checkString(s1,s2);
        System.out.println(status);
    }

    private static boolean checkString(String s1, String s2) {
        if (Math.abs( s1.length()-s2.length())>1){
            return  false;
        }
        char[] str1 = s1.toCharArray();
        char[] str2= s2.toCharArray();
        int[] l1 = new int[128];
        for (char c :str1
             ) {
            l1[c]=l1[c]+1;
        }
        for (int i=0;i<str2.length;i++){
            int c = str2[i];
            if (l1[c]>0) {
                l1[c]--;
            }else {
                l1[c]=l1[c]+1;
            }
        }
        int c=0,j=0;
        if(str1.length>=str2.length){

            for (int i=0;i<str1.length;i++){
                c =str1[i];
                if(l1[c]>=1){
                    j=j+1;
                }
            }
            if (j>1){
                return false;
            }
        }else {
            for (int i=0;i<str2.length;i++){
                c =str2[i];
                if(l1[c]>=1){
                    j=j+1;
                }
            }
            if (j>1){
                return false;
            }
        }
        return true;
    }
}

