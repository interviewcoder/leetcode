/**
 * Time : O(); Space: O()
 * @tag : Backtracking
 * @by  : Steven Cooks
 * @date: Jun 16, 2015
 *************************************************************************
 * Description:
 * 
 *  Given a string s, partition s such that every substring of the 
 *  partition is a palindrome. 
 *  Return all possible palindrome partitioning of s. 
 *  
 *  For example, given s = "aab", 
 *  Return 
 *      [ 
 *          ["aa","b"], 
 *          ["a","a","b"] 
 *      ]
 *      
 *************************************************************************
 * {@link https://leetcode.com/problems/palindrome-partitioning/ }
 */
package _131_PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

/** {@link com.leetcode.Classify#findAllPaths() } */
/** see test {@link _131_PalindromePartitioning.SolutionTest } */
public class Solution {
    
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s.length() == 0) {
            return result;
        }
        int index = 0;
        List<String> path = new ArrayList<>();
        partition(s, index, path, result);
        return  result;
    }

    // backtracking
    private void partition(String s, int index, List<String> path,
            List<List<String>> result) {
        int len = s.length();
        // base case
        if (index == len) {
            // one valid partition is found
            result.add(path);
        }
        
        // recursive case
        for (int i = index; i < len; i++) {
            String sub = s.substring(index, i + 1);
            if (isPalindrome(sub)) {
                List<String> newPath = new ArrayList<String>(path);
                newPath.add(sub);
                // go on searching
                partition(s, i + 1, newPath, result);
            }
        }
        
    }

    private boolean isPalindrome(String sub) {
        int len = sub.length();
        if (len == 0 || len == 1) {
            return true;
        }
        int left = (len - 1) / 2;
        int right = len / 2;
        while (left >= 0 && right < len) {
            if (sub.charAt(left) != sub.charAt(right)) {
                return false;
            }
            left--;
            right++;
        }
        return true;
    }

}
