/**
 * Time : O(); Space: O()
 * @tag : Array; Backtracking; Bit Manipulation
 * @by  : Steven Cooks
 * @date: Jun 7, 2015
 *************************************************************************
 * Description: 
 * 
 * My Submissions Question Solution 
 * Given a set of distinct integers, nums, return all possible subsets. 
 * 
 * Note: Elements in a subset must be in non-descending order. 
 * The solution set must not contain duplicate subsets. 
 * For example, If nums = [1,2,3], a solution is: 
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/subsets/ }
 */
package _078_Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** see test {@link _078_Subsets.SolutionTest } */
public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        int pos = 0;
        // sort because it is required to put elements in non-descending order
        Arrays.sort(nums);
        subsetsHelper(nums, pos, list, result);
        return result;
    }

    private void subsetsHelper(int[] nums, int pos, List<Integer> list,
            List<List<Integer>> result) {
        // ! not result.add(list)
        result.add(new ArrayList<>(list));
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            // ! not (pos + 1)
            subsetsHelper(nums, i + 1, list, result);
            list.remove(list.size() - 1);
        }
        
    }

}
