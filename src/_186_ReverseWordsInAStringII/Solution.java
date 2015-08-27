/**
 * Time : O(N) ; Space: O(1)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: Aug 27, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given an input string, reverse the string word by word. 
 * For example, 
 *  Given s = "the sky is blue", 
 *  return "blue is sky the".
 *  
 * Note: 1) no leading and trailing spaces 
 *       2) only one space between words
 *       3) do it in-place
 * 
 ***************************************************************************
 * {@link }
 */
package _186_ReverseWordsInAStringII;

/** see test {@link _186_ReverseWordsInAStringII.SolutionTest } */
public class Solution {
    
    public void reverseWords(char[] s) {
        // reverse the whole sentence
        reverse(s, 0, s.length);
        // trick: how to include the last position
        for (int i = 0, j = 0; j <= s.length; j++) {
            if (j == s.length || s[j] == ' ') {
                reverse(s, i, j);
                i = j + 1;
            }
        }
    }

    private void reverse(char[] s, int start, int end) {
        int mid = (end - start) / 2;
        for (int i = 0; i < mid; i++) {
            char temp = s[start + i];
            s[start + i] = s[end - i - 1];
            s[end - i - 1] = temp;
        }
    }

}
