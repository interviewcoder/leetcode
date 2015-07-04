/**
 * Time : O(N); Space : O(N)
 * @tag :
 * @by  : Steven Cooks
 * @date: Jul 4, 2015
 *******************************************************************************
 * Description: 
 * 
 * Rotate an array of n elements to the right by k steps. 
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
 * 
 * Note: 
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem. 
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/rotate-array/ }
 */
package _189_RotateArray;

/** 
 * 1. deal with index offset
 * see test {@link _189_RotateArray.SolutionTest } */
public class Solution {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        // deal with larger-than-length k
        k = k % len;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = nums[(len - k + i) % len];
        }
        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }
    }

}
