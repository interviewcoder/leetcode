/**
 * Time : O(2^n); Space: O(2^n)
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** see test {@link _131_PalindromePartitioning.SolutionTest } */
public class Solution {
    
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        int index = 0;
        List<String> path = new ArrayList<>();
        partition(s, index, path, result);
        return  result;
    }

    // backtracking
    private void partition(String s, int index, List<String> path,
            List<List<String>> result) {
        // base case
        if (index == s.length()) {
            result.add(path);
            return;
        }
        // recursive case
        for (int i = index; i < s.length(); i++) {
            String sub = s.substring(index, i + 1);
            if (isPalindrome(sub)) {
                List<String> newPath = new ArrayList<String>(path);
                newPath.add(sub);
                // go on searching
                partition(s, i + 1, newPath, result);
            }
        }
    }
    
    private Map<String, Boolean> memo = new HashMap<>();

    private boolean isPalindrome(String sub) {
        if (memo.containsKey(sub)) {
            return memo.get(sub);
        }
        boolean ispalin = true;
        for (int i = 0, j = sub.length() - 1; i < j; i++, j--) {
            if (sub.charAt(i) != sub.charAt(j)) {
                ispalin = false;
                break;
            }
        }
        memo.put(sub, ispalin);
        return ispalin;
    }

}
