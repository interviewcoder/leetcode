/**
 * Time : O(2^n); Space: O(n)
 * @tag : Backtracking
 * @date: Jun 9, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description: 
 * 
 * The gray code is a binary numeral system where two successive values 
 * differ in only one bit. 
 * 
 * Given a non-negative integer n representing the total number of bits in 
 * the code, print the sequence of gray code. A gray code sequence must begin with 0. 
 * 
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is: 
 *  00 - 0 
 *  01 - 1 
 *  11 - 3 
 *  10 - 2 
 *  
 * Note: For a given n, a gray code sequence is not uniquely defined. 
 * 
 * For example, [0,2,3,1] is also a valid gray code sequence according to the above definition. 
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/gray-code/ }
 */
package _089_GrayCode;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _089_GrayCode.SolutionTest } */
public class Solution {

    // DFS version
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        result.add(0);
        grayCode(i, n, result);
        return result;
    }

    private void grayCode(int i, int n, List<Integer> result) {
        // base case
        if (i == n) {
            return;
        }
        // recursive case
        int base = (int) Math.pow(2, i);
        int len = result.size();
        for (int j = len - 1; j >= 0; j--) {
            result.add(base + result.get(j));
        }
        grayCode(i + 1, n, result);
    }
    
}
