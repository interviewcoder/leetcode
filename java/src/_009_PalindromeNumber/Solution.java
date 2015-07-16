/**
 * Time : O(N); Space : O(1)
 * @tag : Math
 * @by  : Steven Cooks
 * @date: Jul 16, 2015
 *************************************************************************
 * Description: 
 * 
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * For this problem, negative numbers are considered not palindrome number.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/palindrome-number/ }
 * 1. compare head and tail in one number
 * 2. reverse a number; counting digits of number
 */
package _009_PalindromeNumber;

/** see test {@link _009_PalindromeNumber.SolutionTest } */
public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int digits = x == 0 ? 1 : 0;
        int num = x;
        // count the digits in x
        while (num != 0) {
            num /= 10;
            digits++;
        }
        
        // construct the reversed second half of the number
        int rev = 0;
        int upper = (digits - 1) / 2;
        for (int i = 0; i <= upper; i++) {
            // add the tailing number from x to reversing number
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        // if odd number, not rev has one more digit for comparing,
        // so we should compare rev / 10 with x; otherwise compare rev with x
        return rev == x || rev / 10 == x;
    }

}
