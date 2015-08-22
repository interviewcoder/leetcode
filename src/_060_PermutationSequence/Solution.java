/**
 * Time : O(); Space: O()
 * @tag : Backtracking; Math
 * @by  : Steven Cooks
 * @date: Jun 4, 2015
 *************************************************************************
 * Description: 
 * 
 * The set [1,2,3,…,n] contains a total of n! unique permutations. 
 * By listing and labeling all of the permutations in order, 
 * We get the following sequence (ie, for n = 3): 
 * "123" "132" "213" "231" "312" "321" 
 * 
 * Given n and k, return the kth permutation sequence. 
 * Note: Given n will be between 1 and 9 inclusive.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/permutation-sequence/ }
 * P.S. : how to write bug-free code
 */
package _060_PermutationSequence;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _060_PermutationSequence.SolutionTest } */
public class Solution {

    public String getPermutation(int n, int k) {
        StringBuilder result = new StringBuilder();

        // calculate (n-1)!
        // for the 1st digit in result, there are n choices (i.e. buckets),
        // and each bucket has (n - 1) sub-buckets.
        int bucketSize = 1;
        for (int i = 1; i < n; i++) {
            bucketSize *= i;
        }

        // all digits in permutation
        List<Integer> digits = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            digits.add(i + 1);
        }
        int q = n - 1;
        while (digits.size() != 0) {
            int iBucket = (k - 1) / bucketSize;
            k = (k - 1) % bucketSize + 1;

            result.append(digits.get(iBucket));
            digits.remove(iBucket);
            if (q == 0) {
                bucketSize = 1;
            } else {
                bucketSize /= q;
            }
            q--;
        }
        return result.toString();
    }

}
