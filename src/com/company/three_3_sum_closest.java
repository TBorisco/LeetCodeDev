package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_3_sum_closest {

    /**
     *
     * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
     *
     * Return the sum of the three integers.
     *
     * You may assume that each input would have exactly one solution.
     * **/

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        int n= nums.length;
        for (int i = 0; i < n-2; i++) {

            int j= i+1;
            int k= n-1;

            while (j<k){

                int sum= nums[i]+nums[j]+nums[k];

                if(target==sum){
                    return sum;
                }

                if(Math.abs(target-sum)<Math.abs(target-closest)){
                    closest=sum;
                }

                if(sum<target){
                    j++;
                }else {
                    k--;
                }

            }

        }

       return closest;
    }
}
