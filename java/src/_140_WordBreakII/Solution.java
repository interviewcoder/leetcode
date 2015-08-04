/**
 * Time : O(); Space: O()
 * @tag : Dynamic Programming; Backtracking
 * @date: Jun 12, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description:
 * 
 * Given a string s and a dictionary of words dict, add spaces in s to 
 * construct a sentence where each word is a valid dictionary word. 
 * Return all such possible sentences. 
 * 
 * For example, given s = "catsanddog", 
 * dict = ["cat", "cats", "and", "sand", "dog"]. 
 * 
 * A solution is ["cats and dog", "cat sand dog"].
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/word-break-ii/ }
 */
package _140_WordBreakII;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/** see test {@link _140_WordBreakII.SolutionTest } */
public class Solution {

    /**
     * Check the whole string is breakable first.  
     * If not breakable, then all other operations are a waste of time.
     */
    public List<String> wordBreak(String s, Set<String> wordDict) {
        int n = s.length();
        // check whether whole string can be broken
        if (!wordBreakOk(s, wordDict)) {
            return new ArrayList<>();
        }

        // initialize
        List<List<String>> dp = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            dp.add(new ArrayList<>());
        }
        dp.get(n).add("");

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j <= n; j++) {
                String word = s.substring(i, j);
                if (wordDict.contains(word)) {
                    for (String sentence : dp.get(j)) {
                        StringBuilder sb = new StringBuilder(word);
                        if (!sentence.isEmpty()) {
                            // append white space between words
                            sb.append(" ").append(sentence);
                        }
                        dp.get(i).add(sb.toString());
                    }
                }
            }
        }
        return dp.get(0);
    }

    // solution from word break I
    private boolean wordBreakOk(String s, Set<String> wordDict) {
        int len = s.length();
        // whether s[i : end] can be successfully broken
        boolean[] dp = new boolean[len + 1];
        dp[len] = true;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j <= len; j++) {
                if (wordDict.contains(s.substring(i, j)) && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }

}
