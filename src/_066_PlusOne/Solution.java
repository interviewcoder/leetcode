/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Math
 * @by  : Steven Cooks
 * @date: Jul 6, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a non-negative number represented as an array of digits, plus one 
 * to the number. 
 * The digits are stored such that the most significant digit is at the 
 * head of the list.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/plus-one/ }
 */
package _066_PlusOne;

/** see test {@link _066_PlusOne.SolutionTest } */
public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] result = new int[len];

        // one to plus
        int carry = 1;
        // loop digits backwards
        for (int i = len - 1; i >= 0; i--) {
            int digit = carry + digits[i];
            result[i] = digit % 10;
            carry = digit / 10;
        }

        if (carry != 0) {
            // 99...9 scenario
            result = new int[len + 1];
            result[0] = 1;
        }
        return result;
    }
}
