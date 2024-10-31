package com.company;

import java.util.HashMap;
import java.util.List;

public class integer_to_roman {

    /**
     * Seven different symbols represent Roman numerals with the following values:
     *
     * Symbol	Value
     * I	1
     * V	5
     * X	10
     * L	50
     * C	100
     * D	500
     * M	1000
     * Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:
     *
     * If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
     * If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
     * Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
     * Given an integer, convert it to a Roman numeral.
     *
     * LEETCODE 12;
     *
     * Example 1:
     *
     * Input: num = 3749
     *
     * Output: "MMMDCCXLIX"
     *
     * Explanation:
     *
     * 3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
     *  700 = DCC as 500 (D) + 100 (C) + 100 (C)
     *   40 = XL as 10 (X) less of 50 (L)
     *    9 = IX as 1 (I) less of 10 (X)
     * Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
     * */


    public static String intToRoman(int num) {

        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");

        StringBuilder sb= new StringBuilder();
        int q;
        while(num!=0){

            if(num>=1000){
                q=num/1000;
                sb.append(map.get(1000).repeat(q));
                num%=1000;

            }else if(num<1000 && num>=900){
                sb.append(map.get(100)).append(map.get(1000));
                num%=100;
            }
            else if(num>=500 && num<900){
                q=num-500;
                sb.append(map.get(500)).append(map.get(100).repeat(q/100));
                num%=100;
            }else if(num<500 && num>=400){
                sb.append(map.get(100)).append(map.get(500));
                num%=100;
            }
            else if(num>=100 && num<400){
                sb.append(map.get(100).repeat(num/100));
                num%=100;
            }
            else if(num<100 && num>=90){
                sb.append(map.get(10)).append(map.get(100));
                num%=10;
            }
            else if(num<90 && num>=50){
                q=num-50;
                sb.append(map.get(50)).append(map.get(10).repeat(q/10));
                num%=10;
            }
            else  if( num>=40 && num<50){
                sb.append(map.get(10)).append(map.get(50));
                num%=10;
            }else if(num<40 && num>=10){
                sb.append(map.get(10).repeat(num/10));
                num%=10;
            }else if(num==9){
                sb.append(map.get(1)).append(map.get(10));
                num=0;
            }else if(num<9 && num>=5){
                q=num-5;
                sb.append(map.get(5)).append(map.get(1).repeat(q));
                num=0;
            }else if(num==4){
                sb.append(map.get(1)).append(map.get(5));
                num=0;
            }
            else if(num <4){
                sb.append(map.get(1).repeat(num));
                num=0;
            }


        }

        return  sb.toString();


    }

    public static String intToRoman2(int num) {

        List<Integer> nl= List.of(1000,900,500,400,100,90,50,40,10,9,5,4,1);
        List<String> sl= List.of("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I");

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<nl.size() && num>0 ;i++) {
            while(num>=nl.get(i)){
                sb.append(sl.get(i));
                num-=nl.get(i);
            }
        }
        return  sb.toString();
    }


}
