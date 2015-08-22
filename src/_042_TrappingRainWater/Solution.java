/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Stack; Two Pointers
 * @by  : Steven Cooks
 * @date: Jul 15, 2015
 *************************************************************************
 * Description: 
 * 
 * Given an unsorted integer array, find the first missing positive integer. 
 * 
 * For example, Given [1,2,0] return 3, 
 * and [3,4,-1,1] return 2. 
 * 
 * Your algorithm should run in O(n) time and uses constant space.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/trapping-rain-water/ }
 */
package _042_TrappingRainWater;

/**
 * O(1) space solution, and there is another O(N) solution
 * {@link _042_TrappingRainWater.SolutionStack } 
 * see test {@link _042_TrappingRainWater.SolutionTest }
 */
public class Solution {

    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftBarrier = 0;
        int rightBarrier = 0;
        int result = 0;

        while (left <= right) {
            if (leftBarrier <= rightBarrier) {
                // there could be a basin between leftBarrier and rightBarrier
                // and left side is lower one
                if (height[left] > leftBarrier) {
                    // update left barrier
                    leftBarrier = height[left];
                } else {
                    // trap water (leftBarrier - height[left]) * 1
                    result += leftBarrier - height[left];
                }
                left++;
            } else {
                if (height[right] > rightBarrier) {
                    // update right barrier
                    rightBarrier = height[right];
                } else {
                    // trap water (rightBarrier - height[right]) * 1
                    result += rightBarrier - height[right];
                }
                right--;
            }
        }
        return result;
    }

}
