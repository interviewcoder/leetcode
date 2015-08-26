### [144] Binary Tree Preorder Traversal

1. recursive solution
    ```java
    // pre-order: visit root -> visit left subtree -> visit right subtree
    void foo(TreeNode root) {
        // base case
        if (root == null) {
            return;
        }
        // recursive case
        visit(root);
        foo(root.left);
        foo(root.right);
    }
    ```
    
2. iterative solution
    - all nodes into stack
    ```java
        // pop root -> push root.right -> push root.left
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            visit(node);
            push(node.right);
            push(node.left);
        }
        
    ```
    - only right child into stack
    ```java
    // visit node -> push right child before visiting left subtree
    while (node != null) {
        visit(node);
        // push right child if right side not empty
        if (node.right != null) {
            stack.push(node.right);
        }
        // find next node to visit: 
        //  case 1): if left child not null, then visit left child
        //  case 2): if left child is null, then visit right child
        node = node.left;
        if (node.left == null && !stack.isEmpty()) {
            node = stack.pop();
        }    
    }
    ```