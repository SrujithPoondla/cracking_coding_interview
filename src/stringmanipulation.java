/**
 * Created by srujithpoondla on 11/22/16.
 */
public class stringmanipulation {


    public static void main(String[] args) {
        String str = "xyzA'C";
        String a=manipualte(str);
        System.out.println(a);
        System.out.println((int)'-');
    }

    private static String manipualte(String str) {
        char[] c =str.toCharArray();
        String s="";
        for(int i=0;i<c.length;i++){
            if(((int) c[i])>122 && ((int) c[i])<97){
                c[i]=c[i];
                s=s+c[i];
            }else {
                c[i]= ((char) (127 - ((int) c[i])));
                s=s+c[i];
            }
            }

            return s;
        }

    }

