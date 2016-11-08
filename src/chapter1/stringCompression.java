package chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by srujith reddy on 08-11-2016.
 */
public class stringCompression {
    public static void main(String[] args) {
        String s="aaaabcccccAABBBA";
        String compress=compressString(s);
        System.out.println(compress);
    }

    private static String compressString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                val = map.get(s.charAt(i));
                val = val + 1;
                map.put(s.charAt(i), val);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int i = 0;
        char[] compressedString = new char[2 * map.size()];
        for (Map.Entry<Character, Integer> entry : map.entrySet()
                ) {
            compressedString[i] = entry.getKey();
            compressedString[i + 1] = entry.getValue().toString().charAt(0);
            i = i + 2;
        }
        if (new String(compressedString).length()>s.length()){
            return s;
        }else {
            return new String(compressedString);
        }

    }
}
