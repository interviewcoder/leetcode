/**
 * Time : O(N); Space: O()
 * @Tag : Array; Stack
 * @Date: Jun 9, 2015
 */
package _084_LargestRectangleInHistogram;

public class SolutionTLE {
    public int largestRectangleArea(int[] height) {
        int result = 0;
        int len = height.length;
        for (int i = 0; i < len; i++) {
            int h = height[i];
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && height[left] >= h) {
                left--;
            }
            while (right < len && height[right] >= h) {
                right++;
            }
            int w = right - left - 1;
            result = Math.max(result, w * h);
        }
        return result;
    }
}