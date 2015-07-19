/**
 * Time : O(); Space: O()
 * @Tag : Dynamic Programming
 * @Date: Jun 11, 2015
 * {@link: https://leetcode.com/problems/word-break/ }
 */
package _139_WordBreak;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** see test {@link _139_WordBreak.SolutionMemoTest } */
public class SolutionMemo {

    private Map<String, Boolean> memo = new HashMap<>();

    // memo version dynamic programming
    public boolean wordBreak(String s, Set<String> wordDict) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        boolean breakable = false;
        if (wordDict.contains(s)) {
            breakable = true;
        } else {
            for (int i = s.length(); i >= 0; i--) {
                breakable = wordDict.contains(s.substring(0, i))
                        && wordBreak(s.substring(i), wordDict);
                if (breakable) {
                    break;
                }
            }
        }
        memo.put(s, breakable);
        return breakable;
    }
}
