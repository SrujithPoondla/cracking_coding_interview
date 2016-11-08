package chapter1;

/**
 * Created by srujith reddy on 08-11-2016.
 */
public class URLify {
    public static void main(String[] args) {
        String s1= "Mr John Smith      ";
        int n= 13;
        String urlout=url(s1,n);
        System.out.println(urlout);
    }

    private static String url(String s1,int n) {
        char[] s= new char[s1.length()];
        char[] t=s1.toCharArray();
        int j=s1.length()-1;
        for(int i=n-1;i>=0;i--){
            if (t[i]==' '){
                s[j]='0';
                s[j-1]='2';
                s[j-2]='%';
                j=j-3;
            }else {
                s[j]=t[i];
                j=j-1;
            }
        }
        return new String(s);

    }
}
