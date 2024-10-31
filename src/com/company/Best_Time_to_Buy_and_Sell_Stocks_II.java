package com.company;

import java.util.List;

public class Best_Time_to_Buy_and_Sell_Stocks_II {


    /**
     *
     * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
     *
     * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
     *
     * Find and return the maximum profit you can achieve.
     *
     *
     *
     * Example 1:
     *
     * Input: prices = [7,1,5,3,6,4]
     * Output: 7
     * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     * Total profit is 4 + 3 = 7.
     * */


    /**Java*/
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int i=0;
        while(i<n){

            int min=prices[i];
            while(i+1<n && prices[i+1]>=prices[i]){
                i++;
            }

            max+=(prices[i]-min);
            i++;
        }

        return  max;
    }

    public int maxProfit(List<Integer> A) {
        int n=A.size();
        int max=0;
        int i=0;
        while(i<n){

            int min=A.get(i);
            while(i+1<n && A.get(i+1)>=A.get(i)){
                i++;
            }

            max+=(A.get(i)-min);
            i++;
        }

        return  max;
    }

    /*C#
    public int maxProfit(List<int> A) {
        int n=A.Count;
        int max=0;
        int i=0;
        while(i<n){

            int min=A[i];
            while(i+1<n && A[i+1]>=A[i]){
                i++;
            }

            max+=(A[i]-min);
            i++;
        }

        return  max;
    }**/
}
