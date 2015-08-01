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
public class SolutionIterative {

    /**
     *  Assuming current result: [000, 001, 011, 010]
     *  For next level, from back to front of current result, add `1`
     *  at the beginning of each number, then result will be:
     *  [000, 001, 011, 010,
     *   110, 111, 101, 100]
     */
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        if (n < 0) {
            return result;
        }
        // pushing in initial element
        result.add(0);
        int num = 1;
        for (int i = 0; i < n; i++) {
            int size = result.size();
            for (int j = size - 1; j >= 0; j--) {
                result.add(num + result.get(j));
            }
            num *= 2;
        }
        return result;
    }
    
}
