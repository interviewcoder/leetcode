/**
 * Time : O(N); Space: O(1)
 * @Tag : Array; Two Pointers
 * @Date: May 8, 2015
 * @By  : Steven Cooks
 */
package _027_RemoveElement;

public class SolutionPartition {
    // partition array so that
    // nums[0:lastIndex] != val && nums(lastIndex : end) = val
    public int removeElement(int[] nums, int val) {
        int lastIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[++lastIndex] = nums[i];
            }
        }
        return lastIndex + 1;
    }
}
