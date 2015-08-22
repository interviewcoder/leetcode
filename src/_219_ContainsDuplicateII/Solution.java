/**
 * Time : O(N); Space: O(N)
 * @tag : Array; Hash Table
 * @date: Jun 24, 2015
 * @by  : Steven Cooks
 ****************************************************************************
 * Description:
 *
 * Given an array of integers and an integer k, find out whether there there
 * are two distinct indices i and j in the array such that nums[i] = nums[j] 
 * and the difference between i and j is at most k.
 * 
 ****************************************************************************
 * {@link https://leetcode.com/problems/contains-duplicate-ii/ }
 */
package _219_ContainsDuplicateII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k < 0 || nums.length == 0) {
            return false;
        }
        Map<Integer, Integer> posMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (posMap.containsKey(num) && (i - posMap.get(num) <= k)) {
                return true;
            }
            posMap.put(num, i);
        }
        return false;
    }
}
