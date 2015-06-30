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
    public List<List<String>> findLadders(String start, String end,
            Set<String> dict) {
        List<List<String>> result = new ArrayList<>();
        if (start == end) {
            result.add(Arrays.asList(start, end));
            return result;
        }

        // use set for current level instead of queue to avoid calculating ladder for duplicated word
        Set<String> current = new HashSet<>();
        Set<String> next = new HashSet<>();
        Set<String> visited = new HashSet<>();
        Map<String, List<String>> fatherMap = new HashMap<>();
        current.add(start);

        boolean found = false;
        int wordLen = start.length();

        while (!current.isEmpty() && !found) {
            visited.addAll(current);
            // ! should not be next.clear()
            // next.clear() will empty the set, which current is also pointed to
            // next = new HashSet<>(); will point next to a new empty set
            // while keep the originally set which is now pointed by current intact.
            next = new HashSet<>();
            for (String string : current) {
                for (int i = 0; i < wordLen; i++) {
                    StringBuilder wordBuilder = new StringBuilder(string);
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        wordBuilder.setCharAt(i, ch);
                        String word = wordBuilder.toString();
                        if (word.equals(end)) {
                            found = true;
                        }
                        if (dict.contains(word) && !visited.contains(word)
                                || word.equals(end)) {
                            next.add(word);
                            if (fatherMap.containsKey(word)) {
                                fatherMap.get(word).add(string);
                            } else {
                                List<String> list = new ArrayList<>();
                                list.add(string);
                                fatherMap.put(word, list);
                            }
                        }
                    }
                }
            }
            current = next;
        }
        if (found) {
            List<String> res = new ArrayList<>();
            dfs(result, fatherMap, res, start, end);
        }
        return result;
    }

    private void dfs(List<List<String>> result,
            Map<String, List<String>> fatherMap, List<String> res,
            String start, String end) {
        res.add(end);
        if (end.equals(start)) {
            result.add(new ArrayList<>(res));
            Collections.reverse(result.get(result.size() - 1));
        } else {
            List<String> que = fatherMap.get(end);
            for (String word : que) {
                dfs(result, fatherMap, res, start, word);
            }
        }
        res.remove(res.size() - 1);
    }

}
