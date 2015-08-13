package com.leetcode;

/**
 * For [116] and [117]
 */
public class TreeLinkNode {

    public int val;
    public TreeLinkNode left;
    public TreeLinkNode right;
    public TreeLinkNode next;

    public TreeLinkNode(int x) {
        val = x;
    }

    /**
     * Connects root with its left and right nodes.
     * 
     * @param root
     * @param left
     * @param right
     * @throws NullPointerException if root is null
     */
    public static void connect(TreeLinkNode root, TreeLinkNode left,
            TreeLinkNode right) {
        if (root == null) {
            throw new NullPointerException();
        }
        root.left = left;
        root.right = right;
    }

    /**
     * Connects root with its left and right nodes.
     * 
     * @param r
     * @param left
     * @param right
     * @param next
     * @throws NullPointerException if root is null
     */
    public static void connect(TreeLinkNode r, TreeLinkNode left,
            TreeLinkNode right, TreeLinkNode next) {
        if (r == null) {
            throw new NullPointerException();
        }
        r.left = left;
        r.right = right;
        r.next = next;
    }

    /**
     * Returns true if two trees are the same.
     * 
     * @param p
     * @param q
     * @return true if two trees are the same
     */
    public static boolean isSameLinkTree(TreeLinkNode p, TreeLinkNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            return p.val == q.val && isSameLinkTree(p.left, q.left)
                    && isSameLinkTree(p.right, q.right)
                    && isSameLinkTree(p.next, q.next);
        } else {
            return false;
        }
    }

}
