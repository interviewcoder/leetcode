/**
 *******************************************************************************
 * Description: 
 * 
 * Given a list of non negative integers, arrange them such that they form 
 * the largest number. 
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330. 
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * 
 *******************************************************************************
 * @tag : Array
 * {@link https://leetcode.com/problems/largest-number/  }
 */
package _031_NextPermutation;

import java.util.Arrays;

/** see test {@link _031_NextPermutation.PracticeTest} */
public class Practice {

    public void nextPermutation(int[] nums) {
        int start = 0;
        int len = nums.length;
        // find from back the two consecutive numbers in ascending order
        for (int i = len - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                start = i;
                break;
            }
        }
        // let's find a just-larger element from nums[start : end]
        // to swap with nums[start - 1]
        int end = len - 1;
        if (start > 0) {
            // nums[start : end] is in descending number, 
            // we need to find the just-larger-than number larger than nums[start - 1]
            for (int i = len - 1; i >= start; i--) {
                if (nums[i] > nums[start - 1]) {
                    end = i;
                    break;
                }
            }
            swap(start - 1, end, nums);
        }
        // now let's reverse nums[start : end]
        int mid = (start + len - 1) / 2;
        for (int i = start; i <= mid; i++) {
            swap(i, start + len - 1 - i, nums);
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int i, int j, int[] nums) {
        int num = nums[i];
        nums[i] = nums[j];
        nums[j] = num;
    }
}
