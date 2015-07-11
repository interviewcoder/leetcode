/**
 * Time : O(); Space : O()
 * @tag : Math; String
 * @by  : Steven Cooks
 * @date: Jul 10, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a roman numeral, convert it to an integer. 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/roman-to-integer/ }
 */
package _013_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    @SuppressWarnings("serial")
    private Map<Character, Integer> map = new HashMap<Character, Integer>() {{
       put('I', 1);
       put('V', 5);
       put('X', 10);
       put('L', 50);
       put('C', 100);
       put('D', 500);
       put('M', 1000);
    }};
    
    public int romanToInt(String s) {
        int i = 0;
        int len = s.length();
        int result = 0;
        while (i < len) {
            int num = map.get(s.charAt(i));
            if (i + 1 < len && num < map.get(s.charAt(i + 1))) {
                result -= num;
            } else {
                result += num;
            }
            i++;
        }
        return result;
    }

}
