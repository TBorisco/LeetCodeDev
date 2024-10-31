package com.company;

public class longest_palindromic_substring {

    public static String longestPalindrome(String s) {

        int l;
        int h;
        int n=s.length();
        String max="";
        for(int i=0; i<n; i++){

            l=i-1; h=i+1;

            max=findPalindrome(l,h,max,s,n);

            l=i-1; h=i;
            max=findPalindrome(l,h,max,s,n);

            l=i; h=i+1;
            max=findPalindrome(l,h,max,s,n);
        }

        return max;
    }

    public static String findPalindrome(int l, int h, String max, String s, int n){
        while (l>=0 && h<n && s.charAt(l) == s.charAt(h)){

            if(h-l>max.length()){
                max=s.substring(l,h+1);
            }
            l--;
            h++;
        }

        return  max;
    }
}
