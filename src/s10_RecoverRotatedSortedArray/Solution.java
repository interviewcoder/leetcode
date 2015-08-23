/**
 * Time : O(N) ; Space: O(1)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Aug 23, 2015
 ***************************************************************************
 * Description:
 *
 * Given a rotated sorted array, recover it to sorted array in-place. 
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/recover-rotated-sorted-array/ }
 */
package s10_RecoverRotatedSortedArray;

import java.util.ArrayList;

/** see test {@link s10_RecoverRotatedSortedArray.SolutionTest } */
public class Solution {

    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        if (nums == null || nums.size() <= 1) {
            return;
        }
        while (true) {
            if (nums.get(0) > nums.get(1)) {
                break;
            }
            nums.add(nums.get(0));
            nums.remove(0);
        }
        nums.add(nums.get(0));
        nums.remove(0);
    }

}
