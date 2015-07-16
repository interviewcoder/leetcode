/**
 * Time : O(N^2); Space: O(N)
 * @tag : Array; Two Pointers;
 * @by  : Steven Cooks
 * @date: May 2, 2015
 ***************************************************************************
 * Description:
 * 
 * Given an array S of n integers, are there elements a, b, c in S such that 
 * a + b + c = 0? Find all unique triplets in the array which gives the sum 
 * of zero. 
 * 
 * Note: 
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c) 
 * The solution set must not contain duplicate triplets. 
 * For example, given array S = {-1 0 1 2 -1 -4}, 
 * A solution set is: (-1, 0, 1) (-1, -1, 2)
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/3sum/ }
 */
package _015_3Sum;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/** see test {@link _015_3Sum.SolutionTest } */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // number will serve as the 1st number in triplet candidate
            int number = nums[i];
            // skip duplicated numbers who serve as 1st number in triplet.
            // so that we don't need set or map to avoid duplicates.
            if (i == 0 || number != nums[i - 1]) {
                int leftIndex = i + 1;
                int rightIndex = nums.length - 1;
                int twoSumTarget = 0 - number;
                // try to find two numbers that sum up to twoSumTarget
                while (leftIndex < rightIndex) {
                    int twoSum = nums[leftIndex] + nums[rightIndex];
                    if (twoSum == twoSumTarget) {
                        // one valid triplet found!!!
                        result.add(Arrays.asList(number, nums[leftIndex],
                                nums[rightIndex]));
                    }

                    if (twoSum <= twoSumTarget) {
                        // skip duplicates with nums[leftIndex]
                        while (leftIndex < rightIndex
                                && nums[leftIndex] == nums[leftIndex + 1]) {
                            leftIndex++;
                        }
                        // move to next non-duplicate number
                        leftIndex++;
                    }
                    if (twoSum >= twoSumTarget) {
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
