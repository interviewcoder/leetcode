/**
 * Time : O() ; Space: O()
 * @tag : Hash Table; Math
 * @by  : Steven Cooks
 * @date: Oct 3, 2015
 ***************************************************************************
 * Description:
 * 
 * A strobogrammatic number is a number that looks the same when rotated 
 * 180 degrees (looked at upside down). 
 * 
 * Write a function to determine if a number is strobogrammatic. 
 * The number is represented as a string. 
 * 
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/strobogrammatic-number/ }
 */
package _246_StrobogrammaticNumber;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _246_StrobogrammaticNumber.SolutionTest } */
public class Solution {
    
    @SuppressWarnings({ "serial" })
    private static final Map<Character, Character> map = new HashMap<Character, Character>() {
        {
            put('6', '9');
            put('9', '6');
            put('0', '0');
            put('1', '1');
            put('8', '8');
        }
    };

    public boolean isStrobogrammatic(String num) {
        for (int i = 0, j = num.length() - 1; i <= j ; i++, j--) {
            char ch = num.charAt(i);
            if (!map.containsKey(ch) || map.get(ch) != num.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
