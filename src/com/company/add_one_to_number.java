package com.company;

public class add_one_to_number {
/*
    Given a non-negative number represented as an array of digits,

    add 1 to the number ( increment the number represented by the digits ).

    The digits are stored such that the most significant digit is at the head of the list.

            Example:

    If the vector has [1, 2, 3]

    the returned vector should be [1, 2, 4]

    as 123 + 1 = 124.

    LINK: https://www.interviewbit.com/problems/add-one-to-number/
            */
    public static  int[] plusOne(int[] nums){

        int n=nums.length;
        int carry=1;
        for(int i=n-1; i>=0; i--){
            int num=nums[i];
            nums[i]=(num+carry)%10;
            carry=(num+carry)/10;
        }

        if(carry==0){
            return nums;
        }else{
            int[] arr= new int[n+1];
            arr[0]=carry;
            System.arraycopy(nums, 0, arr, 1, n + 1 - 1);
            return  arr;
        }

    }

    public static  void main(String[] args){
      var res= plusOne(new int[]{9,9,9});
    }
}
