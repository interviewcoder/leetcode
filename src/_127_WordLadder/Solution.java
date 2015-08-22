/**
 * Time : O(); Space: O(N)
 * @tag : Breadth-first Search
 * @date: Jun 16, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description: 
 * 
 * Given two words (beginWord and endWord), and a dictionary, find the 
 * length of shortest transformation sequence from beginWord to endWord, 
 * such that: 
 *      Only one letter can be changed at a time 
 *      Each intermediate word must exist in the dictionary 
 * 
 * For example, 
 * Given: start = "hit" end = "cog" 
 * dict = ["hot","dot","dog","lot","log"] 
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", 
 * 
 * return its length 5.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/word-ladder/ }
 * -------------------------------------------------------------
 * 1. use StringBuilder for repeated string operations
 * 2. loop over 'a' - 'z': for (char ch = 'a'; ch <= 'z'; ch++)
 */
package _127_WordLadder;

import java.util.HashSet;
import java.util.Set;

/** see test {@link _127_WordLadder.SolutionTest } */
public class Solution {
    public int ladderLength(String beginWord, String endWord,
            Set<String> wordDict) {
        if (beginWord.equals(endWord)) {
            return 2;
        }
        Set<String> visited = new HashSet<>();
        Set<String> current = new HashSet<>();
        current.add(beginWord);
        visited.add(beginWord);

        int wordsInLadder = 1;
        int wordLen = beginWord.length();
        while (!current.isEmpty()) {
            Set<String> next = new HashSet<>();
            wordsInLadder++;
            // traverse current level
            for (String str : current) {
                for (int i = 0; i < wordLen; i++) {
                    StringBuilder strBuilder = new StringBuilder(str);
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        strBuilder.setCharAt(i, ch);
                        String word = strBuilder.toString();
                        if (word.equals(endWord)) {
                            // found!
                            return wordsInLadder;
                        } else if (!visited.contains(word)
                                && wordDict.contains(word)) {
                            // only add new word to next level
                            next.add(word);
                            visited.add(word);
                        }
                    }
                }
            }
            current = next;
        }
        return 0;
    }
}
