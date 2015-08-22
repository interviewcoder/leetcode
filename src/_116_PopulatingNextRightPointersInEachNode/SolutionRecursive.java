/**
 * Time : O(N); Space: O(logN)
 * @tag : Tree; Depth-first Search
 * @date: Jun 14, 2015
 * @by  : Steven Cooks
 * {@link https://leetcode.com/problems/populating-next-right-pointers-in-each-node/ }
 */
package _116_PopulatingNextRightPointersInEachNode;

import com.leetcode.TreeLinkNode;

/** see test {@link _116_PopulatingNextRightPointersInEachNode.SolutionRecursiveTest } */
public class SolutionRecursive {

    // recursive version
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right != null) {
            root.left.next = root.right;
            root.right.next = (root.next == null) ? null : root.next.left;
        }
        connect(root.left);
        connect(root.right);

    }

}
