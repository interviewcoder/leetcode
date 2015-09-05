/**
 * Time : O(N) ; Space: O(1)
 * @tag : Array; Greedy
 * @by  : Steven Cooks
 * @date: Sep 5, 2015
 ***************************************************************************
 * Description:
 * 
 * Given an array of non-negative integers, you are initially positioned 
 * at the first index of the array. 
 * 
 * Each element in the array represents your maximum jump length at that position. 
 * Your goal is to reach the last index in the minimum number of jumps. 
 * 
 * For example: Given array A = [2,3,1,1,4] 
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step 
 * from index 0 to 1, then 3 steps to the last index.)
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/jump-game-ii/ }
 */
package _045_JumpGameII;

/** see test {@link _045_JumpGameII.SolutionTest } */
public class Solution {

    public int jump(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int start = 0, end = 0, jumps = 0;
        while (end < A.length - 1) {
            jumps++;
            int farthest = end;
            for (int i = start; i <= end; i++) {
                if (A[i] + i > farthest) {
                    farthest = A[i] + i;
                }
            }
            start = end + 1;
            end = farthest;
        }
        return jumps;
    }

}
