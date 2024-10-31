package com.company;

import java.util.HashSet;

public class longest_substring_without_repeating_charaters {

    /*
    Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
    * */

    public static int lengthOfLongestSubstring(String s) {

        char[] arr= s.toCharArray();

        StringBuilder sb= new StringBuilder();

        int max=0;

        for (char c : arr) {
            int i= sb.indexOf(String.valueOf(c));
            if (i==-1) {
               sb.append(c);
            } else {

                max = Math.max(max, sb.length());
                sb= new StringBuilder(sb.substring(i + 1));
                sb.append(c);
            }

        }
        max = Math.max(max, sb.length());
        return  max;

    }

    public static int lengthOfLongestSubstring2(String s) {

        char[] arr= s.toCharArray();

        HashSet<Character> hs= new HashSet<>();

        int max=0;
        int i=0;

        for (char c : arr) {

            if(!hs.contains(c)){
                hs.add(c);
            }else{
                max = Math.max(max, hs.size());
                while(hs.contains(c)){
                    hs.remove(arr[i]);
                    i++;
                }
                hs.add(c);
            }

        }
        max = Math.max(max, hs.size());
        return  max;

    }
}
