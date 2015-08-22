/**
 * Time : O(N) ; Space: O(1)
 * @tag : Two Pointers
 * @by  : Steven Cooks
 * @date: Jul 22, 2015
 ***************************************************************************
 * Description:
 *
 * Given n non-negative integers a1, a2, ..., an, where each represents a 
 * point at coordinate (i, ai). n vertical lines are drawn such that the 
 * two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which 
 * together with x-axis forms a container, such that the container contains 
 * the most water. 
 * 
 * Note: You may not slant the container.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/container-with-most-water/ }
 * 1. head-tail pointers
 */
package _011_ContainerWithMostWater;

/**
 * <p>
 * 1. Set left bar at the leftmost position and right bar at the rightmost
 * position.
 * <p>
 * 2. Each time, compare the height[left] with height[right] and moves the lower
 * bar towards center position because the lower bar will decides the
 * container's capacity. Only by moving the lower bar may we find a larger
 * container.
 * <p>
 * 
 * <p>
 *                    | 
 *    | -->           | 
 *    |  .....  ....  |
 *   left            right
 */
public class Solution {

    public int maxArea(int[] height) {
        int len = height.length;
        if (len == 0) {
            return 0;
        }
        int left = 0;
        int right = len - 1;
        int result = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                // lower bar decides the container's capacity
                result = Math.max(height[left] * (right - left), result);
                // only left side bar may have larger container
                left++;
            } else {
                result = Math.max(height[right] * (right - left), result);
                right--;
            }
        }
        return result;
    }

}
