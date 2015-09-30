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

/** see test {@link _091_DecodeWays.SolutionSuffixTest } */
public class SolutionSuffix {

    // considering suffix: s[i: end]
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int[] f = new int[n + 1];
        for (int i = n; i >= 0; i--) {
            int count = 0;
            if (i == n) {
                count = 1;
            } else {
                int num1 = s.charAt(i) - '0';
                if (num1 > 0 && num1 < 10) {
                    count = f[i + 1];
                }
                if (i + 1 < n) {
                    int num2 = s.charAt(i + 1) - '0' + 10 * num1;
                    if (num2 >= 10 && num2 <= 26) {
                        count += f[i + 2];
                    }
                }
            }
            f[i] = count;
        }
        return f[0];
    }

}
