[098] Validate Binary Search Tree

1. Time: O(N);  Space: `O(N)`:

    1) convert tree to in-order list
    2) check if the list is in ascending order
    ```java
    // step (1)
    TreeNode[] nodes = inorder(root);
    // step (2)
    for (int i = 1; i < n; i++) {
        TreeNode pre = nodes[i - 1];
        TreeNode cur = nodes[i];
        if (pre.val >= cur.val) {
            return false;
        }
    }
    return true;
    ```
    
2. Time: O(N); Space: `O(1)`, see  **`SolutionPrev.java`**
        
    Instead of converting tree to list, we store prev while doing `in-order` traversal
    ```java
    TreeNode pre = null;
    public boolean inorder(TreeNode cur) {
        // base case
        if (cur == null) {
            return true;
        }
        // recursive case
        // step 1) visit left subtree
        if (!inorder(cur.left)) => return false;
        
        //  step 2) visit cur
        if (prev != null && prev.val >= cur.val) => return false;
        
        // step 3) visit right subtree
        prev = cur;  // set previous node
        return inorder(cur.right);
    }
    ```
    