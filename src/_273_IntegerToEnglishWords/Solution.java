/**
 * Time : O() ; Space: O()
 * @tag : Math; String
 * @by  : Steven Cooks
 * @date: Sep 25, 2015
 ***************************************************************************
 * Description:
 * 
 * Convert a non-negative integer to its english words representation. 
 * Given input is guaranteed to be less than 231 - 1. 
 * 
 * For example, 
 * 123 -> "One Hundred Twenty Three" 
 * 12345 -> "Twelve Thousand Three Hundred Forty Five" 
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/integer-to-english-words/ }
 */
package _273_IntegerToEnglishWords;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _273_IntegerToEnglishWords.SolutionTest } */
public class Solution {
    
    private static final String[] DELIM = { "", " Thousand", " Million", " Billion" };
    
    @SuppressWarnings({ "serial" })
    private static final Map<Integer, String> WORDS = new HashMap<Integer, String>() {{
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
        put(10, "Ten");
        put(11, "Eleven");
        put(12, "Twelve");
        put(13, "Thirteen");
        put(14, "Fourteen");
        put(15, "Fifteen");
        put(16, "Sixteen");
        put(17, "Seventeen");
        put(18, "Eighteen");
        put(19, "Nineteen");
        put(20, "Twenty");
        put(30, "Thirty");
        put(40, "Forty");
        put(50, "Fifty");
        put(60, "Sixty");
        put(70, "Seventy");
        put(80, "Eighty");
        put(90, "Ninety");
        put(100, "Hundred");
    }};
    
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num != 0) {
            int partial = num % 1000;
            StringBuilder psb = convert(partial);
            if (psb.length() == 0) {
                i++;
            } else if (sb.length() == 0) {
                sb = psb.append(DELIM[i++]);
            } else {
                sb = psb.append(DELIM[i++]).append(" ").append(sb);
            }
            num = num / 1000;
        }
        return sb.toString();
    }
    
    // convert a number less than 1000
    private StringBuilder convert(int num) {
        if (num == 0) {
            return new StringBuilder();
        } else if (num < 20) {
            return new StringBuilder(WORDS.get(num));
        } else if (num % 100 == 0) {
            return new StringBuilder(WORDS.get(num / 100) + " Hundred");
        } else if (num > 100) {
            return new StringBuilder(WORDS.get(num / 100)  + " Hundred ").append(convert(num % 100));
        } else if (num % 10 == 0) {
            return new StringBuilder(WORDS.get(num));
        } else if (num > 10) {
            return new StringBuilder(WORDS.get(num / 10 * 10) + " " + WORDS.get(num % 10));
        } else {
            return new StringBuilder(); 
        }
    }

}
