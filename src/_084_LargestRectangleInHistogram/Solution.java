/**
 * Time : O(N); Space: O(N)
 * @tag : Array; Stack
 * @by  : Steven Cooks
 * @date: Jul 14, 2015
 *************************************************************************
 * Description: 
 * 
 * Given n non-negative integers representing the histogram's bar height 
 * where the width of each bar is 1, find the area of largest rectangle in 
 * the histogram.
 *************************************************************************
 * {@link https://leetcode.com/problems/largest-rectangle-in-histogram/ }
 */
package _084_LargestRectangleInHistogram;

import java.util.Stack;

/** see test {@link _084_LargestRectangleInHistogram.SolutionTest } */
public class Solution {

    public int largestRectangleArea(int[] height) {
        int len = height.length;
        int result = 0;
        // stack of indices whose values are in non-descending order
        Stack<Integer> indices = new Stack<>();
        for (int i = 0; i <= len; i++) {
            int num = i == len ? -1 : height[i];
            while (!indices.isEmpty() && num <= height[indices.peek()]) {
                int h = height[indices.pop()];
                int w = indices.isEmpty() ? i : i - indices.peek() - 1;
                result = Math.max(result, h * w);
            }
            indices.push(i);
        }
        return result;
    }

}