package com.company;

import java.util.ArrayList;
import java.util.List;

public class anti_diagonal {
    /*
    Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
    Example:

    Input:

    1 2 3
    4 5 6
    7 8 9

    Return the following :

    [
      [1],
      [2, 4],
      [3, 5, 7],
      [6, 8],
      [9]
    ]


    Input :
    1 2
    3 4

    Return the following  :

    [
      [1],
      [2, 3],
      [4]
    ]

    LINK: https://www.interviewbit.com/problems/anti-diagonals/
    */
    public static List<List<Integer>>   diagonal ( int[][] nums){

        int n= nums.length;

        int target= n+1;
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0; i<= target ; i++){

            int j=0;
            List<Integer> subLt=new ArrayList<>();
            while(j<=i && j<= target/2){

                int x= j;
                int y=i-j;

                if(x<=n-1 && y<=n-1){
                    subLt.add(nums[x][y]);
                }

                j++;
            }

            if(subLt.size()>0){
                res.add(subLt);
            }


        }

        return  res;
    }

    public static  void  main(String [] args){
       var res= diagonal(new int[][]{{1 ,2 ,3},{4, 5 ,6},{7 ,8, 9}});
    }
}
