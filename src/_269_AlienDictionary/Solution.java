/**
 * Time : O() ; Space: O()
 * @tag : Graph; Togological Sort
 * @by  : Steven Cooks
 * @date: Sep 25, 2015
 ***************************************************************************
 * Description:
 * 
 * are sorted lexicographically by the rules of this new language. 
 * Derive the order of letters in this language. 
 * 
 * For example, Given the following words in dictionary, 
 * [ "wrt",
 *   "wrf", 
 *   "er", 
 *   "ett", 
 *   "rftt" 
 * ] 
 * 
 * The correct order is: "wertf". 
 * 
 * Note: 
 * You may assume all letters are in lowercase. 
 * If the order is invalid, return an empty string. 
 * There may be multiple valid order of letters, return any one of them is fine.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/alien-dictionary/ }
 */
package _269_AlienDictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** see test {@link _269_AlienDictionary.SolutionTest } */
public class Solution {

    public String alienOrder(String[] words) {
        // <Node, Number of edges pointing to this node>
        Map<Character, Integer> in = new HashMap<>();
        // <Node, All nodes that this node directly points to>
        Map<Character, Set<Character>> out = new HashMap<>();

        // collect all characters and initialize in and out map
        collectChars(words, in, out);

        // construct graph
        for (int i = 1; i < words.length; i++) {
            String pre = words[i - 1];
            String cur = words[i];
            int len = Math.min(pre.length(), cur.length());
            int j = 0;
            while (j < len && pre.charAt(j) == cur.charAt(j)) {
                j++;
            }
            if (j < len) {
                // find one topological order, update graph
                char preCh = pre.charAt(j); 
                char curCh = cur.charAt(j);
                if (out.get(preCh).add(curCh)) {
                    in.put(curCh, in.get(curCh) + 1);
                }
            }
        }
        
        // push all nodes that have no incoming edge into queue
        Queue<Character> zeros = new LinkedList<>();
        for (char ch : in.keySet()) {
            if (in.get(ch) == 0) {
                zeros.offer(ch);
            }
        }
        
        int count = 0;  // how many nodes we collect
        StringBuilder sb = new StringBuilder();
        while (!zeros.isEmpty()) {
            char ch = zeros.poll();
            count++;
            sb.append(ch);
            for (char next : out.get(ch)) {
                int degree = in.get(next) - 1;
                if (degree >= 0) {
                    in.put(next, degree);
                }
                if (degree == 0) {
                    zeros.offer(next);
                }
            }
        }
        return count != in.size() ? "" : sb.toString();
    }

    // collect all characters and initialize in and out map
    private void collectChars(String[] words, Map<Character, Integer> in,
            Map<Character, Set<Character>> out) {
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (!in.containsKey(ch)) {
                    in.put(ch, 0);
                }
                if (!out.containsKey(ch)) {
                    out.put(ch, new HashSet<>());
                }
            }
        }
    }

}
