/**
 * Time : O(N) ; Space: O()
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Sep 30, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a sorted integer array where the range of elements are [lower, upper] 
 * inclusive, return its missing ranges. 
 * 
 * For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, 
 * return ["2", "4->49", "51->74", "76->99"].
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/missing-ranges/ }
 */
package _163_MissingRanges;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _163_MissingRanges.SolutionTest } */
public class Solution {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        int exp = lower;
        int i = 0;
        // don't forget the last possible missing range
        while (i <= nums.length && exp <= upper) {
            int num = i == nums.length ? upper + 1 : nums[i];
            if (num > upper) {
                num = upper + 1;
            }
            if(num != exp) {
                StringBuilder sb = new StringBuilder("" + exp);
                if (num != exp + 1) {
                    sb.append("->").append(num - 1);
                } 
                res.add(sb.toString());
            }
            exp = num + 1;
            i++;
        }
        return res;
    }

}
