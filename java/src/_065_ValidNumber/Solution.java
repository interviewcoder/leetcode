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

/** 
 * Q1: leading/trailing spaces ok?
 * Q2: '+'/'-' ok?
 * Q3: 1. ok? 
 * Q4: spaces between characters ok?
 * Q5: 3e ok?
 * Q6: -.e ok?
 * Q7: -e ok?
 * see test {@link _065_ValidNumber.SolutionTest } 
 */
public class Solution {

    /**
     * valid number format: 
     * [sign] [digit may include dot] [e|E[sign]digit+] 
     * | p1 | |          p2         | |      p3       |
     * p1: optional
     * p2: there must be at least one digit, dot is allowed to appear
     * p3: if 'e' or 'E' appears, then there must be at least one digit after e sign
     * P.S.: also check for duplicated '.' and 'e|E' and 'e|E' cannot be before '.'
     */
    public boolean isNumber(String s) {
        s = s.trim();
        int eSignIndex = -1;
        boolean digitsBeforeESign = false;
        boolean digitsAfterESign = false;
        boolean dotSign = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '+' || ch == '-') {
                // sign should be the beginning char or right after the e|E sign
                if (!(i == 0 || eSignIndex != -1 && i == eSignIndex + 1)) {
                    return false;
                }
            } else if (ch == '.') {
                // cannot have duplicated '.' and '.' must before e sign
                if (dotSign || eSignIndex != -1) {
                    return false;
                }
                dotSign = true;
            } else if (ch == 'e' || ch == 'E') {
                // cannot have duplicated e sign and there should be at least
                // one digit before e sign
                if (eSignIndex != -1 || !digitsBeforeESign) {
                    return false;
                }
                eSignIndex = i;
            } else if (Character.isDigit(ch)) {
                if (eSignIndex != -1) {
                    digitsAfterESign = true;
                } else {
                    digitsBeforeESign = true;
                }
            } else {
                // unexpected character in string
                return false;
            }
        }
        // p2 should not be empty and p3 part is optional
        return (digitsBeforeESign) && (eSignIndex != -1 ? digitsAfterESign : true);
    }

}
