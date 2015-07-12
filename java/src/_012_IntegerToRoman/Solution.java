/**
 * Time : O(); Space : O()
 * @tag : Math; String
 * @by  : Steven Cooks
 * @date: Jul 11, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given an integer, convert it to a roman numeral. 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/integer-to-roman/ }
 */
package _012_IntegerToRoman;

/** see test {@link _012_IntegerToRoman.SolutionTest } */
public class Solution {

    public String intToRoman(int num) {
        int[] weights = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] tokens = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
                "IX", "V", "IV", "I" };
        StringBuilder rs = new StringBuilder("");
        int start = 0;
        while (num > 0) {
            for (int i = start; i < 13; i++) {
                if (num >= weights[i]) {
                    num -= weights[i];
                    rs.append(tokens[i]);
                    break;
                }
                start = i + 1; // skip those impossible check, make it faster
            }
        }
        return rs.toString();
    }

}
