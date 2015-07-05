/**
 * Time : O(N^2); Space : O(N^2)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Jul 4, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given numRows, generate the first numRows of Pascal's triangle. 
 * 
 * For example, given numRows = 5, 
 * Return 
 * [       [1], 
 *        [1,1], 
 *       [1,2,1], 
 *      [1,3,3,1], 
 *     [1,4,6,4,1] 
 * ]
 *******************************************************************************
 * {@link https://leetcode.com/problems/pascals-triangle/ }
 */
package _118_PascalTriangle;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _118_PascalTriangle.SolutionTest } */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
            return result;
        }
        List<Integer> lastRow = new ArrayList<Integer>();
        // push in the 1st row;
        lastRow.add(1);
        result.add(lastRow);

        for (int row = 1; row < numRows; row++) {
            List<Integer> curRow = new ArrayList<Integer>();
            // push in the 1st element in current row
            curRow.add(1);

            for (int i = 0; i < lastRow.size() - 1; i++) {
                // push in element based on rule of pascal's triangle
                curRow.add(lastRow.get(i) + lastRow.get(i + 1));
            }

            // push in the last element in current row
            curRow.add(1);

            // after finish with current row
            result.add(curRow);
            lastRow = curRow;
        }

        return result;
    }

}
