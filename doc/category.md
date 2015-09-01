#### Category
| Type         | # | Description |
| ---------------------: |:---:| ------------|
|-------------------------------- | ----------------- | ------------------------------------------------- |
| **`Monotonic Stack/Queue`** | | keep indices of numbers which are in ascending/descending order |
| descending deque | 239 | Sliding Window Maximum |
| ascending stack  | 084 | Largest Rectangle In Histogram |
|-------------------------------- | ----------------- | ------------------------------------------------- |
| **`Trie`** | | *1 dict + input `strings` contains only a-z* |
| | 208 | Implemen Trie (Prefix Tree)
| | 211 | Add and Search Word - Data structure design |
| | 212 | Word Search II |
| **`Tree::Traversal`** | | DFS / BFS for level order |
| Traversal | 144 | Binary Tree Preorder Traversal |
| Traversal | 094 | Binary Tree Inorder Traversal |
| Traversal | 145 | Bianry Tree Postorder Traversal |
| level traversal | 102 | Binary Tree Level Order Traversal |
| level traversal | 107 | Binary Tree Level Order Traversal II |
| level traversal | 103 | Binary Tree Zigzag Level Order Traversal |
| **`Tree::divide and conquer`** | | |
| *`post`*-order | 124 | Binary Tree Maximum Path Sum |
| *`post`*-order | 144 | Maximum Depth Of Binary Tree |
|-------------------------------- | ----------------- | ------------------------------------------------- |
| **`BST::order matters`** | | |
| inorder + prev | 098 | Validate Binary Search Tree |
| inorder + prev | 099 | Recover Binary Search Tree |
| inorder + prune | Lint | [Search Range In Binary Search Tree](https://github.com/interviewcoder/lintcode/blob/master/03_binarytree%26divideconquer/_02_SearchRangeInBinarySearchTree/Solution.java) |
|-------------------------------- | ----------------- | ------------------------------------------------- |
| **`Largescale Data stream`** | | |
| max-heap + min-heap | s07 | Median of Data Stream |
|-------------------------------- | ----------------- | ------------------------------------------------- |
| **`Backtracking::array`** |  |  |
| pure  | 078 | Subsets |
| select + skip + pure | 090 | SubsetsII: skip duplicates |
| select +  pure | 046 | Permutation |
| select + skip (with set) + pure | 047 | PermuationII: template + select qualified + skip duplicates |
| prune + select + pure | 039 | Combination Sum: template + select qualified + prune sibilings |
| prune + select + skip + pure | 040 | Combination SumII: template + select qualified + skip duplicates + prune siblings |
| **`Backtracking::matrix`** | | |
| | 079 | Word Search |
| | 212 | Word Search II |
|-------------------------------- | ----------------- | ------------------------------------------------- |
| **`Dynamic Programming`** | | |
| 1 sequence : boolean(*) | 139 | Word Break |
| 1 sequence : `max`/min(*) | 198 | House Robber |
| 1 sequence : `max`/min(*) | 213 | House Robber II |
| 1 sequence : `max`/min(*) | 053 | Maximum Subarray |
| 1 sequence : `max`/min(*) | 153 | Maximum Product Subarray |
| 1 sequence : max/`min`(*) | 132 | Palindrome Partitioning II |
| 1 sequence : `max`/min(*) | 032 | Longest Valid Parentheses |
| 1 sequence : `max`/min(*) | 121 | Best Time to Buy and Sell Stock |
| 1 sequence : `max`/min(*) | 123 | Best Time to Buy and Sell Stock III |
| 1 sequence : count(*) | 091 | Decode Ways |
| 1 sequence : all(*) | 140 | Word Break II: dp + backtracking |
| 2 sequences : boolean(*) | 044 | Wildcard Matching |
| 2 sequences : boolean(*) | 087 | Scramble String |
| 2 sequences : boolean(*) | 010 | Regular Expression Matching |
| 2 sequences : boolean(*) | 097 | Interleaving String |
| 2 sequences : max/`min`(*) | 072 | Edit Distance |
| 2 sequences : count(*) | 115 | Distinct Subsequences |
| Matrix : max/`min`(*) | 120 | Triangle |
| Matrix : max/`min`(*) | 064 | Minimum Path Sum |
| Matrix : `max`/min(*) | 085 | Maximal Rectangle |
| Matrix : max/`min`(*) | 174 | Dungeon Game |
| Matrix : count(*) | 062 | Unique Paths |
| Matrix : count(*) | 063 | Unique Paths II |
|  ** : count(*) | 096 | Unique Binary Trees |
|  ** : count(*) | 070 | Climbing Stairs |
|  ** : all(*) | 095 | Unique Binary Trees II |
|-------------------------------- | ----------------- | ------------------------------------------------- |
| Contiguous Subarray sum |     |             |
| | 209 | Minimum Size Subarray Sum | Two pointers to keep a sliding window |
| Both BFS and DFS can do |     |             |
|                         | 207 | Course Schedule |
| | 103 | Clone Graph |
| pair matching using stack | | |
| | 020 | Valid Parentheses | using stack to match parenthesis pair |
| | 071 | Simplify Path | using stack to counteract the latest path for ".." |
| |     | [Find Next Greater/Smaller Element]() | |
| [Subarray/sublist] Window-two-pointer |     | left-right pointers to keep a window to solve `sub` problem  |
| | 003 | Longest Substring Without Repeating Characters |
| | 076 | Minimum Window Substring |
| | interview.TwoPointers | [MAXONE](http://www.interviewbit.com/courses/programming/topics/two-pointers/problems/maxone/) |