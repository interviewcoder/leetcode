/**
 * Time : O(N!); Space: O(N!)
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
import java.util.List;

/**
 * @reference {@link https://leetcode.com/discuss/22575/iterative-python-solution-without-using-set-111ms?show=22575#q22575 }
 * If no duplicates exist, for each number to insert, it can insert each possible
 * positions in existing permutation. For duplicates, only insert before the duplicated one.
 * 
 * For example, assuming we are going to insert 2 into below subset.
 * 
 *    _ 1 _ 2 _ 2 _
 *    |              => 2, 1, 2, 2
 *        |          => 1, 2, 2, 2 and break
 *    
 * <p> 
 * see test {@link _047_PermutationsII.SolutionIterativeTest }
 */
public class SolutionIterative {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return result;
        }
        result.add(new ArrayList<>(Arrays.asList(nums[0])));
        for (int i = 1; i < nums.length; i++) {
            // try to insert num into existing permutations
            int num = nums[i];
            List<List<Integer>> next = new ArrayList<>();
            for (List<Integer> list : result) {
                for (int j = 0; j <= i; j++) {
                    if (j > 0 && list.get(j - 1) == num) {
                        break;
                    }
                    List<Integer> expanding = new ArrayList<>(list);
                    expanding.add(j, num);
                    next.add(expanding);
                }
            }
            result = next;
        }
        return result;
    }

}
