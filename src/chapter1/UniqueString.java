package chapter1;


/**
 * Created by srujith reddy on 08-11-2016.
 */
public class UniqueString {
    static Boolean unique=false;
    public static void main(String[] args) {
        String str="aaa";
        Boolean unique = checkString(str);
        System.out.println(unique);
    }

    private static Boolean checkString(String str) {
        for (int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)!=str.charAt(j)){
                    unique=true;
                }
            }

        }
       return unique ;
    }
}
