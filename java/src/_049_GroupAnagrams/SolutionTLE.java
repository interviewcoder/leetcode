/**
 * Time : O(); Space: O()
 * @tag : Hash Table; String
 * @by  : STeven Cooks
 * @date: Jun 2, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given an array of strings, return all groups of strings that are anagrams. 
 * Note: All inputs will be in lower-case.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/anagrams/ }
 */
package _049_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** see test {@link _049_GroupAnagrams.SolutionTest } */
public class SolutionTLE {

    public List<List<String>> groupAnagrams(String[] strs) {
        Arrays.sort(strs);
        List<List<String>> result = new ArrayList<>();
        Map<Map<Character, Integer>, Integer> anagrams = new HashMap<>();
        for (String string : strs) {
            // count the frequency of characters in string
            Map<Character, Integer> strFre = new HashMap<>();
            for (char ch : string.toCharArray()) {
                int count = 1;
                if (strFre.containsKey(ch)) {
                    count += strFre.get(ch);
                }
                strFre.put(ch, count);
            }
            // compare with current anagram dictionary
            if (anagrams.containsKey(strFre)) {
                System.out.println("Here");
                result.get(anagrams.get(strFre)).add(string);
            } else {
                anagrams.put(strFre, result.size());
                result.add(Arrays.asList(string));
            }
        }
        return result;
    }

}
