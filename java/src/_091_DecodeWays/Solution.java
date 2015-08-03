/**
 * Time : O(N); Space: O(1)
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

    /**
     * Similarly to climbing stairs, for each s[i] we have two choices,
     * 1) if s[i-1:i] is in [10, 26], we can treat s[i:1:i] as the last number we decode 
     * 2) if s[i] is in [1, 9], we can treat s[i] as the last number we decode
     */
    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int p1 = 1;   // number of decoding s[0 : i - 2]
        int p2 = 1;   // number of decoding s[0 : i - 1]
        int last = 0; // last digit before current digit

        for (int i = 0; i < len ; i++) {
            int digit = s.charAt(i) - '0';
            // number of decoding s[0 : i]
            int result = 0;

            int num = last * 10 + digit;
            // if last 2 digits is in [10,26]
            if (num >= 10 && num <= 26) {
                result += p1;
            }

            // if last digit is [1-9]
            if (digit != 0) {
                result += p2;
            }
            
            // update
            p1 = p2;
            p2 = result;
            last = digit;
        }
        return p2;
    }

}
