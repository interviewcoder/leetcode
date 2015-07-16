/**
 * Time : O(n^4); Space: O(n^3)
 * @tag : Array; Hash Table; Stack; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 9, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a 2D binary matrix filled with 0's and 1's, find the largest 
 * rectangle containing all ones and return its area.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/maximal-rectangle/ }
 * P.S. : can be improved to O(N^3) using stack, see SolutionStack.java
 *      'board' dp problem, how to iterate
 */
package _085_MaximumRectangle;

import java.util.Stack;

/** see test {@link _085_MaximumRectangle.SolutionStackTest } */
public class SolutionStack {

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] height = new int[cols];
        int result = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int bar = matrix[r][c] == '1' ? 1 : 0;
                if (r != 0 && bar != 0) {
                    height[c] = height[c] + 1;
                } else {
                    height[c] = bar;
                }
            }
            result = Math.max(result, maxArea(height));
        }
        return result;
    }

    private int maxArea(int[] height) {
        Stack<Integer> s = new Stack<>();
        int max = 0;
        int i = 0;
        while (i <= height.length) {
            if (s.isEmpty() || i < height.length
                    && height[i] >= height[s.peek()]) {
                s.push(i);
                i++;
            } else {
                int h = height[s.pop()];
                int w = s.isEmpty() ? i : i - s.peek() - 1;
                max = Math.max(max, h * w);
            }
        }
        return max;
    }

}
