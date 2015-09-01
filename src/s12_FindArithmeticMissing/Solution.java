/**
 * Time : O(lgN) ; Space: O(1)
 * @tag : Binary Search
 * @by  : Steven Cooks
 * @date: Sep 1, 2015
 ***************************************************************************
 * Description:
 * 
 * There is only one missing number in the array, and array is following the
 * arithmetic pattern.
 * 
 * For example,
 * input : {1, 3, 7, 9}
 * return: 5
 * Because the distance between two adjacent numbers in array should be 2,
 * and there is no 5 after 3, so 5 is missing.
 * 
 ***************************************************************************
 * {@link }
 */
package s12_FindArithmeticMissing;

/** see test {@link s12_FindArithmeticMissing.SolutionTest } */
public class Solution {
    
    public int findMissing(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        int left = 0;
        int right = n - 1;
        int dist = (nums[right] - nums[left]) / n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int exp = nums[0] + (mid - 0) * dist;
            if (nums[mid] == exp) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[0] + (left - 0) * dist;
    }

}
