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
public class SolutionTemplate {

    // take advantage of binary search template
    /** 
     * Since target is in [left, right], reduce to only two numbers left,
     * then solve the subproblem.
     */
    public int mySqrt(int x) {
        if (x <= 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid;
            } else {
                left = mid;
            }
        }
        // [left, target, right], choose between left and right
        if (left == x / left) {
            return left;
        } else if (right == x / right) {
            return right;
        } else {
            return left;
        }
    }

}
