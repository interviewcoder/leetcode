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

/** see test {@link _126_WordLadderII.SolutionCopyTest } */
public class SolutionCopy {

    public List<List<String>> findLadders(String start, String end,
            Set<String> dict) {
        List<List<String>> result = new ArrayList<>();
        if (start == end) {
            result.add(Arrays.asList(start, end));
            return result;
        }

        Set<String> current = new HashSet<>();
        // all words that have been visited above current visiting level
        Set<String> visited = new HashSet<>();
        // <word, all direct fathers of this word in the path>
        Map<String, List<String>> fatherMap = new HashMap<>();
        current.add(start);

        boolean found = false;
        int wordLen = start.length();

        while (!current.isEmpty() && !found) {
            Set<String> next = new HashSet<>();
            for (String string : current) {
                for (int i = 0; i < wordLen; i++) {
                    StringBuilder wordBuilder = new StringBuilder(string);
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        wordBuilder.setCharAt(i, ch);
                        String word = wordBuilder.toString();
                        if (word.equals(end)) {
                            found = true;
                        }
                        if (!found && dict.contains(word) && !visited.contains(word)
                                || word.equals(end)) {
                            next.add(word);
                            // update father map
                            if (fatherMap.containsKey(word)) {
                                fatherMap.get(word).add(string);
                            } else {
                                fatherMap.put(word, new ArrayList<>(Arrays.asList(string)));
                            }
                        }
                    }
                }
            }
            current = next;
            // because we allow duplicates in the same level, 
            // therefore we delay updating visited until we finish current level
            visited.addAll(current);
        }
        if (found) {
            List<String> path = new ArrayList<>();
            dfs(result, fatherMap, path, start, end);
        }
        return result;
    }

    // dfs to construct path based on father map
    private void dfs(List<List<String>> result,
            Map<String, List<String>> fatherMap, List<String> path,
            String start, String end) {
        path.add(end);
        if (end.equals(start)) {
            // base case
            result.add(new ArrayList<>(path));
            Collections.reverse(result.get(result.size() - 1));
        } else {
            // recursive case
            List<String> fathers = fatherMap.get(end);
            for (String father: fathers) {
                dfs(result, fatherMap, path, start, father);
            }
        }
        path.remove(path.size() - 1);
    }

}