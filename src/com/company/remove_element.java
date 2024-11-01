package com.company;

public class remove_element {

    public static int RemoveElement(int[] nums, int val) {



        int i=0;
        int count=0;

        while (i<nums.length && nums[i]!=val){
            i++;
        }

        int j=i;
        while(i<nums.length){
           if(nums[i]== val){
               i++;
               count++;
           }else{
               swap(nums,i,j);
               i++;
               j++;
           }

        }


           return  nums.length-count;

    }

    public static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
}
