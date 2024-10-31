package com.company;

public class ListNode {
    ListNode next;
    int val;

    ListNode(int val){
        this.val=val;
    }

    ListNode(int val , ListNode next){
        this.val=val;
        this.next=next;
    }
}
