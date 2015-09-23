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
/** see test {@link _011_ContainerWithMostWater.SolutionTest } */
public class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (left < right) {
            result = Math.max(Math.min(height[left], height[right]) * (right - left), result);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

}
