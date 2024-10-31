package com.company;

public class remove_nth_node_from_end_of_list_leetcode19 {
    /**
     *Given the head of a linked list, remove the nth node from the end of the list and return its head.
     *
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     * */

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        n--;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode slow= head;
        ListNode high= dummy;

        while(slow.next!= null && n>0){
            slow=slow.next;
            n--;
        }

        if(n>0){
            return  null;
        }

        while(slow.next!=null){
            slow=slow.next;
            high=high.next;
        }

        high.next= high.next.next;

        return dummy.next;

    }
}
