/**
 * Time : O(N) ; Space: O(N)
 * @tag : String
 * @by  : Steven Cooks
 * @date: Jul 20, 2015
 ***************************************************************************
 * Description:
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given 
 * number of rows like this: (you may want to display this pattern in a 
 * fixed font for better legibility) 
 * P   A   H   N 
 * A P L S I I G 
 * Y   I   R 
 * And then read line by line: "PAHNAPLSIIGYIR" 
 * 
 * Write the code that will take a string and make this conversion given a 
 * number of rows: 
 * string convert(string text, int nRows); 
 * convert("PAYPALISHIRING", 3) 
 * should return "PAHNAPLSIIGYIR".
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/zigzag-conversion/ }
 */
package _006_ZigZagConversion;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _006_ZigZagConversion.SolutionTest } */
public class Solution {

    private int[] indices;

    public String convert(String s, int numRows) {
        if (numRows <= 0) {
            return "";
        } else if (numRows == 1) {
            return s;
        }
        // construct indices
        constructIndices(numRows);

        // zigzag converting
        int index = 0;
        List<StringBuilder> strs = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            strs.add(new StringBuilder());
        }
        for (int i = 0; i < s.length(); i++) {
            if (index == indices.length) {
                index = 0;
            }
            int j = indices[index];
            strs.get(j).append(s.charAt(i));
            index++;
        }

        // construct result
        StringBuilder str = new StringBuilder();
        for (StringBuilder ss : strs) {
            str.append(ss);
        }
        return str.toString();
    }

    private void constructIndices(int B) {
        indices = new int[B + B - 2];
        int index = 0;
        for (int i = 0; i < B; i++) {
            indices[index++] = i;
        }
        for (int i = 0; i < B - 2; i++) {
            indices[index++] = B - 2 - i;
        }
    }

}
