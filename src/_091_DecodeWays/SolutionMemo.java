/**
 * Time : O(N); Space: O(N)
 * @tag : Dynamic Programming; String
 * @by  : Steven Cooks
 * @date: May 8, 2015
 ************************************************************************
 * Description: 
 * 
 * A message containing letters from A-Z is being encoded to numbers using 
 * the following mapping: 
 *  'A' -> 1 'B' -> 2 ... 'Z' -> 26 
 *  Given an encoded message containing digits, determine the total number 
 *  of ways to decode it. 
 *  
 *  For example, 
 *  Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12). 
 *  The number of ways decoding "12" is 2.
 * 
 ************************************************************************
 * {@link https://leetcode.com/problems/decode-ways/ }
 */
package _091_DecodeWays;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _091_DecodeWays.SolutionMemoTest } */
public class SolutionMemo {

    private Map<Integer, Integer> memo;

    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        // initialize memo
        memo = new HashMap<Integer, Integer>();
        memo.put(len, 1);
        memo.put(len - 1, s.charAt(len - 1) == '0' ? 0 : 1);

        return numDecodings(s, 0);
    }

    public int numDecodings(String s, int index) {
        // look up in memo
        if (memo.containsKey(index)) {
            return memo.get(index);
        }

        char ch = s.charAt(index);
        int ways = 0;
        if (ch != '0') {
            // if s[index:end] begins with [10-26]
            if (Integer.parseInt(s.substring(index, index + 2)) <= 26) {
                ways = numDecodings(s, index + 2) + numDecodings(s, index + 1);
            } else {
                // if s[index:end] begins with [27-99]
                ways = numDecodings(s, index + 1);
            }
        }
        // if ch == '0', ways = 0;
        memo.put(index, ways);
        return ways;
    }
}
