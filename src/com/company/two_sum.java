package com.company;

import java.util.HashMap;
import java.util.Map;

public class two_sum {

    /*
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * */

    public int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> map= new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int x=nums[i];
            int y= target-nums[i];

            if(map.containsKey(y)){
                return  new int[]{map.get(y),i};
            }

            map.put(x,i);

        }

        return  new int[]{};

    }


}
