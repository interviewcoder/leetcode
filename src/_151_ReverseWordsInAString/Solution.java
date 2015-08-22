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
 *************************************************************************
 * {@link https://leetcode.com/problems/reverse-words-in-a-string/ }
 */
package _151_ReverseWordsInAString;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _151_ReverseWordsInAString.SolutionTest } */
public class Solution {

    public String reverseWords(String A) {
        List<String> words = new ArrayList<>();
        String[] strs = A.split(" ");
        for (String str : strs) {
            if (!str.isEmpty()) {
                // insert new word at the beginning of list
                words.add(0, str);
            }
        }
        return String.join(" ", words);
    }

}
