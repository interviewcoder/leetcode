/**
 * Time : O(); Space: O()
 * @tag : String
 * @by  : Steven Cooks
 * @date: Jun 3, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a string s consists of upper/lower-case alphabets and empty space 
 * characters ' ', return the length of last word in the string. 
 * If the last word does not exist, return 0. 
 * 
 * Note: A word is defined as a character sequence consists of non-space 
 * characters only. 
 * 
 * For example, Given s = "Hello World", return 5.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/length-of-last-word/ }
 */
package _058_LengthOfLastWord;

/** see test {@link _058_LengthOfLastWord.SolutionScanTest } */
public class SolutionScan {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int p = 0;
        int q = 0;
        int index = 0;
        while (index < len) {
            p = (s.charAt(index) == ' ') ? 0 : (p + 1);
            // another word appears?
            q = (p > 0) ? p : q;
            index++;
        }
        return q;
    }
}
