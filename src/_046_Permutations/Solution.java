/**
 * Time : O(N!); Space: O(N!)
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
package _046_Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** see test {@link _046_Permutations.SolutionTest } */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return result;
        }
        // put the seed set into result
        result.add(new ArrayList<>(Arrays.asList(nums[0])));
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            List<List<Integer>> next = new ArrayList<>();
            // try to insert num into each existing sets in result
            for (int j = 0; j <= i; j++) {
                // insert num[i] at position j of each existing set
                for (List<Integer> list : result) {
                    // create new copy of list is faster than operation on
                    // the same code
                    List<Integer> expanding = new ArrayList<>(list);
                    expanding.add(j, num);
                    next.add(expanding);
                    
                    //slow version: because list.remove() is O(N)
//                    list.add(j, num);
//                    next.add(list);
//                    list.remove(j);
                }
            }
            result = next;
        }
        return result;
    }

}
