/**
 * Time : O(N); Space : O(N)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Jul 3, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a sorted integer array without duplicates, return the summary of its ranges. 
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/summary-ranges/  }
 */
package _228_SummaryRanges;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _228_SummaryRanges.SolutionTest } */
public class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        // index of which number we are checking
        int index = 0;
        int len = nums.length;
        while (index < len) {
            int start = index;   // start index of current range
            while (index + 1 < len && nums[index + 1] == nums[index] + 1) {
                index++;         // range is enlarging
            }
            if (index > start) { // we meet a range
                result.add(nums[start] + "->" + nums[index]);
            } else {            // we meet a single number
                result.add(nums[start] + "");
            }
            index++;
        }
        return result;
    }

}
