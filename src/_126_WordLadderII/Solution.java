/**
 * Time : O(); Space: O()
 * @tag : Array; Backtracking; Breadth-first Search; String
 * @date: Jun 20, 2015
 * @by  : Steven Cooks
 *******************************************************************************
 * Given two words (start and end), and a dictionary, find all shortest 
 * transformation sequence(s) from start to end, such that: 
 *  1. Only one letter can be changed at a time 
 *  2. Each intermediate word must exist in the dictionary 
 * 
 * For example, 
 * Given: 
 * start = "hit" 
 * end = "cog" 
 * dict = ["hot","dot","dog","lot","log"] 
 * Return 
 * [ 
 *  ["hit","hot","dot","dog","cog"], 
 *  ["hit","hot","lot","log","cog"] 
 * ] 
 * 
 * Note: 
 * All words have the same length. 
 * All words contain only lowercase alphabetic characters.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/word-ladder-ii/ }
 */
package _126_WordLadderII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** see test {@link _126_WordLadderII.SolutionTest } */
public class Solution {

    /**
     * Traverse level by level. In each level, construct possible words
     * 
     * keys: 1. when constructing words for next level, iterate through 'a' to 'z'
     *       2. each word is allowed duplicates in the same level but not the previous levels
     *       3. use father map to avoid calculating the ladder for the duplicated word in the same level
     */
    public List<List<String>> findLadders(String start, String end, Set<String> dict) {

        List<List<String>> result = new ArrayList<>();

        if (start.equals(end)) {
            result.add(Arrays.asList(start, end));
            return result;
        }

        // use set for current level instead of queue to avoid calculating ladder for duplicated word
        Set<String> cur = new HashSet<>();
        Set<String> visited = new HashSet<>();
        // word, and all words that can direct lead to this word in path
        Map<String, List<String>> fatherMap = new HashMap<>();
        cur.add(start);

        boolean found = false;
        int wordLen = start.length();

        while (!cur.isEmpty() && !found) {

            Set<String> next = new HashSet<>();

            for (String str : cur) {
                for (int i = 0; i < wordLen; i++) {
                    StringBuilder sb = new StringBuilder(str);
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        sb.setCharAt(i, ch);
                        String word = sb.toString();
                        if (word.equals(end)) {
                            found = true;
                        }
                        if (dict.contains(word) && !visited.contains(word)
                                || word.equals(end)) {
                            next.add(word);
                            if (!fatherMap.containsKey(word)) {
                                fatherMap.put(word, new ArrayList<>());
                            }
                            fatherMap.get(word).add(str);
                        }
                    }
                }
            }

            cur = next;
            visited.addAll(cur);
        }
        if (found) {
            List<String> path = new ArrayList<>();
            dfs(start, end, path, fatherMap, result);
        }
        return result;
    }

    // construct paths based father map
    private void dfs(String start, String end, List<String> path, Map<String, List<String>> fatherMap, List<List<String>> result) {
        path.add(end);
        if (end.equals(start)) {
            result.add(new ArrayList<>(path));
            Collections.reverse(result.get(result.size() - 1));
        } else {
            List<String> que = fatherMap.get(end);
            for (String word : que) {
                dfs(start, word, path, fatherMap, result);
            }
        }
        path.remove(path.size() - 1);
    }

}
