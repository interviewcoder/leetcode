/**
 * Time : O(N*M); Space: O()
 * @tag : Math; Array
 * @by  : Steven Cooks
 * @date: Jun 4, 2015
 *************************************************************************
 * Description: 
 * 
 * Given two numbers represented as strings, return multiplication of
 * the numbers as a string. 
 * 
 * Note: The numbers can be arbitrarily large and are non-negative.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/multiply-strings/ }
 */
package _043_MultiplyStrings;

import java.math.BigInteger;

/** see test {@link _043_MultiplyStrings.SolutionBigIntegerTest } */
public class SolutionBigInteger {

    public String multiply(String num1, String num2) {
        // cheating way: use BigInteger class in Java
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        return b1.multiply(b2).toString();
    }

}
