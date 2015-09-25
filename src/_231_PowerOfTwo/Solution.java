/**
 * Time : O() ; Space: O()
 * @tag : Math; Bit Manipulation
 * @by  : Steven Cooks
 * @date: Sep 24, 2015
 ***************************************************************************
 * Description:
 *
 * Given an integer, write a function to determine if it is a power of two.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/power-of-two/ }
 */
package _231_PowerOfTwo;

/** see test {@link _231_PowerOfTwo.SolutionTest } */
public class Solution {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

}
