package com.company;

public class find_the_index_of_the_first_occurrence_in_a_string {

    public static  int strStr(String haystack, String needle) {

        int n=haystack.length();
        int m= needle.length();
        for(int i=0; i<n-m; i++){

            if(haystack.charAt(i)==needle.charAt(0) && i+ (m-1) < n){
                String t=haystack.substring(i,m);
                if(t.equals(needle)){
                    return i;
                }
            }
        }


        return -1;
    }
}
