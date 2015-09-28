/**
 * Time : O() ; Space: O()
 * @tag : Hash Table; Math
 * @by  : Steven Cooks
 * @date: Sep 27, 2015
 ***************************************************************************
 * Description:
 * 
 * Given two integers representing the numerator and denominator of a fraction, 
 * return the fraction in string format. 
 * 
 * If the fractional part is repeating, enclose the repeating part in parentheses. 
 * 
 * For example, 
 * 
 *  Given numerator = 1, denominator = 2, return "0.5". 
 *  Given numerator = 2, denominator = 1, return "2". 
 *  Given numerator = 2, denominator = 3, return "0.(6)".
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/fraction-to-recurring-decimal/ }
 * 1. big integer : stack overflow issue
 */
package _166_FractionToRecurringDecimal;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _166_FractionToRecurringDecimal.SolutionTest } */
public class Solution {

    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            return "";
        }
        if (numerator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if ((numerator > 0 && denominator < 0) || (numerator < 0 && denominator > 0)) {
            sb.append("-");
        }
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // integral part
        sb.append(num / den);
        if (num % den == 0) {
            return sb.toString();
        }
        sb.append(".");

        // decimal part
        num = num % den * 10;
        Map<Long, Integer> index = new HashMap<>();
        int recur = -1;
        while (num != 0) {
            if (index.containsKey(num)) {
                recur = index.get(num);
                break;
            }
            index.put(num, sb.length());
            sb.append(num / den);
            num = num % den * 10;
        }
        if (recur != -1) {
            sb.insert(recur, "(");
            sb.append(")");
        }
        return sb.toString();
    }

}
