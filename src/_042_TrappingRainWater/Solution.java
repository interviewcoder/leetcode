/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Stack; Two Pointers
 * @by  : Steven Cooks
 * @date: Jul 15, 2015
 **************************************************************************
 * Description: 
 * 
 * Given n non-negative integers representing an elevation map where the 
 * width of each bar is 1, compute how much water it is able to trap after raining. 
 * 
 * For example, 
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/trapping-rain-water/ }
 */
package _042_TrappingRainWater;

/** * see test {@link _042_TrappingRainWater.SolutionTest } */
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
                    result += leftBarrier - height[left];
                }
                left++;
            } else {
                if (height[right] > rightBarrier) {
                    // update right barrier
                    rightBarrier = height[right];
                } else {
                    result += rightBarrier - height[right];
                }
                right--;
            }
        }
        return result;
    }

}
