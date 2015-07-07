/**
 * Time : O(); Space : O()
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Jul 6, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given an integer array of size n, find all elements that appear more 
 * than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/majority-element-ii/ }
 */
package _229_MajorityElementII;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _229_MajorityElementII.SolutionTest} */
public class Solution {

    public List<Integer> majorityElement(int[] nums) {
        int cand1 = 0;
        int cand2 = 1;
        int count1 = 0;
        int count2 = 0;
        for (int num : nums) {
            if (num == cand1) {
                count1++;
            } else if (num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        // find answers
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == cand1) {
                count1++;
            } else if(num == cand2) {
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) {
            result.add(cand1);
        }
        if (count2 > nums.length / 3) {
            result.add(cand2);
        }
        return result;
    }

}
