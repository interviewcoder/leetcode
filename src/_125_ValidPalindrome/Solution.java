/**
 * Time : O(); Space: O()
 * @tag : Two Pointers; String
 * @date: Jun 16, 2015
 * @by  : Steven Cooks
 *************************************************************************
 *  Given a string, determine if it is a palindrome, considering only 
 *  alphanumeric characters and ignoring cases. 
 *  
 *  For example, 
 *  "A man, a plan, a canal: Panama" is a palindrome. 
 *  "race a car" is not a palindrome.
 *************************************************************************
 * {@link https://leetcode.com/problems/valid-palindrome/ }
 */
package _125_ValidPalindrome;

/** see test {@link _125_ValidPalindrome.SolutionTest } */
public class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        // corner case
        if (len == 0) {
            return true;
        }
        int i = 0;
        int j = len - 1;
        while (i <= j) {
            // find the next non-empty character from the beginning
            while (i <= j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            // find the next non-empty character from the back
            while (i <= j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            // compare
            if (i <= j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
