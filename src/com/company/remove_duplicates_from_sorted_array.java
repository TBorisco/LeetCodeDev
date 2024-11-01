package com.company;

public class remove_duplicates_from_sorted_array {

    public static  int removeDuplicates(int[] nums) {

        int max= nums[0];
         int j=1;
        for (int i = 1; i < nums.length; i++) {

            if(nums[i]>max){
                swap(nums,i,j);
                max=nums[j];
                j++;

            }else{
                nums[i]=-1;
            }

        }

        return  j;

    }

    public static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
