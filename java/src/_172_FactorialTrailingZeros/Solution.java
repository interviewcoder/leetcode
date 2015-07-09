/**
 * Time : O(); Space : O()
 * @tag : Math
 * @by  : Steven Cooks
 * @date: Jul 8, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given an integer n, return the number of trailing zeroes in n!. 
 * Note: Your solution should be in logarithmic time complexity.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/factorial-trailing-zeroes/ }
 */
package _172_FactorialTrailingZeros;

/** see test {@link _172_FactorialTrailingZeros.SolutionTest } */
public class Solution {
    /**
     * each 2 * 5 will generate one 10, which adding one more 
     * trailing 0. And we have more 2 than 5 in n!, so our job
     * is to count the number of 5s in n!'s factors 
     */
    public int trailingZeroes(int n) {
        int numberOf5 = 0;
        while (n != 0) {
            int count = n / 5;
            numberOf5 += count; 
            n = count;
        }
        return numberOf5;
    }
}
