/**
 * Time : O(N^2); Space: O(N^2)
 * @tag : Array; Backtracking
 * @by  : Steven Cooks
 * @date: Jun 1, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a collection of candidate numbers (C) and a target number (T), 
 * find all unique combinations in C where the candidate numbers sums to T. 
 * 
 * Each number in C may only be used once in the combination. 
 * 
 * Note: 
 * All numbers (including target) will be positive integers. 
 * Elements in a combination (a1, a2, … , ak) must be in non-descending 
 * order. (ie, a1 ≤ a2 ≤ … ≤ ak). 
 * 
 * The solution set must not contain duplicate combinations. 
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
 * 
 * A solution set is: [1, 7] [1, 2, 5] [2, 6] [1, 1, 6] 
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/combination-sum-ii/ }
 */
package _040_CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** see test {@link _040_CombinationSumII.SolutionTest } */
public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> combination = new ArrayList<Integer>();
        Arrays.sort(candidates);
        int index = 0;
        combinationSum2(candidates, target, index, combination, result);
        return result;
    }

    private void combinationSum2(int[] nums, int target, int index,
            List<Integer> combination, List<List<Integer>> result) {
        // base case
        if (target == 0) {
            // found one valid combination
            result.add(combination);
        }

        // recursive case
        // try each number as the next number put into combination
        for (int i = index; i < nums.length; i++) {
            int num = nums[i];
            if (i != index && num == nums[i - 1]) {
                // skip duplicate at the same position of resulting combination
                continue;
            }
            if (target - num < 0) {
                // prune: no need to try larger number in candidates
                // to put in current combination
                // no need to check later siblings
                break;
            }
            List<Integer> copy = new ArrayList<Integer>(combination);
            copy.add(num);
            combinationSum2(nums, target - num, i + 1, copy, result);
        }
    }

}
