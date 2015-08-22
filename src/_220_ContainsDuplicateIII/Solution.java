/**
 * Time : O(); Space : O()
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

import java.util.HashSet;
import java.util.Set;

/** see test {@link _220_ContainsDuplicateIII.SolutionTest } */
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums.length < 2) {
            return false;
        }
        int maxHeight = 0;
        int minHeight = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (number <= maxHeight + t && number >= minHeight - t) {
                // within boundary
                return true;
            }
            if (numSet.size() == k) {
                // update set by deleting the leftmost number
                numSet.remove(nums[i - k]);
            }
            numSet.add(number);
        }
        return false;
    }
}
