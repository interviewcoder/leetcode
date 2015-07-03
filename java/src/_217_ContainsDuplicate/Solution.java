/**
 * Time : O(); Space: O()
 * @tag : Array; Hash Table
 * @date: Jun 24, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description: 
 * 
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice 
 * in the array, and it should return false if every element is distinct.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/contains-duplicate/ }
 */
package _217_ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

/** see test {@link _217_ContainsDuplicate.SolutionTest } */
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> appeared = new HashSet<>();
        for (int num : nums) {
            if (appeared.contains(num)) {
                return true;
            }
            appeared.add(num);
        }
        return false;
    }

}
