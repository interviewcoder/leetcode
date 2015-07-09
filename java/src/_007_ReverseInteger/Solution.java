/**
 * Time : O(); Space : O()
 * @tag : Math
 * @by  : Steven Cooks
 * @date: Jul 8, 2015
 *************************************************************************
 * Description: 
 * 
 * Reverse digits of an integer. 
 * 
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321 
 * 
 * Return 0 if the result overflows and does not fit in a 32 bit signed integer
 *
 *************************************************************************
 * {@link https://leetcode.com/problems/reverse-integer/ }
 */
package _007_ReverseInteger;

/** see test {@link _007_ReverseInteger.SolutionTest } */
public class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            // adding the last digit from original number
            result = result * 10 + x % 10;
            x /= 10;
        }
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;
    }
}
