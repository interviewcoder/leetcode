/**
 * Time : O(1) ; Space: O(1)
 * @tag : Math
 * @by  : Steven Cooks
 * @date: Aug 21, 2015
 ***************************************************************************
 * Description:
 * 
 * Find the total area covered by two rectilinear rectangles in a 2D plane. 
 * Each rectangle is defined by its bottom left corner and top right corner as 
 * shown in the figure.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/rectangle-area/ }
 */
package _223_RectangleArea;

/** see test {@link _223_RectangleArea.SolutionTest } */
public class Solution {
    
    // two areas - overlapping area
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int x1 = Math.max(A, E);
        int x2 = Math.min(C, G);
        int y1 = Math.max(B, F);
        int y2 = Math.min(D, H);
        int overlap = (x2 > x1 && y2 > y1) ? (x2 - x1) * (y2 - y1) : 0;
        return (C - A) * (D - B) + (G - E) * (H - F) - overlap;
    }

}
