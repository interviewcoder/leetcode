/**
 * Time : O() ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Aug 7, 2015
 ***************************************************************************
 * Description:
 * 
 * Give you an integer array (index from 0 to n-1, where n is the size of 
 * this array)，find the longest increasing continuous subsequence in this array.
 * (The definition of the longest increasing continuous subsequence here can 
 * be from right to left or from left to right)
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/longest-increasing-continuous-subsequence/ }
 */
package s04_LongestIncreasingContinuousSubsequence;

/** see test {@link s04_LongestIncreasingContinuousSubsequence.SolutionTest } */
public class Solution {

    public int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        if (A.length == 0) {
            return 0;
        }
        int result = 1;
        int count = 1;
        int down = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) {
                count++;
                down = 1;
            } else {
                down++;
                count = 1;
            }
            result = Math.max(result, Math.max(down, count));
        }
        return result;
    }

}
