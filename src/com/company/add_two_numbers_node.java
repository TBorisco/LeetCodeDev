package com.company;

import java.util.List;

public class add_two_numbers_node {
/*
* Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
* */


    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode dummy= new ListNode(0);
        ListNode current=dummy;

        int c=0;

        while (l1!=null || l1!=null || c!=0){

            int val= (l1==null? 0: l1.val) + (l2==null?0: l2.val) + c;

             c= val/10;

            current.next=new ListNode(val%10);

            current=current.next;

            l1=l1!=null?l1.next:null;

            l2=l2!=null?l2.next:null;

        }


        return  dummy.next;

    }







}
