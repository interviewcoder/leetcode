/**
 * Time : O(NlgK); Space : O()
 * @tag : Binary Search Tree
 * @by  : Steven Cooks
 * @date: Jul 3, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given an array of integers, find out whether there are two distinct 
 * indices i and j in the array such that the difference between nums[i] 
 * and nums[j] is at most t and the difference between i and j is at most k.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/contains-duplicate-iii/ }
 */
package _220_ContainsDuplicateIII;

import java.util.TreeSet;

/** see test {@link _220_ContainsDuplicateIII.SolutionTest } */
public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> values = new TreeSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // remove values that are out of current window
            int num = nums[i];
            // in case of integer overflow
            Long floor = values.floor((long) num);
            Long ceiling = values.ceiling((long) num);
            if ((floor != null && num - floor <= t) || (ceiling != null && ceiling - num <= t)) {
                return true;
            }
            values.add((long) num);
            if (i >= k) {
                values.remove((long)nums[i - k]);
            }
        }
        return false;

    }

}
