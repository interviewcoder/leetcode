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

/** see test {@link _096_UniqueBinarySearchTrees.SolutionDFSTest } */
public class SolutionDFS {

    public int numTrees(int n) {
        if (n <= 0) {
            return 0;
        }
        int start = 1;
        int end = n;
        return numTrees(start, end);
    }

    private int numTrees(int start, int end) {
        // base case
        int result = 0;
        if (start > end) {
            return 1;
        }
        // recursive case
        for (int root = start; root <= end; root++) {
            int lefts = numTrees(start, root - 1);
            int rights = numTrees(root + 1, end);
            result += lefts * rights;
        }
        return result;
    }
}
