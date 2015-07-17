/**
 * Time : O(N^2); Space : O(k)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Jul 4, 2015
 *******************************************************************************
 * Description:  
 * 
 * Given an index k, return the kth row of the Pascal's triangle. 
 * 
 * For example, given k = 3, 
 * Return [1,3,3,1]. 
 * 
 * Note: 
 * Could you optimize your algorithm to use only O(k) extra space?
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/pascals-triangle-ii/ }
 */
package _119_PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _119_PascalsTriangleII.SolutionTest } */
public class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> curRow = new ArrayList<Integer>();
        if (rowIndex < 0) {
            return curRow;
        }
        curRow.add(1);
        for (int row = 0; row < rowIndex; row++) {
            // push in 1 at the end of each row
            curRow.add(1);
            // construct each row from back to front
            for (int i = row; i >= 1; i--) {
                curRow.set(i, curRow.get(i) + curRow.get(i - 1));
            }
        }
        return curRow;
    }

}
