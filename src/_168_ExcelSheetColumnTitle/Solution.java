/**
 * Time : O(N); Space : O(1)
 * @tag : Math
 * @by  : Steven Cooks
 * @date: Jul 9, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a positive integer, return its corresponding column title as 
 * appear in an Excel sheet. 
 * 
 * For example: 
 *  1 -> A 
 *  2 -> B 
 *  3 -> C 
 *  ... 
 *  26 -> Z 
 *  27 -> AA 
 *  28 -> AB 
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/excel-sheet-column-title/ }
 */
package _168_ExcelSheetColumnTitle;

/** see test {@link _168_ExcelSheetColumnTitle.SolutionTest } */
public class Solution {
    
    private int BASE = 26;
    
    private int OFFSET = 1;
    
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            char c = (char) ((n - OFFSET) % BASE + 'A');
            sb.append(c);
            n = (n - OFFSET) / BASE;
        }
        return sb.reverse().toString();
    }

}
