/**
 * Time : O(N); Space: O(1)
 * @tag : Tree; Depth-first Search
 * @by  : Steven Cooks
 * @date: Jun 18, 2015
 ********************************************************
 * Description:
 * 
 * Follow up for problem "Populating Next Right Pointers in Each Node". 
 * What if the given tree could be any binary tree? Would your previous solution still work?
 ********************************************************
 * {@link https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/ }
 */
package _117_PopulatingNextRightPointersInEachNodeII;

import com.leetcode.TreeLinkNode;

/** see test {@link _117_PopulatingNextRightPointersInEachNodeII.SolutionTest } */
public class Solution {

    /** TODO BFS @see https://leetcode.com/discuss/36624/short-java-bfs-solution */
    public void connect(TreeLinkNode root) {
        TreeLinkNode levelStart = root;

        while (levelStart != null) {
            TreeLinkNode node = levelStart;
            TreeLinkNode nextLevelStart = null;
            // level order traversal
            while (node != null) {
                if (node.left != null) {
                    if (node.right != null) {
                        node.left.next = node.right;
                    } else {
                        node.left.next = getNext(node.next);
                    }
                    nextLevelStart = nextLevelStart == null ? node.left : nextLevelStart;
                }
                if (node.right != null) {
                    node.right.next = getNext(node.next);
                    nextLevelStart = nextLevelStart == null ? node.right: nextLevelStart;
                }
                node = node.next;
            }
            // go to next level
            levelStart = nextLevelStart;
        }

    }

    private TreeLinkNode getNext(TreeLinkNode node) {
        if (node == null) {
            return node;
        } else {
            TreeLinkNode temp = node;
            while (temp != null) {
                if (temp.left != null) {
                    return temp.left;
                } else if (temp.right != null) {
                    return temp.right;
                }
                temp = temp.next;
            }
            return temp;
        }
    }
    
}
