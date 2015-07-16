/**
 * Time : O(N); Space: O(1)
 * @tag : Math; String
 * @by  : Steven Cooks
 * @date: Jun 4, 2015
 *************************************************************************
 * Description: 
 * 
 * Validate if a given string is numeric. 
 * Some examples: 
 * "0" => true " 0.1 " => true "abc" => false "1 a" => false "2e10" => true 
 * 
 * Note: It is intended for the problem statement to be ambiguous. You 
 * should gather all requirements up front before implementing one.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/valid-number/ }
 */
package _065_ValidNumber;

/** see test {@link _065_ValidNumber.SolutionTest } */
public class Solution {
    /**
     * Valid example: +10e2, -0.12, +100.12e-3, 00100, .12, Invalid: 0..1,
     * 1e0.1, -e2,
     */
    public boolean isNumber(String s) {
        s = s.trim();
        boolean numberSeen = false;
        boolean numberAfterESeen = false;
        boolean pointSeen = false;
        boolean eSeen = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '+' || ch == '-') {
                // optional +/- sign
                // must be either 1st char in before-e portion or 1st char in
                // after-e portion
                if (i != 0 && ((i - 1 < 0) || s.charAt(i - 1) != 'e')) {
                    return false;
                }
            } else if (ch >= '0' && ch <= '9') {
                numberSeen = true;
                if (eSeen) {
                    numberAfterESeen = true;
                }
            } else if (ch == '.') {
                // should have number before '.'
                if (eSeen || pointSeen) {
                    return false;
                }
                pointSeen = true;
            } else if (ch == 'e') {
                // no e appearred && number has appearred
                if (eSeen || !numberSeen) {
                    return false;
                }
                eSeen = true;
            } else {
                return false;
            }

        }
        return numberSeen && (eSeen ? numberAfterESeen : true);
    }

}
