/**
 * Time : O(); Space: O()
 * @tag : Backtracking; String
 * @by  : Steven Cooks
 * @date: May 3, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a digit string, return all possible letter combinations that the 
 * number could represent. 
 * A mapping of digit to letters (just like on the telephone buttons) 
 * is given below.
 * 
 * Input:Digit string "23" 
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]. 
 * 
 * Note: 
 * Although the above answer is in lexicographical order, your answer 
 * could be in any order you want.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/letter-combinations-of-a-phone-number/ }
 */
package _017_LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _017_LetterCombinationsOfAPhoneNumber.SolutionTest } */
public class Solution {

    public static final String[] mapping = { "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz" };

    // iterative, BFS version
    public List<String> letterCombinations(String digits) {
        List<String> cur = new ArrayList<String>();
        if (digits.length() == 0) {
            return cur;
        }
        cur.add("");
        for (int i = 0; i < digits.length(); i++) {
            String strs = mapping[digits.charAt(i) - '0'];
            List<String> next = new ArrayList<>();
            for (int j = 0; j < strs.length(); j++) {
                char ch = strs.charAt(j);
                // try to insert 'ch' to each current combination
                for (String comb : cur) {
                    next.add(comb + ch);
                }
            }
            cur = next;
        }
        return cur;
    }

}
