/**
 * Time : O(N); Space: O(K)
 * @tag : Array; Hash Table
 * @date: Jun 24, 2015
 * @by  : Steven Cooks
 * {@link https://leetcode.com/problems/contains-duplicate-ii/ }
 * -------------------------------------------------------------
 * 1. because a restriction for length is given, then space can be 
 * saved by using set instead of hash map.
 */
package _219_ContainsDuplicateII;

import java.util.HashSet;
import java.util.Set;

/**
 * use set instead of hash map.
 * see test {@link _219_ContainsDuplicateII.SolutionSetTest } 
 */
public class SolutionSet {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // numbers that are within k steps before current number
        Set<Integer> withinK = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!withinK.add(num)) {
                return true;
            }
            if (i >= k) {
                // only keep the latest k numbers
                withinK.remove(nums[i - k]);
            }
        }
        return false;
    }
}
