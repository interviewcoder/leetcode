/**
 * Time : O(N); Space: O(N)
 * @tag : Array; Stack; Two Pointers
 * @by  : Steven Cooks
 * @date: Jul 15, 2015
 **************************************************************************
 * Description: 
 * 
 * Given n non-negative integers representing an elevation map where the 
 * width of each bar is 1, compute how much water it is able to trap after raining. 
 * 
 * For example, 
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/trapping-rain-water/ }
 * @reference {@link https://leetcode.com/discuss/41688/stack-based-solution-inspired-by-largest-histogram-problem } 
 */
package _042_TrappingRainWater;

import java.util.Stack;

/** see test {@link _042_TrappingRainWater.SolutionStackTest } */
public class SolutionStack {

    // keep a non-ascending stack: element in stack is index, and their height[index]
    // is non-ascending order
    // because we need a 'valley' to trap water, for 'valley', both left and 
    // right bar should be higher
    public int trap(int[] height) {
        Stack<Integer> indices = new Stack<>();
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            while (!indices.isEmpty() && height[i] > height[indices.peek()]) {
                int low = height[indices.pop()];
                if (!indices.empty()) {
                    int w = i - indices.peek() - 1;
                    int h = Math.min(height[i], height[indices.peek()]) - low;
                    res += w * h;
                }
            }
            indices.push(i);
        }
        return res;
    }

}
