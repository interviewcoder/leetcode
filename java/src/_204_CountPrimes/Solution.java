/**
 * Time : O(); Space : O()
 * @tag : Hash Table; Math
 * @by  : Steven Cooks
 * @date: Jul 9, 2015
 *******************************************************************************
 * Description: 
 * 
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/count-primes/ }
 */
package _204_CountPrimes;

/** see test {@link _204_CountPrimes.SolutionTest } */
public class Solution {

    /**
     * Sieve algorithm. For each prime number, delete all numbers that
     * has this prime number as one factor.
     */
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        int[] primes = new int[n];
        primes[0] = 0; // number 0 is not prime number
        primes[1] = 0; // number 1 is not prime number
        int len = primes.length;
        // initialize prime array
        for (int i = 2; i < len; i++) {
            primes[i] = 1;
        }
        
        int upper = (int) Math.sqrt(n);
        // if a number want to be defactored as A * B = n, then 
        // at least one number from A and B is less than or equal to Sqrt(n)
        for (int i = 2; i <= upper; i++) {
            if (primes[i] == 1) {
                // all numbers that have primes[i] as one factor
                // is not a prime number
                for (int j = 2; j * i < n; j++) {
                    primes[i * j] = 0;
                }
            }
        }
        
        // count number of prime numbers
        int result = 0;
        for (int number : primes) {
            if (number == 1) {
                result++;
            }
        }
        return result;
    }

}
