package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListNode listNode=new ListNode(1);
         listNode.next=new ListNode(4);
         listNode.next.next=new ListNode(5);

        ListNode listNode2=new ListNode(1);
        listNode2.next=new ListNode(3);
        listNode2.next.next=new ListNode(4);

        ListNode listNode3=new ListNode(2);
        listNode3.next=new ListNode(6);

       var ans= merge_k_sorted_lists.mergeKLists(new ListNode[]{listNode,listNode2,listNode3});

        int[] ar= new int[]{2,34,53,53,21,44,55};
       System.out.println(ar['2'-'2']);





        /*var ans=findNextPermutation(310);
        System.out.println(ans);*/
    }

    static long smallest= Long.MAX_VALUE;
    public  static  long findNextPermutation(long a){

        char[] vals= String.valueOf(a).toCharArray();

        String str=new String(vals);

        permutation(str,"");

        return  smallest;
    }

    public  static  void  permutation(String rem, String curr){

        if(rem.length()==0){
            if(Long.parseLong(rem)<smallest){
                smallest=Long.parseLong(rem);
            }
        }
        else if(rem.length()==1){
            if(Long.parseLong(curr+rem)<smallest){
                smallest=Long.parseLong(curr+rem);
            }
        }
        else{
            for (int i = 0; i < rem.length(); i++) {

                String sub= rem.substring(i,i+1);

                permutation(rem.substring(0,i)+ rem.substring(i+1),curr+sub);

            }

        }



    }
    
    public static String maxValue(int[] A){

        List<String> A2=new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
           A2.add(String.valueOf(A[i]));
        }

        A2.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String t1 = a + b;
                String t2 = b + a;
                return t1.compareTo(t2);
            }
        });



        StringBuilder res=new StringBuilder();

        int countZeros=0;
        for (int i = A2.size()-1; i >=0 ; i--) {
            if(Objects.equals(A2.get(i), "0")){
                countZeros++;
            }
            res.append(A2.get(i));
        }

        if(countZeros== A.length)return "0";

        return res.toString();
    }
    
    public static void swap(int i, int j, int[] arr){
        
        String a= String.valueOf(arr[i]);
        String b= String.valueOf(arr[j]);
        
        if(Long.parseLong(a+b)>Integer.parseInt(b+a)){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
