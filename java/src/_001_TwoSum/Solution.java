/**
 * Time : O(N) ; Space: O(N)
 * @tag : Array; Hash Table
 * @by  : Steven Cooks
 * @date: Apr 30, 2015
 ***************************************************************************
 * Description:
 * Given an array of integers, find two numbers such that they add up to 
 * a specific target number. 
 * The function twoSum should return indices of the two numbers such that 
 * they add up to the target, where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) are not 
 * zero-based. 
 * 
 * You may assume that each input would have exactly one solution. 
 * Input: numbers={2, 7, 11, 15}, target=9 
 * Output: index1=1, index2=2
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/two-sum/ }
 */
package _001_TwoSum;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _001_TwoSum.SolutionTest } */
public class Solution {

    /**
     * Construct a map to memo expected value and its index. 
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (indexMap.containsKey(number)) {
                // found the two numbers we are looking for!
                // ! required result is not zero-based indexed, but 1-based
                result[0] = 1 + indexMap.get(number);
                result[1] = 1 + i;
                break;
            } else {
                // put the number we are expecting into the map
                indexMap.put(target - number, i);
            }
        }
        return result;
    }

}
