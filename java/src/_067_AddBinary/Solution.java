/**
 * Time : O(); Space: O()
 * @tag : Math; String
 * @by  : Steven Cooks
 * @date: Jul 10, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a non-negative number represented as an array of digits, plus one 
 * to the number. 
 * The digits are stored such that the most significant digit is at the 
 * head of the list.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/add-binary/ }
 */
package _067_AddBinary;

/** see test {@link _067_AddBinary.SolutionTest } */
public class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        String result = "";
        int carry = 0;
        int radix = 2;
        int lenA = a.length();
        int lenB = b.length();
        for (int i = lenB - 1; i >= 0; i--) {
            char chA = a.charAt(i + lenA - lenB);
            char chB = b.charAt(i);
            int number = (chA - '0') + (chB - '0') + carry;
            result = (number % radix) + result;
            carry = number / radix;
        }
        // the rest part of string a
        for (int i = lenA - lenB - 1; i >= 0; i--) {
            int number = (a.charAt(i) - '0') + carry;
            result = (number % radix) + result;
            carry = number / radix;
        }
        // deal with unfinished carry
        if (carry != 0) {
            result = "1" + result;
        }

        return result;
    }
}
