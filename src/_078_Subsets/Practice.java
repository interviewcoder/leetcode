/**
 *************************************************************************
 * Description: 
 * 
 * My Submissions Question Practice 
 * Given a set of distinct integers, nums, return all possible subsets. 
 * 
 * Note: Elements in a subset must be in non-descending order. 
 * The solution set must not contain duplicate subsets. 
 * For example, If nums = [1,2,3], a solution is: 
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 * 
 *************************************************************************
 * @tag : Array; Backtracking; Bit Manipulation
 * {@link https://leetcode.com/problems/subsets/ }
 */
package _078_Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** see test {@link _078_Subsets.PracticeTest } */
public class Practice {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> subset = new ArrayList<>();
        int index = 0;
        subsets(index, subset, nums, result);
        return result;
    }

    private void subsets(int index, List<Integer> subset, int[] nums, List<List<Integer>> result) {
        // base case
        result.add(new ArrayList<>(subset));
        // recursive case
        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            subsets(i + 1, subset, nums, result);
            subset.remove(subset.size() - 1);
        }
    }


}
