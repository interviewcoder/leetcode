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
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/** {@link com.leetcode.Classify#findAllPaths() } */
/** see test {@link _140_WordBreakII.SolutionTest } */
public class Solution {

    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> result = new ArrayList<>();
        List<List<List<String>>> dp = new ArrayList<>();
        int len = s.length();
        for (int i = len; i >= 0; i--) {
            
        }
        return result;
    }

}
