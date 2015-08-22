/**
 * Time : O(N^2); Space: O(N)
 * @tag : Array; Two Pointers
 * @by  : Steven Cooks
 * @date: May 2, 2015
 *************************************************************************
 * Description: 
 * 
 * Given an array S of n integers, find three integers in S such that the 
 * sum is closest to a given number, target. Return the sum of the three 
 * integers. You may assume that each input would have exactly one solution. 
 * 
 * For example, given array S = {-1 2 1 -4}, and target = 1. 
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/3sum-closest/ }
 */
package _016_3SumClosest;

import java.util.Arrays;

/** see test {@link _016_3SumClosest.SolutionTest } */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        int result = target;
        int len = nums.length;
        if (len < 3) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            int number = nums[i];

            int leftIndex = i + 1;
            int rightIndex = len - 1;
            while (leftIndex < rightIndex) {
                int threeSum = number + nums[leftIndex] + nums[rightIndex];
                if (threeSum == target) {
                    // best result found!
                    return target;
                } else {
                    // update global result
                    if (result == target
                            || Math.abs(target - threeSum) < Math.abs(target - result)) {
                        result = threeSum;
                    }
                    if (threeSum < target) {
                        while (leftIndex < rightIndex
                                && nums[leftIndex] == nums[leftIndex + 1]) {
                            leftIndex++;
                        }
                        leftIndex++;
                    } else {
                        while (leftIndex < rightIndex
                                && nums[rightIndex] == nums[rightIndex - 1]) {
                            rightIndex--;
                        }
                        rightIndex--;
                    }
                }
            }
        }
        return result;
    }

}
