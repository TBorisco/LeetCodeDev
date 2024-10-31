package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class four_4_sum {

    /***/

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 3; i++) {

            if(i>0 && nums[i]==nums[i-1]){
                i++;
            }

            for (int j = i + 1; j < n - 2; j++) {

                if(j>i+1 && nums[j]==nums[j-1]){
                    j++;
                }

                int k = j + 1;
                int z = n - 1;

                while (k < z) {

                    int x = nums[i] + nums[j] + nums[k] + nums[z];

                    if(x<target){
                        k++;
                    }else if(x>target){
                        z--;
                    }else{

                        List<Integer> lt = List.of(nums[i], nums[j], nums[k], nums[z]);

                        if(!ans.contains(lt))
                        ans.add(lt);
                        k++;
                        z--;
                    }
                }
            }
        }
        return ans;
    }
}
