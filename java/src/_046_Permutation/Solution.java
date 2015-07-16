/**
 * Time : O(N^2); Space: O(N^2)
 * @tag : Backtracking
 * @by  : Steven Cooks
 * @date: Jun 2, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a collection of numbers, return all possible permutations. 
 * 
 * For example, [1,2,3] have the following permutations: 
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 *
 *************************************************************************
 * {@link https://leetcode.com/problems/permutations/ }
 */
package _046_Permutation;

import java.util.ArrayList;
import java.util.List;

//TODO: iterative method
/** see test {@link _046_Permutation.SolutionTest } */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return result;
        }
        List<Integer> permutation = new ArrayList<Integer>();
        int index = 0;
        permuate(nums, index, permutation, result);
        return result;
    }

    private void permuate(int[] nums, int index, List<Integer> permutation,
            List<List<Integer>> result) {
        // base case
        if (index == nums.length) {
            // one permutation finished
            result.add(permutation);
        }

        // recursive case
        for (int i = index; i < nums.length; i++) {
            // try each number among nums[index] ,...,nums[end]
            // to place at permutation[index]

            // swap nums[index] with nums[i]
            swap(nums, i, index);

            List<Integer> copy = new ArrayList<Integer>(permutation);
            copy.add(nums[index]);

            // go on searching
            permuate(nums, index + 1, copy, result);

            // swap back before going back to upper level
            swap(nums, index, i);
        }

    }

    private void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }

}
