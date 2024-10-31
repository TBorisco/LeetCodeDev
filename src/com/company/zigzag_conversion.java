package com.company;

public class zigzag_conversion {
    /*
    *The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
    *
    * */

    public static  String convert(String s, int numRows) {


        char[] ar=s.toCharArray();
        StringBuilder[] arr= new StringBuilder[numRows];
        int i=0;
        int k=0;
        while(i<ar.length){
            arr[k]=arr[k]==null?new StringBuilder(String.valueOf(ar[i])): arr[k].append(ar[i]);
            k++;
            i++;
            if(k==numRows){
                k=k-2;
                while( i>0  && i<ar.length && k>0){

                    arr[k].append(ar[i]);
                    k--;
                    i++;
                }
            }

        }
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]!=null){
                arr[0].append(arr[j]);
            }

        }
        return arr[0].toString();
    }
}
