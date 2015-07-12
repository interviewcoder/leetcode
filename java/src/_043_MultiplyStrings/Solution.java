/**
 * Time : O(N*M); Space: O()
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
 */
package _043_MultiplyStrings;

/** see test {@link _043_MultiplyStrings.SolutionTest } */
public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        // pre-allocate
        int[] product = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int index = len1 + len2 - i - j - 2;
                product[index] += (num1.charAt(i) - '0')
                        * (num2.charAt(j) - '0');
                product[index + 1] += product[index] / 10;
                product[index] %= 10;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = product.length - 1; i >= 0; i--) {
            if (i > 0 && stringBuilder.length() == 0 && product[i] == 0)
                continue;
            stringBuilder.append(product[i]);
        }
        return stringBuilder.toString();
    }

}
