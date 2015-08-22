/**
 * Time : O(); Space: O()
 * @tag : Hash Table; Two Pointers; String
 * @by  : Steven Cooks
 * @date: May 11, 2015
 *************************************************************************
 * Description: 
 * 
 * You are given a string, s, and a list of words, words, that are all of 
 * the same length. Find all starting indices of substring(s) in s that 
 * is a concatenation of each word in words exactly once and without any 
 * intervening characters. 
 * 
 * For example, given: 
 * s: "barfoothefoobarman" words: ["foo", "bar"] 
 * You should return the indices: [0,9]. (order does not matter).
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/substring-with-concatenation-of-all-words/ }
 */
package _030_SubstringWithConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** see test {@link _030_SubstringWithConcatenationOfAllWords.SolutionTest } */
public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        if (s.length() == 0 || words.length == 0) {
            return result;
        }

        // count the word counts in words
        Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
        int wordsCount = words.length;
        for (String word : words) {
            int count = wordCountMap.containsKey(word) ? wordCountMap.get(word)
                    : 0;
            wordCountMap.put(word, count + 1);
        }

        int wordLen = words[0].length();
        int wordsLen = words.length * wordLen;

        // try all possible starting index
        for (int startIndex = 0; startIndex <= s.length() - wordLen
                && startIndex <= s.length() - wordsLen; startIndex++) {

            String window = s.substring(startIndex, startIndex + wordsLen);
            Map<String, Integer> foundMap = new HashMap<String, Integer>();
            int wordFoundCount = 0;
            int checkingIndex = 0;

            if (findSubstring(window, checkingIndex, wordFoundCount,
                    wordsCount, foundMap, wordCountMap)) {
                result.add(startIndex);
            }
        }

        return result;
    }

    public boolean findSubstring(String window, int checkingIndex,
            int wordFoundCount, int wordsCount, Map<String, Integer> foundMap,
            Map<String, Integer> wordCountMap) {

        if (checkingIndex == window.length()) {
            // one valid starting index found
            return true;
        }

        int wordLen = window.length() / wordsCount;

        // parse word from window
        String word = window.substring(checkingIndex, checkingIndex + wordLen);

        if (checkingIndex < window.length() && wordCountMap.containsKey(word)) {
            int count = foundMap.containsKey(word) ? foundMap.get(word) : 0;
            // go on checking
            if (count < wordCountMap.get(word)) {
                foundMap.put(word, count + 1);
                return findSubstring(window, checkingIndex + wordLen,
                        wordFoundCount + 1, wordsCount, foundMap, wordCountMap);
            }

        }
        return false;
    }

}
