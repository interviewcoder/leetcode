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

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0) {
            // return [] rather than [""] for empty string: ""
            return result;
        }
        int index = 0;
        String prefix = "";
        letterCombinations(digits, index, prefix, result);
        return result;
    }

    // depth-first search
    public void letterCombinations(String digits, int index, String prefix,
            List<String> result) {
        // reaching end
        if (index == digits.length()) {
            // found one combination and return from stack
            result.add(prefix);
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = mapping[digit];
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            // go to deeper depth
            letterCombinations(digits, index + 1, prefix + ch, result);
        }
    }

}
