package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * Level order traversal of tree. Fill empty nodes with "#".
     * e.g.  
     *   1
     *    \   => [1, #, 2]
     *     2  
     */
    public String toString() {
        String string = "[" + val + ", ";
        Queue<TreeNode> curLevel = new LinkedList<>();
        curLevel.add(left);
        curLevel.add(right);
        while (curLevel.isEmpty() == false) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (curLevel.isEmpty() == false) {
                TreeNode node = curLevel.poll();
                if (node != null) {
                    string += node.val + ", ";
                    nextLevel.add(node.left);
                    nextLevel.add(node.right);
                } else {
                    string += "#, ";
                }
            }
            curLevel = nextLevel;
        }
        // remove the redundant ", " at the end of String result
        return string.substring(0, string.length() - 2) + "]";
    }
    
    /**
     * If root node is not null, then connect root with its left and right child.
     * 
     * @param root root node (should not be null)
     * @param left
     * @param right
     */
    public static void connect(TreeNode root, TreeNode left, TreeNode right) {
        if (root != null) {
            root.left = left;
            root.right = right;
        }
    }

    public static String toString(TreeNode root) {
        String string = "";
        Queue<TreeNode> curLevel = new LinkedList<>();
        curLevel.add(root);
        while (curLevel.isEmpty() == false) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            String nextLine = "";
            while (curLevel.isEmpty() == false) {
                TreeNode node = curLevel.poll();
                string += node.val;
                if (node.left != null) {
                    nextLine += "/  ";
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLine += "/  ";
                    nextLevel.add(node.right);
                }
            }
            string += "\n";
            string += nextLine;
            curLevel = nextLevel;
        }
        // remove the redundant ", " at the end of String result
        return string;
    }

    /**
     * Whether two trees are the same.
     * 
     * @param p
     * @param q
     * @return true if two trees are the same.
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            // base case: 1) root is null 2) reaching leaf's child
            return true;
        }
        if (p != null && q != null) {
            return (p.val == q.val && // compare roots' values
                    isSameTree(p.left, q.left) && // compare left subtrees
            isSameTree(p.right, q.right)); // compare right subtrees
        } else {
            // is only of root is null, return false
            return false;
        }
    }
    
    // null
    public static TreeNode getEmptyBST() {
        return null;
    }
    
    //   1
    public static TreeNode getBST1() {
        return getTree0();
    }
    
    //   1 
    //    \
    //     2
    //      \
    //       3 
    public static TreeNode getBST2() {
        return getTree1();
    }
    
    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    public static TreeNode getBST3() {
        return getTree21();
    }

    //      2 
    //    /   \
    //   1     3
    public static TreeNode getBST4() {
        return getTree31();
    }
    
    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    public static TreeNode getBST5() {
        return getTree5();
    }

    //         8
    //      /     \
    //     6       18
    //   /   \     / \
    //  3     7   10  20
    //   \
    //     5
    //    /
    //    4
    public static TreeNode getBST6() {
        return getTree11();
    }
    
    // 1 
    public static TreeNode getTree0() {
        TreeNode root = new TreeNode(1);
        return root;
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    // length; search tree; balanced
    //    3        true       false 
    public static TreeNode getTree1() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        return t1;
    }

    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    // length; search tree; balanced
    //    3        false      false 
    public static TreeNode getTree2() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode.connect(t1, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        return root;
    }
    
    //      3 
    //     /   
    //    2
    //   / 
    //  1 
    // length; search tree; balanced
    //    3        true      false 
    public static TreeNode getTree21() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(1);
        TreeNode.connect(t1, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        return root;
    }

    //      1 
    //    /   \
    //   2     3
    // length; search tree; balanced
    //    2        false      true 
    public static TreeNode getTree3() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, t3);
        return t1;
    }

    //      2 
    //    /   \
    //   1     3
    // length; search tree; balanced
    //    2        true      true 
    public static TreeNode getTree31() {
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, t3);
        return t1;
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    // length; search tree; balanced
    //    4        false      false 
    public static TreeNode getTree4() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(5);
        TreeNode t10 = new TreeNode(1);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, null);
        TreeNode.connect(t3, t5, t6);
        TreeNode.connect(t4, t7, t8);
        TreeNode.connect(t6, t9, t10);
        TreeNode root = t1;
        return root;
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    // length; search tree; balanced
    //    3        true       true 
    public static TreeNode getTree5() {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(12);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(7);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, t5);
        TreeNode root = t1;
        return root;
    }

    //          5
    //         /
    //       4
    //      /
    //     3
    //    /
    //   2
    //  /
    // 1
    // length; search tree; balanced
    //    5        true       false 
    public static TreeNode getTree6() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(1);
        TreeNode.connect(t1, t2, null);
        TreeNode.connect(t2, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode.connect(t4, t5, null);
        TreeNode root = t1;
        return root;
    }

    //   5 
    //    \
    //     4 
    //      \
    //       3
    //        \
    //         2 
    //          \
    //           1 
    // length; search tree; balanced
    //    5        false     false 
    public static TreeNode getTree7() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(1);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode.connect(t3, null, t4);
        TreeNode.connect(t4, null, t5);
        TreeNode root = t1;
        return root;
    }

    //  1
    //    \
    //      2
    //     /
    //    3
    // length; search tree; balanced
    //    3        false     false 
    public static TreeNode getTree8() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode.connect(n1, null, n2);
        TreeNode.connect(n2, n3, null);
        TreeNode root = n1;
        return root;
    }
    
    //       1
    //     /   \
    //    2     3
    //   / \   / \
    //  4  5  6   7
    public static TreeNode getTree9() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode.connect(n1, n2, n3);
        TreeNode.connect(n2, n4, n5);
        TreeNode.connect(n3, n6, n7);
        TreeNode root = n1;
        return root;
    }

    //        5
    //      /   \
    //     4     8
    //         /  \
    //       13    4
    //            / \
    //           5   1
    // length; search tree; balanced
    //    4        false      true 
    public static TreeNode getTree10() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t9 = new TreeNode(5);
        TreeNode t10 = new TreeNode(1);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, null, null);
        TreeNode.connect(t3, t5, t6);
        TreeNode.connect(t6, t9, t10);
        TreeNode root = t1;
        return root;
    }
    
    //         8
    //      /     \
    //     6       18
    //   /   \     / \
    //  3     7   10  20
    //   \
    //     5
    //    /
    //    4
    // length; search tree; balanced
    //    5        true       false 
    public static TreeNode getTree11() {
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(18);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(7);
        TreeNode t6 = new TreeNode(10);
        TreeNode t7 = new TreeNode(20);
        TreeNode t8 = new TreeNode(5);
        TreeNode t9 = new TreeNode(4);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, t5);
        TreeNode.connect(t3, t6, t7);
        TreeNode.connect(t4, null, t8);
        TreeNode.connect(t8, t9, null);
        return t1;
    }

}
