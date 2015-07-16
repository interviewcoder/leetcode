/**
 * Time : O(N); Space: O(1)
 * @tag : Math; Binary Search
 * @by  : Steven Cooks
 * @date: May 9, 2015
 *************************************************************************
 * Description: 
 * 
 * Divide two integers without using multiplication, division and mod operator. 
 * If it is overflow, return MAX_INT.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/divide-two-integers/ }
 */
package _029_DivideTwoIntegers;

/** see test {@link _029_DivideTwoIntegers.SolutionTest } */
public class Solution {

    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && Math.abs(divisor) == 1) {
            return Integer.MAX_VALUE;
        }

        int sign = (dividend > 0 ^ divisor > 0) ? -1 : 1;

        long ans = 0;
        long end = Math.abs((long) dividend);
        long sor = Math.abs((long) divisor);

        while (end >= sor) {
            long temp = sor;
            long power = 1;
            while ((temp << 1) < end) {
                power <<= 1;
                temp <<= 1;
            }
            ans += power;
            end -= temp;

        }
        return (int) (sign * ans);
    }

}
