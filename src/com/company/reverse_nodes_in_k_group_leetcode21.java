package com.company;

import java.awt.*;

public class reverse_nodes_in_k_group_leetcode21 {

    /**
     *
     * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
     *
     * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
     *
     * You may not alter the values in the list's nodes, only nodes themselves may be changed.
     *
     * Example 1:
     * Input: head = [1,2,3,4,5], k = 2
     * Output: [2,1,4,3,5]
     * */

    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy= new ListNode(0);
        dummy.next= head;

        ListNode temp= dummy;
        int count=0;

        while(temp.next!=null){
            temp=temp.next;
            count++;
        }


        int numbOfTurn = count/k;
        temp= head;
        ListNode ans= new ListNode(0);
        ListNode curAns= ans;


        while(temp!=null && numbOfTurn>0){

            ListNode rev= null;
            int currCount= k;
            while(temp!=null && currCount>0){

                ListNode t= temp;
                temp=temp.next;
                t.next=rev;
                rev=t;
                currCount--;
                if(curAns.next!=null){
                    curAns=curAns.next;
                }

            }

            curAns.next=rev;
            numbOfTurn--;


        }

        curAns.next= temp;
        return  ans.next;
    }
}
