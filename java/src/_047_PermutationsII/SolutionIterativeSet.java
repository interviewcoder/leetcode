/**
 * Time : O(); Space: O()
 * @tag : Backtracking
 * @by  : Steven Cooks
 * @date: Jun 2, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given a collection of numbers that might contain duplicates, return all 
 * possible unique permutations. 
 * 
 * For example, 
 * [1,1,2] have the following unique permutations: 
 * [1,1,2], [1,2,1], and [2,1,1].
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/permutations-ii/ }
 */
package _047_PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** see test {@link _047_PermutationsII.SolutionIterativeSetTest } */
public class SolutionIterativeSet {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        // put the seed set into result
        result.add(new ArrayList<>(Arrays.asList(nums[0])));
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            List<List<Integer>> next = new ArrayList<>();
            Set<List<Integer>> visited = new HashSet<>();
            // try to insert num into each existing sets in result
            for (List<Integer> list : result) {
                // insert num[i] at position j of each existing set
                for (int j = 0; j <= i; j++) {
                    List<Integer> expanding = new ArrayList<>(list);
                    expanding.add(j, num);
                    if (!visited.contains(expanding)) {
                        next.add(expanding);
                        visited.add(expanding);
                    }
                }
            }
            result = next;
        }
        return result;
    }

}
