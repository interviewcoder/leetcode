#### [099] Recover binary search tree

0. Solution 0: brutal force -- O(N) space
   
    1. convert tree to list using in-order traversal
    2. find `first` and `second` nodes: 
        - `first` is the **former** one in first  `former` > `latter` pair
        - `second` is the **latter** one in `last` `former` > `latter` pair

    3. swap values of `first` and `second`

1. Solution I: in-order traversal -- O(lgN) space (due to recursive call)
    
    Try to implement the abobe logic in in-order traversal,  to do that, we need know `previous` node before current visiting node

2. Solution I with pruning:

    ```java
        if (second != null && cur.val > first.val) {
            return;
        }
        foo(root.right);
    ```
    
    1) e.g. 1, 3, 2, 4, || 5, 6, 7, 8 ==> 1, 2, 3, 4, 5, 6, 7, 8

    2) e.g. 1, 5, 3, 4, 2, 6,||  7, 8  => 1, 2, 3, 4, 5, 6, 7, 8


2. Solution II: Morris Traversal  -- O(1) space