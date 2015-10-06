/**
 * Time : O(N!); Space: O(N!)
 * @tag : Backtracking
 * @by  : Steven Cooks
 * @date: Jun 2, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given a collection of numbers that might contain duplicates, return all 
 * possible unique subs. 
 * 
 * For example, 
 * [1,1,2] have the following unique subs: 
 * [1,1,2], [1,2,1], and [2,1,1].
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/subs-ii/ }
 * P.S.: cannot skip duplicates using while (nums[i] == duplicate) because
 * after swapping, duplicates may be separated (one duplicate is swapped with
 * and goes to somewhere else disconnected with other duplicates)
 */
package _047_PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** see test {@link _047_PermutationsII.SolutionTest } */
public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        int index = 0;
        List<Integer> sub = new ArrayList<Integer>();
        permuteUnique(nums, index, sub, result);
        return result;
    }

    private void permuteUnique(int[] nums, int index, List<Integer> sub,
            List<List<Integer>> result) {
        // base case
        if (index == nums.length) {
            // one valid sub found
            result.add(sub);
            return;
        }

        // recursive case
        // either use set or sort nums[index]:nums[end] to avoid duplicates
        Set<Integer> appearred = new HashSet<Integer>();
        for (int i = index; i < nums.length; i++) {
            if (appearred.contains(nums[i])) {
                // duplicates appear
                continue;
            }
            appearred.add(nums[i]);
            // swap nums[i] with nums[index]
            swap(nums, i, index);

            // go on searching
            List<Integer> copy = new ArrayList<Integer>(sub);
            copy.add(nums[index]);
            permuteUnique(nums, index + 1, copy, result);

            // swap back nums[i] with nums[index]
            swap(nums, index, i);

        }
    }

    // swap two numbers in an array
    private void swap(int[] nums, int i, int index) {
        if (i < nums.length && index < nums.length) {
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }

}
