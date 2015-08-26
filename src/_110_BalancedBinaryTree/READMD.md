### [110] Balanced Binary Tree

- Solution I: visit same node repeated `O(NlgN) ~ O(N^2)`
 
    - Either *pre*-order or *post*-order can solve the problem.
    ```java
    // viist left subtree and right subtree
    foo(root.left) && foo(root.right)
    // visit again to get the depth of each subtree
    return | depth(root.left) - depth(root.right) | <= 1
    ```
- Solution II: visit each node only once! `O(N)`
 
    - only `post`-order can solve the problen in this way
    ```java
    // return -1 if tree is not balanced
    // otherwise return tree depth
    public int maxDepth(TreeNode root) {
        // visit left subtree and right subtree
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        // visit root
        if (left == -1 || right == -1
                || Math.max(left - right) > 1) {
            return -1;
        } else {
            return 1 + Math.max(left, right);
        }
    }
    ```