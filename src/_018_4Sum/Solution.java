/**
 * Time : O(N^3); Space: O(N^2)
 * @tag : Array; Hash Table; Two Pointers;
 * @by  : Steven Cooks
 * @date: May 5, 2015
 *************************************************************************
 * Description: 
 * 
 * Given an array S of n integers, are there elements a, b, c, and d in S 
 * such that a + b + c + d = target? Find all unique quadruplets in the 
 * array which gives the sum of target. 
 * 
 * Note: 
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. 
 * (ie, a ≤ b ≤ c ≤ d) 
 * The solution set must not contain duplicate quadruplets. 
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0. 
 * A solution set is: (-1,  0, 0, 1) (-2, -1, 1, 2) (-2,  0, 0, 2)
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/4sum/ }
 */
package _018_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** see test {@link _018_4Sum.SolutionTest } */
public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int len = nums.length;
        if (len < 4) {
            // not enough numbers
            return result;
        }

        Arrays.sort(nums);

        // for each number that can be the 1st number of quadruplet
        for (int i = 0; i < len - 3; i++) {
            int firstNumber = nums[i];
            // skip to next possible first number
            if (i == 0 || firstNumber != nums[i - 1]) {
                for (int j = i + 1; j < len - 2; j++) {
                    // skip duplicates
                    int secondNumber = nums[j];
                    if (j == i + 1 || secondNumber != nums[j - 1]) {
                        int twoSumTarget = target - firstNumber - secondNumber;
                        int leftIndex = j + 1;
                        int rightIndex = len - 1;
                        while (leftIndex < rightIndex) {
                            int twoSum = nums[leftIndex] + nums[rightIndex];
                            if (twoSum == twoSumTarget) {
                                // found one !
                                result.add(Arrays.asList(firstNumber,
                                        secondNumber, nums[leftIndex],
                                        nums[rightIndex]));
                                // jump duplicates from left to right
                                while (leftIndex < rightIndex
                                        && nums[leftIndex] == nums[leftIndex + 1]) {
                                    leftIndex++;
                                }
                                // skip duplicates from right to left
                                while (leftIndex < rightIndex
                                        && nums[rightIndex] == nums[rightIndex - 1]) {
                                    rightIndex--;
                                }
                                leftIndex++;
                                rightIndex--;
                            } else if (twoSum < twoSumTarget) {
                                leftIndex++;
                            } else {
                                rightIndex--;
                            }
                        }
                    }
                }
            }
        }
        return result;

    }

}
