/**
 * Time : O() ; Space: O()
 * @tag : Array; Backtracking
 * @by  : Steven Cooks
 * @date: Aug 22, 2015
 ***************************************************************************
 * Description:
 * 
 * Find all possible combinations of k numbers that add up to a number n, given 
 * that only numbers from 1 to 9 can be used and each combination should be a 
 * unique set of numbers. 
 * 
 * Ensure that numbers within the set are sorted in ascending order.
 * Example 1: Input: k = 3, n = 7 Output: [[1,2,4]] 
 * Example 2: Input: k = 3, n = 9 Output: [[1,2,6], [1,3,5], [2,3,4]]
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/combination-sum-iii/ }
 */
package _216_CombinationSumIII;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _216_CombinationSumIII.SolutionTest } */
public class Solution {

    private int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        int index = 0;
        int cur = 0;
        combine(k, index, n, cur, sub, res);
        return res;
    }

    private void combine(final int k, int index, int target, int cursum,
            List<Integer> sub, List<List<Integer>> res) {
        // base case
        if (sub.size() == k && cursum == target) {
            res.add(sub);
            return;
        }
        // recursive case
        for (int i = index; i < nums.length; i++) {
            int num = nums[i];
            // pruning siblings
            if (cursum + num > target || sub.size() >= k) {
                break;
            }
            List<Integer> copy = new ArrayList<>(sub);
            copy.add(num);
            combine(k, i + 1, target, cursum + num, copy, res);
        }
    }

}
