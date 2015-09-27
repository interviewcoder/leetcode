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
import java.util.LinkedList;
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
            if (!anagrams.containsKey(sorted)) {
                anagrams.put(sorted, result.size());
                result.add(new ArrayList<>());
            }
            result.get(anagrams.get(sorted)).add(str);
        }
        return result;
    }
    
    
    // version 2: larger map, not as space efficient as version1
    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Arrays.sort(strs);
        // <sorted array, list of anagrams>
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strs) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String anagram = new String(str);
            if (!anagrams.containsKey(anagram)) {
                anagrams.put(anagram, new LinkedList<>());
            }
            anagrams.get(anagram).add(s);
        }
        for (List<String> list : anagrams.values()) {
            res.add(list);
        }
        return res;
    }

}
