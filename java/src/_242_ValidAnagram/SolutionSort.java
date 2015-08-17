/**
 * Time : O() ; Space: O()
 * @tag : Hash Table; Sort
 * @by  : Steven Cooks
 * @date: Aug 17, 2015
 ***************************************************************************
 * Description:
 * 
 * Given two strings s and t, write a function to determine if t is an anagram of s. 
 * For example, 
 *  s = "anagram", t = "nagaram", return true. 
 *  s = "rat", t = "car", return false. 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/valid-anagram/ }
 */
package _242_ValidAnagram;

import java.util.Arrays;

/** see test {@link _242_ValidAnagram.SolutionSortTest } */
public class SolutionSort {

    public boolean isAnagram(String s, String t) {
        String sortedS = sortString(s);
        String sortedT = sortString(t);
        return sortedS.equals(sortedT);
    }

    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
