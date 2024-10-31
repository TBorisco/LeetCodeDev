package com.company;

public class container_with_most_water {
/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * LEETCODE 11;
 * */


    public static int maxArea(int[] height) {

        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
           int x= height[l];
           int y= height[r];
            max=Math.max(max,Math.min(x,y)*(r-l));

            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }

        }

        return  max;

    }


}
