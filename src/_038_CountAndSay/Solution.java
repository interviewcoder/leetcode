/**
 * Time : O(N); Space: O(N)
 * @tag : String
 * @by  : Steven Cooks
 * @date: Jul 10, 2015
 *************************************************************************
 * Description: 
 * The count-and-say sequence is the sequence of integers beginning as 
 * follows: 1, 11, 21, 1211, 111221, ... 
 * 
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21. 
 * 21 is read off as "one 2, then one 1" or 1211. 
 * 
 * Given an integer n, generate the nth sequence. 
 * Note: The sequence of integers will be represented as a string.
 *
 *************************************************************************
 * {@link https://leetcode.com/problems/count-and-say/ }
 */
package _038_CountAndSay;

/** see test {@link _038_CountAndSay.SolutionTest } */
public class Solution {
    
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            int index = 0;
            int count = 0;
            while (index <= sb.length()) {
                if (index == 0 || (index < sb.length() && sb.charAt(index) == sb.charAt(index - 1))) {
                    count++;
                } else {
                    next.append(count).append(sb.charAt(index - 1));
                    count = 1;
                }
                index++;
            }
            sb = next;
        }
        return sb.toString();
    }

    public String countAndSay2(int n) {
        if (n < 1) {
            return "";
        }
        // initialize 
        StringBuilder str = new StringBuilder("1");
        for (int i = 1; i < n ; i++) {
            StringBuilder say = new StringBuilder();
            // count the number by group
            int len = str.length();
            int index = 0;
            while (index < len) {
                int count = 1;
                while (index < len - 1 && str.charAt(index) == str.charAt(index + 1)) {
                    count++;
                    index++;
                }
                say.append(count + "" + str.charAt(index));
                index++;
            }
            str = say;
        }
        return str.toString();
    }

}
