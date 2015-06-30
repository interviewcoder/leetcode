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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

// Solution that will cause Memory Limit Exceed in OJ
/** see test {@link _126_WordLadderII.SolutionMLETest } */
public class SolutionMLE {

    private Queue<List<String>> pathsQueue = new LinkedList<>();

    public List<List<String>> findLadders(String start, String end,
            Set<String> dict) {
        List<List<String>> result = new ArrayList<>();

        if (start == end) {
            result.add(Arrays.asList(start, end));
            return result;
        }

        pathsQueue.add(Arrays.asList(start));
        Set<String> visited = new HashSet<>();
        visited.add(start);

        boolean foundPath = false;

        while (!pathsQueue.isEmpty() && !foundPath) {
            int levelSize = pathsQueue.size();
            Set<String> curWords = new HashSet<>();
            // traverse current level
            for (int i = 0; i < levelSize; i++) {
                List<String> path = pathsQueue.poll();
                curWords.add(path.get(path.size() - 1));
                List<String> possibleWords = getPossibleWords(end, path, dict,
                        visited);
                for (String word : possibleWords) {
                    // avoid visiting the same word twice
                    if (word.equals(end)) {
                        // found one path!
                        foundPath = true;
                        // construct this path
                        List<String> ladder = new ArrayList<>(path);
                        ladder.add(word);
                        result.add(ladder);
                    }
                    if (!foundPath) {
                        List<String> newPath = new ArrayList<>(path);
                        newPath.add(word);
                        pathsQueue.add(newPath);
                    }
                }
            }
            // update visited until we finish current level
            visited.addAll(curWords);
        }
//        for (List<String> string : result) {
//            System.out.println(string);
//        }
        return result;
    }

    private List<String> getPossibleWords(String end, List<String> path,
            Set<String> dict, Set<String> visited) {
        List<String> words = new ArrayList<>();
        if (path.size() == 0) {
            return words;
        }
        String start = path.get(path.size() - 1);
        // try 'a' to 'z' at each index of word
        for (int i = 0; i < end.length(); i++) {
            StringBuilder wordBuilder = new StringBuilder(start);
            for (char ch = 'a'; ch <= 'z'; ch++) {
                wordBuilder.setCharAt(i, ch);
                String word = wordBuilder.toString();
                if (word.equals(end)
                        || (!visited.contains(word) && dict.contains(word))) {
                    words.add(word);
                }
            }
        }
//        System.out.println("pos: [" + start + "], " + words);
        return words;
    }

}
