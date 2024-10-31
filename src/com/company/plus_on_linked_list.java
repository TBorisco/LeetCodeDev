package com.company;

import java.util.List;
import java.util.Stack;

public class plus_on_linked_list {

    private  ListNode head;
    private static class  ListNode{
        private ListNode next;
        private  int val;

        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }

    public  void add(int val){

        ListNode newNode= new ListNode(val);

        if(head==null){
            head=newNode;
            return;
        }

        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode current= dummy;


        while (current.next!=null){
            current=current.next;
        }

        current.next=newNode;
        head=dummy.next;

    }

    public  void plusOne(){

        Stack<ListNode> stack=new Stack<>();

        ListNode current= head;

        while(current!=null){
            stack.push(current);
            current=current.next;
        }

        int c=1;
        ListNode temp=null;
        while(!stack.isEmpty()){
            ListNode cl= stack.pop();
            int val= cl.val+c;
           if(temp==null){
               temp=new ListNode(val%10);
           }else{
               cl.val= val%10;
               cl.next=temp;
               temp=cl;
           }
            c=val/10;
        }

        if(c>0){
            ListNode newNode= new ListNode(c);
            newNode.next=temp;
            temp=newNode;
        }

        head=temp;
    }

    public  void print(){
        ListNode current= head;

        while(current!=null){
            System.out.print(current.val+ "->");
            current=current.next;
        }

        System.out.print("null");
        System.out.println("\n");

    }

}
