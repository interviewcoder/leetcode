/**
 * Time : O(2^n); Space: O()
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

    // try to insert each number into all existing subsets
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        // push initial empty subset
        res.add(new ArrayList<>());

        for (int num : nums) {
            int sz = res.size(); // we don't need temp list any more
            for (int i = 0; i < sz; i++) {
                List<Integer> list = new ArrayList<>(res.get(i));
                list.add(num);
                res.add(list);
            }
        }
        return res;
    }
    
    // we have to use temporary list
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        // push initial empty subset
        res.add(new ArrayList<>());

        for (int num : nums) {
            // try insert num into all existing subsets
            List<List<Integer>> temp = new ArrayList<>(); 
            for (List<Integer> sub : res) {
                List<Integer> list = new ArrayList<>(sub);
                list.add(num);
                temp.add(list);
            }
            res.addAll(temp);
        }
        return res;
    }

}
