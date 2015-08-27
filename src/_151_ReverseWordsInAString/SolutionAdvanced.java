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

/** see test {@link _151_ReverseWordsInAString.SolutionAdvancedTest } */
public class SolutionAdvanced {

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        List<String> words = new ArrayList<>();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (!strs[i].isEmpty()) {
                words.add(strs[i]);
            }
        }
        return String.join(" ", words);
    }

}
