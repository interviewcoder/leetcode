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

    public static void connect(TreeLinkNode r, TreeLinkNode left, 
            TreeLinkNode right) {
        if (r != null) {
            r.left = left;
            r.right = right;
        }
    }

    public static void connect(TreeLinkNode r, TreeLinkNode left, 
            TreeLinkNode right, TreeLinkNode next) {
        if (r != null) {
            r.left = left;
            r.right = right;
            r.next = next;
        }
    }

    public static boolean isSameLinkTree(TreeLinkNode p, TreeLinkNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            return p.val == q.val 
                    && isSameLinkTree(p.left, q.left) 
                    && isSameLinkTree(p.right, q.right)
                    && isSameLinkTree(p.next, q.next);
        } else {
            return false;
        }
    }

}
