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
 * @reference {@link https://leetcode.com/discuss/28573/share-my-two-end-bfs-in-c-80ms }
 */
package _127_WordLadder;

import java.util.HashSet;
import java.util.Set;

/** see test {@link _127_WordLadder.SolutionTest } */
public class Solution {

    // two-end BFS, construct graph from begin and end at the same time
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        int len = 1;
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        visited.add(beginWord);
        visited.add(endWord);
        
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            // add new words to smaller set to achieve better performance
            boolean isBeginSetSmall = beginSet.size() < endSet.size();
            Set<String> small = isBeginSetSmall ? beginSet : endSet;
            Set<String> big = isBeginSetSmall ? endSet : beginSet;
            Set<String> next = new HashSet<>();
            len++;
            for (String str : small) {
                // construct all possible words
                for (int i = 0; i < str.length(); i++) {
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        StringBuilder sb = new StringBuilder(str);
                        sb.setCharAt(i, ch);
                        String word = sb.toString();
                        if (big.contains(word)) {
                            return len;
                        }
                        if (wordDict.contains(word) && !visited.contains(word)) {
                            visited.add(word);
                            next.add(word);
                        }
                    }
                }
            }
            if (isBeginSetSmall) {
                beginSet = next;
            } else {
                endSet = next;
            }
        }
        return 0;
    }

}
