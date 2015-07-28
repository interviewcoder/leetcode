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

/** 
 * 
 * see test {@link _090_SubsetsII.SolutionTest } , see recursive solution
 * {@link _090_SubsetsII.SolutionRecursive } 
 */
public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // empty list is subset of any list
        result.add(new ArrayList<>());
        // enlarged size by last non-repeated number
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int size = result.size();
            int start = 0;
            if (i == 0 || num != nums[i - 1]) {
                k = size;
            } else {
                // for repeating number
                start = size - k;
            }
            // for a non-repeated number, a new number will double the size of current result
            // by adding this number to each of existing subset;
            // for a repeated number, this repeated number will only change
            // those "new subsets" created by last number in the loop
            for (int j = start; j < size; j++) {
                List<Integer> list = new ArrayList<>(result.get(j));
                list.add(num);
                result.add(list);
            }
        }
        return result;
    }

}
