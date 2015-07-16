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

        Arrays.sort(candidates);
        int index = 0;
        List<Integer> combination = new ArrayList<Integer>();
        combinationSum2(candidates, target, index, combination, result);
        return result;
    }

    private void combinationSum2(int[] candidates, int target, int index,
            List<Integer> combination, List<List<Integer>> result) {
        // base case
        if (target == 0) {
            // found one valid combination
            result.add(combination);
            // no need to check number [candidates[index], candidates[end]]
            // as next number in combination
            return;
        }

        // recursive case
        for (int i = index; i < candidates.length; i++) {
            // try each number as the next number put into combination
            if (i == index || candidates[i] != candidates[index]) {
                // skip duplicates in candidates
                int newTarget = target - candidates[i];
                if (newTarget < 0) {
                    // prune: no need to try larger number in candidates
                    // to put in current combination
                    break;
                }

                List<Integer> copy = new ArrayList<Integer>(combination);
                copy.add(candidates[i]);
                // go on search
                combinationSum2(candidates, newTarget, i + 1, copy, result);

                // TODO: advance index to i for duplicates check
                index = i;
            }
        }
    }

}
