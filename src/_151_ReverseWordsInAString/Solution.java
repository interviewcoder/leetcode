/**
 * Time : O(N); Space : O(N)
 * @tag : String
 * @by  : Steven Cooks
 * @date: Jul 10, 2015
 *************************************************************************
 * Description: 
 * 
 * Given an input string, reverse the string word by word. 
 * For example, 
 *  Given s = "the sky is blue", 
 *  return "blue is sky the".
 *  
 * Note: 1) removing all leading and trailing spaces 
 *       2) there might be multiple spaces between words
 *       
 *************************************************************************
 * {@link https://leetcode.com/problems/reverse-words-in-a-string/ }
 */
package _151_ReverseWordsInAString;

/**
 * 1. what is "word"?
 * 2. how to deal with leading and trailing spaces?
 * 3. how to deal with multiple space between words? 
 * see test {@link _151_ReverseWordsInAString.SolutionTest } 
 */
public class Solution {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                // jump blank space
                end = i;
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                // at the beginning index of a word
                if (sb.length() != 0) {
                    sb.append(' ');
                }
                sb.append(s.substring(i, end));
            }
        }
        return sb.toString();
    }

}
