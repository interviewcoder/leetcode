/**
 * Time : O(N); Space: O(1)
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 14, 2015
 ********************************************************
 * Description:
 * 
 * Given a binary tree 
 * 
 * struct TreeLinkNode { 
 *  TreeLinkNode *left; 
 *  TreeLinkNode *right; 
 *  TreeLinkNode *next;
 * } 
 * Populate each next pointer to point to its next right node. If there 
 * is no next right node, the next pointer should be set to NULL. 
 * 
 * Initially, all next pointers are set to NULL. 
 * 
 * Note: You may only use constant extra space. You may assume that it is 
 * a perfect binary tree (ie, all leaves are at the same level, and every 
 * parent has two children). 
 * 
 * For example, Given the following perfect binary tree, 
 *      1 
 *    /   \ 
 *   2     3 
 *  / \   / \ 
 * 4   5 6   7 
 * 
 * After calling your function, the tree should look like: 
 *      1 -> NULL 
 *    /  \ 
 *   2 -> 3 -> NULL 
 *  / \  / \ 
 * 4->5->6->7 -> NULL
 * 
 ********************************************************
 * {@link https://leetcode.com/problems/populating-next-right-pointers-in-each-node/ }
 */
package _116_PopulatingNextRightPointersInEachNode;

import com.leetcode.TreeLinkNode;

// iterative version
/** see test {@link _116_PopulatingNextRightPointersInEachNode.SolutionTest } */
public class Solution {

    public void connect(TreeLinkNode root) {
        TreeLinkNode r = root;
        while (r != null) {
            TreeLinkNode node = r;
            // level order traversal
            while (node != null && node.left != null && node.right != null) {
                // connect nodes
                node.left.next = node.right;
                node.right.next = node.next != null ? node.next.left : null;
                node = node.next;
            }
            // go to leftmost node in next level
            r = r.left;
        }
    }

}
