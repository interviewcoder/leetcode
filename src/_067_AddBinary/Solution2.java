/**
 * Time : O(); Space: O()
 * @Tag : Math; String
 * @Date: Jun 5, 2015
 * --------------------------------------------------------
 * P.S. : 1. write concise code, generalized from Solution1.
 *        2. use StringBuilder for string operations
 */
package _067_AddBinary;

public class Solution2 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;
        int radix = 2;
        // until all digits in both a and b and carry are handled
        while (indexA >= 0 || indexB >= 0 || carry != 0) {
            int number1 = indexA >= 0 ? a.charAt(indexA--) - '0' : 0;
            int number2 = indexB >= 0 ? b.charAt(indexB--) - '0' : 0;
            int number = number1 + number2 + carry;
            result.append(number % radix);
            carry = number / radix;
        }
        return result.reverse().toString();
    }
}
