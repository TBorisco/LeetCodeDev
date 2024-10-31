package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class median_of_two_sorted_arrays {

    /*
    *Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
    * */

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n=nums1.length+nums2.length;
        int[] tot= new int[nums1.length+nums2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<nums1.length || j<nums2.length){

            if(i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                    tot[k]=nums1[i];
                    i++;
                }else{
                    tot[k]=nums2[j];
                    j++;
                }
            }else{
                if(i<nums1.length){
                    tot[k]=nums1[i];
                    i++;
                }else{
                    tot[k]=nums2[j];
                    j++;
                }
            }
            k++;

        }
        int mid= n/2;
        if(n%2==0){
            return ((double) tot[mid]+(double)tot[mid-1])/2;
        }else{
            return (double) tot[mid];
        }

    }
}
