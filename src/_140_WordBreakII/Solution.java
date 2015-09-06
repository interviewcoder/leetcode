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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** see test {@link _140_WordBreakII.SolutionTest } */
public class Solution {
    
    // memo[word] = list of word break
    private Map<String, List<String>> memo = new HashMap<>();

    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> res = new ArrayList<>();
        int len = s.length();
        for (int i = 1; i <= len; i++) {
            String prefix = s.substring(0, i);
            if (wordDict.contains(prefix)) {
                if (i == len) {
                    res.add(prefix);
                } else {
                    String remain = s.substring(i);
                    List<String> remainSet = memo.containsKey(remain) ? memo.get(remain) : wordBreak(remain, wordDict);
                    for (String str : remainSet) {
                        StringBuilder sb = new StringBuilder(prefix);
                        sb.append(" ").append(str);
                        res.add(sb.toString());
                    }
                }
            }
        }
        memo.put(s, res);
        return res;
    }

}
