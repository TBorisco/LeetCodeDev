package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lettercombinations_of_a_phone_number {

    /**
     * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
     * <p>
     * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
     *
     * 2=> "a,b,c",
     * 3=> "d,e,f",
     * 4=> "g,h,i",
     * 5=> "j,k,l",
     * 6=> "m,n,o",
     * 7=> "p,q,r,s",
     * 8=> "t,u,v",
     * 9=> "w,x,y,z"
     *
     */

    public static List<String> letterCombinations(String digits) {

        String[] numb = new String[]{"a,b,c", "d,e,f", "g,h,i", "j,k,l", "m,n,o", "p,q,r,s", "t,u,v", "w,x,y,z"};

        char[] digitAr = digits.toCharArray();

        List<String> ans = List.of(numb[digitAr[0]-'2'].split(","));


        for (int i = 1; i < digitAr.length; i++) {

            List<String> lt= new ArrayList<>();
            for (String y : ans) {
                for (String x : numb[digitAr[i]-'2'].split(",")) {
                   lt.add(y+x);
                }
            }
            ans=lt;

        }

        return ans;
    }
}
