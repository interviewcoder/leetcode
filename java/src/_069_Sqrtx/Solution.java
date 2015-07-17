/**
 * Time : O(logN); Space: O(1)
 * @tag : Math; Binary Search
 * @by  : Steven Cooks
 * @date: Jun 5, 2015
 *************************************************************************
 * Description
 * 
 * Implement int sqrt(int x). 
 * Compute and return the square root of x.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/sqrtx/ }
 */
package _069_Sqrtx;

/** see test {@link _069_Sqrtx.SolutionTest } */
public class Solution {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        while (true) {
            int half = (left + right) / 2;
            if (half == x / half) {
                return half;
            } else if (half > x / half) {
                // instead of (half * half) > x to avoid stack overflow
                right = half - 1;
            } else {
                if ((half + 1) > x / (half + 1)) {
                    return half;
                }
                left = half + 1;
            }
        }
    }

}
