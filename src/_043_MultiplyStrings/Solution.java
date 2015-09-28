/**
 * Time : O(N*M); Space: O(N + M)
 * @tag : Math; Array
 * @by  : Steven Cooks
 * @date: Jun 4, 2015
 *************************************************************************
 * Description: 
 * 
 * Given two numbers represented as strings, return multiplication of
 * the numbers as a string. 
 * 
 * Note: The numbers can be arbitrarily large and are non-negative.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/multiply-strings/ }
 * @refer {@link https://leetcode.com/discuss/29364/clear-java-solution-without-reversal }
 */
package _043_MultiplyStrings;

/** see test {@link _043_MultiplyStrings.SolutionTest } */
public class Solution {
    
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int[] product = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int carry = 0;
            int j = num2.length() - 1;
            int index = i + j + 1;  // index where stores current result
            while (j >= 0 || carry != 0) {
                int n1 = j >= 0 ? num2.charAt(j--) - '0' : 0;
                int n2 = i >= 0 ? num1.charAt(i) - '0' : 0;
                int multi = n1 * n2 + carry + product[index];
                carry = multi / 10;
                product[index--] = multi % 10;
            }
        }
        boolean obvious = false; // first non-zero digit
        for (int i = 0; i < product.length; i++) {
            if (product[i] == 0 && !obvious) {
                continue;
            }
            obvious = true;
            sb.append(product[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    // version2: need a reverse at the end
    public String multiply_reverse(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] product = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int index = len1 + len2 - i - j - 2;
                product[index] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product[index + 1] += product[index] / 10;
                product[index] %= 10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = product.length - 1; i > 0; i--) {
            if (stringBuilder.length() == 0 && product[i] == 0)
                continue;
            stringBuilder.append(product[i]);
        }
        stringBuilder.append(product[0]);
        return stringBuilder.toString();
    }

}
