/**
 * Time : O(); Space: O()
 * @tag : Tree; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 13, 2015
 *************************************************************************
 * Description: 
 * 
 * Given n, how many structurally unique BST's (binary search trees) that 
 * store values 1...n?
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/unique-binary-search-trees/ }
 */
package _096_UniqueBinarySearchTrees;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _096_UniqueBinarySearchTrees.SolutionTest } */
public class Solution {

    private Map<Integer, Integer> memo = new HashMap<>();
    
    public int numTrees(int n) {
        if (n <= 0) {
            return 0;
        }
        int start = 1;
        int end = n;
        return numTrees(start, end, n);
    }

    private int numTrees(int start, int end, int n) {
        int key = start * n + end;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int nums = 0;
        if (start > end) {
            return 1;
        }
        // recursive case
        for (int root = start; root <= end; root++) {
            int lefts = numTrees(start, root - 1, n);
            int rights = numTrees(root + 1, end, n);
            nums += lefts * rights;
        }
        memo.put(key, nums);
        return nums;
    }

}
