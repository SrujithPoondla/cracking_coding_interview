import java.util.ArrayList;
import java.util.List;

/**
 * Created by srujithpoondla on 11/22/16.
 */
public class Solution {
    public static String solution(String s,int k){
        String str=s.replace("-","");
        StringBuffer b = new StringBuffer();
        for(int i=s.length();i>=0;i--){
            b.append('-');
        }

        return b.toString();

    }
    public static void main(String[] args) {
        String str = "2-4A0r7-4k";
        str = solution(str,2);
        System.out.println(str);

    }
}
