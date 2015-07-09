/**
 * Time : O(N); Space : O(1)
 * @tag : Math
 * @by  : Steven Cooks
 * @date: Jul 9, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a column title as appear in an Excel sheet, return its 
 * corresponding column number. 
 * 
 * For example: 
 *  A -> 1 
 *  B -> 2 
 *  C -> 3 
 *  ... 
 *  Z -> 26 
 *  AA -> 27 
 *  AB -> 28 
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/excel-sheet-column-number/ }
 */
package _171_ExcelSheetColumnNumber;

/** see test {@link _171_ExcelSheetColumnNumber.SolutionTest } */
public class Solution {
    
    private int BASE = 26;

    public int titleToNumber(String s) {
        int result = 0;
        for (char ch : s.toCharArray()) {
            result = result * BASE + (ch - 'A' + 1);  
        }
        return result;
    }

}
