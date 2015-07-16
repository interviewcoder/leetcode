/**
 * Time : O(N^2); Space: O(N^2)
 * @tag : Array; Backtracking
 * @by  : Steven Cooks
 * @date: May 30, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a set of candidate numbers (C) and a target number (T), find all 
 * unique combinations in C where the candidate numbers sums to T. 
 * The same repeated number may be chosen from C unlimited number of times. 
 * 
 * Note: All numbers (including target) will be positive integers. 
 * Elements in a combination (a1, a2, … , ak) must be in non-descending 
 * order. (ie, a1 ≤ a2 ≤ … ≤ ak). 
 * The solution set must not contain duplicate combinations. 
 * 
 * For example, given candidate set 2,3,6,7 and target 7, 
 * A solution set is: 
 *  [7] 
 *  [2, 2, 3] 
 *  
 *************************************************************************
 * {@link https://leetcode.com/problems/combination-sum/ }
 */
package _039_CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/** see test {@link _039_CombinationSum.SolutionTest } */
public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Arrays.sort(candidates);
        int index = 0;
        recurse(new ArrayList<Integer>(), target, candidates, index, res);
        return res;
    }

    private void recurse(List<Integer> combination, int target,
            int[] candidates, int index, List<List<Integer>> result) {
        // base case
        if (target == 0) {
            // found one valid combination
            result.add(combination);
            // no need to search this path any more
            return;
        }

        // recursive case
        for (int i = index; i < candidates.length; i++) {
            int number = candidates[i];
            int newTarget = target - number;
            if (newTarget < 0) {
                // prune: next number in combination
                // cannot be [candidates[index], candidates[end]]
                return;
            } else {
                List<Integer> copy = new ArrayList<Integer>(combination);
                copy.add(number);

                // go to next level
                recurse(copy, newTarget, candidates, i, result);
            }
        }
    }

}
