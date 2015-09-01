### [124] Binary Tree Maximum Path Sum

    //               5
    //            /     \
    //           4       8
    //          /       / \
    //         11      23  14
    //        /  \  
    //       7    2
    //              \
    //               8

```java
    // return the max path sum that starts from root node
    // and update global max at the same time with has root as lowest common ancestor
    int foo(TreeNode root):
    
    e.g. TreeNode root = new TreeNode(5)
    
    1) foo(root.left) => return = 35   |  global = 35
    //               *
    //            /     \
    //           4       *
    //          /       / \
    //         11      *   *
    //        /  \  
    //       *    2
    //              \
    //               8
    
    2) foo(root.right) => return = 31 | global = 45
    //               *
    //            /     \
    //           *       8
    //          /       / \
    //         *      23   *
    //        /  \  
    //       *    *
    //              \
    //               *

    3.1) So for root(5), the max path that has root as lowest node 
         is 31 + 35 + 5 = 71 => global = 71
    //               5
    //            /     \
    //           4       8
    //          /       / \
    //         11      23  *
    //        /  \  
    //       *    2
    //              \
    //               8
    
    3.2) for root(5), the max path that `starts` from root is 5 + 35 = 40 => return 40
    //               5
    //            /     \
    //           4       *
    //          /       / \
    //         11      *   *
    //        /  \  
    //       *    2
    //              \
    //               8
    
```

