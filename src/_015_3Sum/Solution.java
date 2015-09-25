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

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/** see test {@link _015_3Sum.SolutionTest } */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // skip duplicates
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // number will serve as the 1st number in triplet candidate
            int num = nums[i];
            int left = i + 1;
            int right = n - 1;
            int target = 0 - num;
            // try to find two numbers that sum up to target
            while (left < right) {
                int twoSum = nums[left] + nums[right];
                if (twoSum < target) {
                    left++;
                } else if (twoSum > target) {
                    right--;
                } else {
                    // found one combination
                    result.add(new ArrayList<>(Arrays.asList(num, nums[left], nums[right])));
                    while (left + 1 < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    left++;
                    while (right - 1 > left && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;
                }
            }
        }
        return result;
    }

}
