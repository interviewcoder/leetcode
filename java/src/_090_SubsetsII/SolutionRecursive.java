/**
 * Time : O(); Space: O()
 * @tag : Array; Backtracking
 * @by  : Steven Cooks
 * @date: Jun 13, 2015
 ************************************************************************
 *  Given a collection of integers that might contain duplicates, nums,
 *  return all possible subsets. 
 *  
 *  Note: 
 *  Elements in a subset must be in non-descending order. 
 *  The solution set must not contain duplicate subsets. 
 *  
 *  For example, 
 *  If nums = [1,2,2], a solution is:
 *      [ [2], [1], [1,2,2], [2,2], [1,2], [] ]
 *      
 ************************************************************************
 * {@link https://leetcode.com/problems/subsets-ii/ }
 */
package _090_SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** see test {@link _090_SubsetsII.SolutionRecursiveTest } */
public class SolutionRecursive {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int pos = 0;
        Arrays.sort(nums);
        subsetsHelper(nums, pos, list, result);
        return result;
    }

    private void subsetsHelper(int[] nums, int pos, List<Integer> list,
            List<List<Integer>> result) {
        result.add(new ArrayList<>(list));
        for (int i = pos; i < nums.length; i++) {
            // skip duplicates appearing at position i of subsets.
            if (i != pos && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            subsetsHelper(nums, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }

}
