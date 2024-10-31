package com.company;

import java.awt.*;

public class merge_k_sorted_lists {

    /**
     * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
     *
     * Merge all the linked-lists into one sorted linked-list and return it.
     *
     *
     *
     * Example 1:
     *
     * Input: lists = [[1,4,5],[1,3,4],[2,6]]
     * Output: [1,1,2,3,4,4,5,6]
     * Explanation: The linked-lists are:
     * [
     *   1->4->5,
     *   1->3->4,
     *   2->6
     * ]
     * merging them into one sorted list:
     * 1->1->2->3->4->4->5->6
     * */

    public static ListNode mergeKLists(ListNode[] lists) {

        if(lists.length==0)return  null;

        ListNode dummy= new ListNode(0);
        ListNode current= dummy;

        ListNode l1= lists[0];

        for (int i = 1; i < lists.length; i++) {

            while(l1!=null || lists[i]!=null){

                if(l1!=null && lists[i]!=null){

                    if(l1.val<lists[i].val){
                        current.next=l1;
                        l1=l1.next;
                    }else{
                        current.next=lists[i];
                        lists[i]=lists[i].next;
                    }
                    current=current.next;
                }else{

                    if(l1!=null){
                        current.next=l1;
                        l1=null;
                    }else{
                        current.next=lists[i];
                        lists[i]=null;
                    }
                }

            }

            l1=dummy.next;
            dummy.next=null;

        }


      return  l1;
    }
}
