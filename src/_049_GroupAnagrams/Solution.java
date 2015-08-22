/**
 * Time : O(mn*lg(mn)); Space: O()
 * @tag : Hash Table; String
 * @by  : STeven Cooks
 * @date: Jun 2, 2015
 ***************************************************************************
 * Description: 
 * 
 * Note: 
 * For the return value, each inner list's elements must follow the lexicographic order. 
 * All inputs will be in lower-case.
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
public class Solution {

    /**
     * For each string, sort it alphabetically, and then check whether this 
     * sorted string has appeared in map.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        // <sorted string, index of list in result list> 
        Map<String, Integer> anagrams = new HashMap<>();
        Arrays.sort(strs);
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (anagrams.containsKey(sorted)) {
                result.get(anagrams.get(sorted)).add(str);
            } else {
                anagrams.put(sorted, result.size());
                result.add(new ArrayList<>(Arrays.asList(str)));
            }
        }
        return result;
    }

}
