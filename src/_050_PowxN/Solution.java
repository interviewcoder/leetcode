/**
 * Time : O(logN); Space: O(1)
 * @tag : Math; Binary Search
 * @by  : Steven Cooks
 * @date: Jun 2, 2015
 ***************************************************************************
 * Description: 
 * 
 * Implement pow(x, n).
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/powx-n/ }
 * P.S. : 1. deal with StackOverflow
 *        2. bit operation to judge for odd or even number
 */
package _050_PowxN;

/** see test {@link _050_PowxN.SolutionTest } */
public class Solution {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        // local cache
        double result = myPow(x, n / 2);
        result *= result;
        if ((n & 0x1) == 1) {
            // if n is odd number: only if last bit in n is 1, n & 0x1 can be 1
            // pay attention to negative n
            result *= n > 0 ? x : (1 / x);
        }
        return result;
    }

}
