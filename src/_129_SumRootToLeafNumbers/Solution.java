/**
 * Time : O(); Space: O()
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 16, 2015
 ********************************************************************************
 *  Given a binary tree containing digits from 0-9 only,                        * 
 *  each root-to-leaf path could represent a number.                            *
 *  An example is the root-to-leaf path 1->2->3 which represents the number 123.*
 *  Find the total sum of all root-to-leaf numbers.                             *
 ********************************************************************************
 * {@link https://leetcode.com/problems/sum-root-to-leaf-numbers/ }
 *  1. construct StringBuilder using integer.
 */
package _129_SumRootToLeafNumbers;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/** see test {@link _129_SumRootToLeafNumbers.SolutionTest } */
public class Solution {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<StringBuilder> numStrs = sumNumbersList(root);
        int result = 0;
        for (StringBuilder numStr : numStrs) {
            result += Integer.parseInt(numStr.toString());
        }
        return result;
    }

    List<StringBuilder> sumNumbersList (TreeNode root) {
        List<StringBuilder> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        if (root.left == null && root.right == null) {
            // reaching leaf node
            result.add(new StringBuilder("" + root.val));
            return result;
        }
        result.addAll(sumNumbersList(root.left));
        result.addAll(sumNumbersList(root.right));
        String digit = "" + root.val;
        for (StringBuilder strBuilder : result) {
            strBuilder.insert(0, digit);
        }
        return result;
    }
}
