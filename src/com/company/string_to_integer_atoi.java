package com.company;

public class string_to_integer_atoi {
/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Whitespace: Ignore any leading whitespace (" ").
 * Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
 * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
 * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
 * Return the integer as the final result.
 *
 *Example 1:
 *
 * Input: s = " -042"
 *
 * Output: -42
 *
 * Explanation:
 *
 * Step 1: "   -042" (leading whitespace is read and ignored)
 *             ^
 * Step 2: "   -042" ('-' is read, so the result should be negative)
 *              ^
 * Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
 * */

    public static int myAtoi(String s) {

        int i=0;
        char[] arr=s.toCharArray();
        while(i<arr.length && arr[i]==' '){
            i++;
        }

        int sign=1;
        if (i<arr.length && (arr[i]=='+' || arr[i]=='-')){
            if(arr[i]=='-'){
                sign*=-1;
            }
            i++;
        }

        long ans=0;

        while (i<arr.length && Character.isDigit(arr[i])){
            ans=10*ans + (arr[i]-'0');

            if(ans*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(ans*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return  (int)ans*sign;

    }

}

