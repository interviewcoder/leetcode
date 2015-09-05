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
            return;
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
        for (int i = 0, j = sub.length() - 1; i < j; i++, j--) {
            if (sub.charAt(i) != sub.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
