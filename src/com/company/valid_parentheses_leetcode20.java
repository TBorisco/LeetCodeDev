package com.company;

import java.util.Stack;

public class valid_parentheses_leetcode20 {
    /**
     *Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     *
     *
     * Example 1:
     *
     * Input: s = "()"
     *
     * Output: true
     *
     * Example 2:
     *
     * Input: s = "()[]{}"
     *
     * Output: true
     *
     * Example 3:
     *
     * Input: s = "(]"
     *
     * Output: false
     * */

    public boolean isValid(String s) {

        Stack<Character> sk= new Stack<Character>();

        char[] arr= s.toCharArray();

        for(char x: arr){

            if(x=='{'){
                sk.push('}');
            }
            else if(x=='('){
                sk.push(')');
            }else if(x=='['){
                sk.push(']');
            }
            else{
                if(sk.isEmpty() || sk.pop()!= x){
                    return false;
                }
            }

        }

        return sk.isEmpty();

    }
}
