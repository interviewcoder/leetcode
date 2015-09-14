/**
 * Time : O(); Space: O()
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 11, 2015
 *************************************************************************
 * Description:
 * 
 * Given a string s and a dictionary of words dict, determine if s can be 
 * segmented into a space-separated sequence of one or more dictionary words. 
 * 
 * For example, given s = "leetcode", dict = ["leet", "code"]. 
 * Return true because "leetcode" can be segmented as "leet code".
 * 
 *************************************************************************
 * {@link: https://leetcode.com/problems/word-break/ }
 */
package _139_WordBreak;

import java.util.Set;

/** see test {@link _139_WordBreak.SolutionDFSTest } */
public class SolutionDFS {

    public boolean wordBreak(String s, Set<String> wordDict) {
        return dfs(0, s, wordDict);
    }

    private boolean dfs(int i, String s, Set<String> wordDict) {
        // base case
        boolean breakable = false;
        if (i == s.length()) {
            return true;
        } else {
            // recursive case
            for (int j = i + 1; j <= s.length(); j++) {
                String word = s.substring(i, j);
                if (wordDict.contains(word) && dfs(j, s, wordDict)) {
                    breakable = true;
                    break;
                }
            }
        }
        return breakable;
    }

}
