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

/** see test {@link _091_DecodeWays.SolutionTest } */
public class Solution {

    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0 || s.charAt(0) == '0') {
            return 0;
        }
        // dp[i] = decode ways for s[: i]
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i < len + 1; i++) {
            // if last 2 digits is in [10,26]
            if (s.charAt(i - 2) != '0'
                    && Integer.parseInt(s.substring(i - 2, i)) <= 26) {
                dp[i] = dp[i - 2];
            }
            // if last digit is [1-9]
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
        }
        return dp[len];
    }

}
