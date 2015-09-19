### [236] lowest common ancestor in binary tree

Divide and Conquer + post-order traversal

0. foo(root, left, right) => return whatever target node we can find in this subtree

1. if (root == left || root == right) => return root;

2. foo(root.left, left, right)  & foo(root.right, left, right)
    ```java
    TreeNode left = foo(root.left, left, right);
    TreeNode right = foo(root.right, left, right);
    if (left != null && right != null) => return root;
    if (left != null) => return left;
    else => return right;
    ```