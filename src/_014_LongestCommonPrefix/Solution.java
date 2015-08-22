/**
 * Time : O(N); Space : O(N)
 * @tag : String
 * @by  : Steven Cooks
 * @date: Jul 10, 2015
 *******************************************************************************
 * Description: 
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/longest-common-prefix/ }
 */
package _014_LongestCommonPrefix;

/** see test {@link _014_LongestCommonPrefix.SolutionTest } */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        // find the shortest string
        int shortest = Integer.MAX_VALUE;
        for (String str : strs) {
            shortest = Math.min(shortest, str.length());
        }
        
        int i = 0;
        while (i < shortest) {
            // check every string whether they have ch at position i
            for (String str : strs) {
                if (str.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
        return strs[0].substring(0, shortest);
    }

}
