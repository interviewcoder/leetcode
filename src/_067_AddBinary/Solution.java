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
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int num1 = i >= 0 ? a.charAt(i--) - '0' : 0;
            int num2 = j >= 0 ? b.charAt(j--) - '0' : 0;
            int num = num1 + num2 + carry;
            sb.append(num % 2);
            carry = num / 2;
        }
        return sb.reverse().toString();
    }

}
