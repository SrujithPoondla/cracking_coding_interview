package Leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by srujithpoondla on 11/28/16.
 */
public class singlenum {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        int finalnum= single(nums);
        System.out.println(finalnum);

    }

    private static int single(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int k=0;
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i])+1;
                map.put(nums[i],val);
            }else{
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
            if(entry.getValue()==1){
                k=entry.getKey();
            }
            
        }
        return k;
    }
}
