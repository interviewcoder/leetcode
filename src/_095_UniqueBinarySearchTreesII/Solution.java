/**
 * Time : O(); Space: O()
 * @tag : Tree; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Jun 10, 2015
 *************************************************************************
 * Description: 
 * 
 * Given n, generate all structurally unique BST's (binary search trees) 
 * that store values 1...n. 
 * 
 * For example, 
 * Given n = 3, your program should return all 5 unique BST's shown below. 
 * 1         3     3      2      1
 *  \       /     /      / \      \
 *   3     2     1      1   3      2
 *  /     /       \                 \
 * 2     1         2                 3
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/unique-binary-search-trees-ii/ }
 */
package _095_UniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/** see test {@link _095_UniqueBinarySearchTreesII.SolutionTest } */
public class Solution {

    public List<TreeNode> generateTrees(int n) {
        if (n <= 0) {
            return new ArrayList<TreeNode>();
        }
        int start = 1;
        int end = n;
        return generateTrees(start, end);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        // base case
        if (start > end) {
            result.add(null);
            return result;
        }
        
        // recursive case
        for (int rootVal = start; rootVal <= end; rootVal++) {
            List<TreeNode> lefts = generateTrees(start, rootVal - 1);
            List<TreeNode> rights = generateTrees(rootVal + 1, end);
            for (TreeNode left : lefts) {
                for (TreeNode right : rights) {
                    TreeNode root = new TreeNode(rootVal);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        return result;
    }
    
}
