/**
 * Time : O(); Space: O()
 * @tag : Backtracking
 * @by  : Steven Cooks
 * @date: Jun 6, 2015
 *************************************************************************
 * Description: 
 * Given two integers n and k, return all possible combinations of k numbers 
 * out of 1 ... n. 
 * For example, 
 * If n = 4 and k = 2, a solution is: 
 * [ [2,4], [3,4], [2,3], [1,2], [1,3], [1,4] ]
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/combinations/ }
 */
package _077_Combinations;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _077_Combinations.SolutionTest } */
public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > n) {
            return result;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        combineHelper(n, k, index, list, result);
        return result;
    }
    
    private void combineHelper(int n, int k, int index, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
        }
        if (list.size() > k) {
            return;
        }
        for (int i = index; i < n; i++) {
            list.add(i + 1);
            combineHelper(n, k, i + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
    
}
