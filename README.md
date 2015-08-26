#### Solutions, unit tests, and code skeletons for problems from [Leetcode OJ](https://leetcode.com/problemset/algorithms/).  (in progress)

[![Build Status](https://travis-ci.org/interviewcoder/leetcode.svg?branch=master)](https://travis-ci.org/interviewcoder/leetcode)
[![Coverage Status](https://coveralls.io/repos/interviewcoder/leetcode/badge.svg?branch=master&service=github)](https://coveralls.io/github/interviewcoder/leetcode?branch=master)

```plain
  root
    |--- doc
    |     |-- category.md   // category for problems in leetcode
    |     |-- problems.tsv  // searchable tsv file listing problems from leetcode
    |     |-- road.md       // general things I learnt through the process
    |--- lib
    |     |-- *.jar         // jar file referenced in this project
    |--- src   // solutions for problems
    |     |-- _001_TwoSum
    |     |         |-- Practice.java    // code skeleton
    |     |         |-- Solution.java
    |     |         |-- Solution*.java   // other solutions for this problem
    |     |-- ......
    |--- test  // unit tests
    |     |-- _001_TwoSum
    |     |         |-- PracticeTest.java 
    |     |         |-- SolutionTest.java
    |     |         |-- Solution*Test.java
    |     |-- ......

```

* Discussions and code reviews are more than welcome.
* `Solution.java` provides OJ-accepted solution.
* `Practice.java` provides code skeleton for each problem
* `SolutionTest.java` and `PracticeTest.java` provides basic unit tests to verify your solution.

P.S.:
- Please use Java 8 to compile and run
- Many solutions are from online sources, like Leetcode OJ discussion, coders' blogs, etc.
- Solution that passed unit tests does not guarantee to pass Leetcode OJ.

| # | Problem | Difficulty | Tags | Note |
| :---: | ---- | ---- | ---- | ----- |
| 001 | [Two Sum](https://github.com/interviewcoder/leetcode/blob/master/src/_001_TwoSum/Solution.java) | Medium | `Array` `Hash Table`  |  | 
| 002 | [Add Two Numbers](https://github.com/interviewcoder/leetcode/blob/master/src/_002_AddTwoNumbers/Solution.java) | Medium | `Linked List` `Math`  |  | 
| 003 | [Longest Substring Without Repeating Characters](https://github.com/interviewcoder/leetcode/blob/master/src/_003_LongestSubstringWithoutRepeatingCharacters/Solution.java)  | Medium | `Hash Table` `Two Pointers` `String`  | [**substring**] hashing + two pointers -> O(N) | 
| 004 | [Median of Two Sorted Arrays](https://github.com/interviewcoder/leetcode/blob/master/src/_004_MedianOfTwoSortedArrays/Solution.java)  | Hard | `Divide and Conquer` `Array` `Binary Search`  |  | 
| 005 | [Longest Palindromic Substring](https://github.com/interviewcoder/leetcode/blob/master/src/_005_LongestPalindromicSubstring/Solution.java) | Medium | `String`  | span palindrome from center towards left and right | 
| 006 | [ZigZag Conversion](https://github.com/interviewcoder/leetcode/blob/master/src/_006_ZigZagConversion/Solution.java)  | Easy | `String`  |  | 
| 007 | [Reverse Integer](https://github.com/interviewcoder/leetcode/blob/master/src/_007_ReverseInteger/Solution.java) | Easy | `Math`  | How to monitor Stack Overflow | 
| 008 | String to Integer (atoi) | Easy | `Math` `String`  |  | 
| 009 | [Palindrome Number](https://github.com/interviewcoder/leetcode/blob/master/src/_009_PalindromeNumber/Solution.java) | Easy | `Math`  | 1) count digits; 2) get digit from number's front/back; 3) to avoid StackOverflow, only reverse half part of number  | 
| 010 | [Regular Expression Matching](https://github.com/interviewcoder/leetcode/blob/master/src/_010_RegularExpressionMatching/Solution.java) | Hard | `Dynamic Programming` `Backtracking` `String`  | finite state machine! | 
| 011 | [Container With Most Water](https://github.com/interviewcoder/leetcode/blob/master/src/_011_ContainerWithMostWater/Solution.java)  | Medium | `Array` `Two Pointers`  | [**substring**] head-tail pointers | 
| 012 | [Integer to Roman](https://github.com/interviewcoder/leetcode/blob/master/src/_012_IntegerToRoman/Solution.java) | Medium | `Math` `String`  |  | 
| 013 | [Roman to Integer](https://github.com/interviewcoder/leetcode/blob/master/src/_013_RomanToInteger/Solution.java) | Easy | `Math` `String`  |  | 
| 014 | [Longest Common Prefix](https://github.com/interviewcoder/leetcode/blob/master/src/_014_LongestCommonPrefix/Solution.java) | Easy | `String`  |  | 
| 015 | [3Sum](https://github.com/interviewcoder/leetcode/blob/master/src/_015_3Sum/Solution.java) | Medium | `Array` `Two Pointers`  |  | 
| 016 | [3Sum Closest](https://github.com/interviewcoder/leetcode/blob/master/src/_016_3SumClosest/Solution.java) | Medium | `Array` `Two Pointers`  |  | 
| 017 | [Letter Combinations of a Phone Number](https://github.com/interviewcoder/leetcode/blob/master/src/_017_LetterCombinationsOfAPhoneNumber/Solution.java) | Medium | `Backtracking` `String`  | `BT` template | 
| 018 | [4Sum](https://github.com/interviewcoder/leetcode/blob/master/src/_018_4Sum/Solution.java) | Medium | `Array` `Hash Table` `Two Pointers`  |  | 
| 019 | [Remove Nth Node From End of List](https://github.com/interviewcoder/leetcode/blob/master/src/_019_RemoveNthNodeFromEndOfList/Solution.java) | Easy | `Linked List` `Two Pointers`  | fast-slow two pointers on Linked List | 
| 020 | [Valid Parentheses](https://github.com/interviewcoder/leetcode/blob/master/src/_020_ValidParentheses/Solution.java) | Easy | `Stack` `String`  | stack basic, corner case | 
| 021 | [Merge Two Sorted Lists](https://github.com/interviewcoder/leetcode/blob/master/src/_021_MergeTwoSortedLists/Solution.java) | Easy | `Linked List`  |  | 
| 022 | [Generate Parentheses](https://github.com/interviewcoder/leetcode/blob/master/src/_022_GenerateParentheses/Solution.java) | Medium | `Backtracking` `String`  | `BT` template | 
| 023 | Merge k Sorted Lists | Hard | `Divide and Conquer` `Linked List` `Heap`  |  | 
| 024 | [Swap Nodes in Pairs](https://github.com/interviewcoder/leetcode/blob/master/src/_024_SwapNodesInPairs/Solution.java) | Medium | `Linked List`  |  | 
| 025 | Reverse Nodes in k-Group | Hard | `Linked List`  |  | 
| 026 | [Remove Duplicates from Sorted Array](https://github.com/interviewcoder/leetcode/blob/master/src/_026_RemoveDuplicatesFromSortedArray/Solution.java) | Easy | `Array` `Two Pointers`  |  partition techinque on array | 
| 027 | [Remove Element](https://github.com/interviewcoder/leetcode/blob/master/src/_027_RemoveElement/Solution.java) | Easy | `Array` `Two Pointers`  |  | 
| 028 | [Implement strStr()](https://github.com/interviewcoder/leetcode/blob/master/src/_028_ImplementStrStr/Solution.java) | Easy | `Two Pointers` `String`  |  | 
| 029 | [Divide Two Integers](https://github.com/interviewcoder/leetcode/blob/master/src/_029_DivideTwoIntegers/Solution.java) | Medium | `Math` `Binary Search`  | `!` | 
| 030 | [Substring with Concatenation of All Words](https://github.com/interviewcoder/leetcode/blob/master/src/_030_SubstringWithConcatenationOfAllWords/Solution.java) | Hard | `Hash Table` `Two Pointers` `String`  |  | 
| 031 | [Next Permutation](https://github.com/interviewcoder/leetcode/blob/master/src/_031_NextPermutation/Solution.java) | Medium | `Array`  |  | 
| 032 | [Longest Valid Parentheses](https://github.com/interviewcoder/leetcode/blob/master/src/_032_LongestValidParentheses/Solution.java) | Hard | `Dynamic Programming` `String`  | `DP` | 
| 033 | [Search in Rotated Sorted Array](https://github.com/interviewcoder/leetcode/blob/master/src/_033_SearchInRotatedSortedArray/Solution.java) | Hard | `Array` `Binary Search`  |  | 
| 034 | [Search for a Range](https://github.com/interviewcoder/leetcode/blob/master/src/_034_SearchForARange/Solution.java) | Medium | `Array` `Binary Search`  | `!` one binary search to find start position, and another one find ending position | 
| 035 | [Search Insert Position](https://github.com/interviewcoder/leetcode/blob/master/src/_035_SearchInsertPosition/Solution.java) | Medium | `Array` `Binary Search`  | standard binary search with minor modification | 
| 036 | [Valid Sudoku](https://github.com/interviewcoder/leetcode/blob/master/src/_036_ValidSudoku/Solution.java) | Easy | `Hash Table`  |  | 
| 037 | [Sudoku Solver](https://github.com/interviewcoder/leetcode/blob/master/src/_037_SudokuSolver/Solution.java) | Hard | `Backtracking` `Hash Table`  |  | 
| 038 | [Count and Say](https://github.com/interviewcoder/leetcode/blob/master/src/_038_CountAndSay/Solution.java) | Easy | `String`  |  | 
| 039 | [Combination Sum](https://github.com/interviewcoder/leetcode/blob/master/src/_039_CombinationSum/Solution.java) | Medium | `Array` `Backtracking`  | `BT` template + prune siblings | 
| 040 | [Combination Sum II](https://github.com/interviewcoder/leetcode/blob/master/src/_040_CombinationSumII/Solution.java) | Medium | `Array` `Backtracking`  | `BT` template + prune siblings + skip duplicate | 
| 041 | [First Missing Positive](https://github.com/interviewcoder/leetcode/blob/master/src/_041_FirstMissingPositive/Solution.java) | Hard | `Array`  | swap-until technique | 
| 042 | [Trapping Rain Water](https://github.com/interviewcoder/leetcode/blob/master/src/_042_TrappingRainWater/Solution.java) | Hard | `Array` `Stack` `Two Pointers`  | `!!` | 
| 043 | [Multiply Strings](https://github.com/interviewcoder/leetcode/blob/master/src/_043_MultiplyStrings/Solution.java) | Medium | `Math` `String`  | `!` simulate multiplication | 
| 044 | [Wildcard Matching](https://github.com/interviewcoder/leetcode/blob/master/src/_044_WildcardMatching/Solution.java) | Hard | `Dynamic Programming` `Backtracking` `Greedy` `String`  |  | 
| 045 | Jump Game II | Hard | `Array` `Greedy`  |  | 
| 046 | [Permutations](https://github.com/interviewcoder/leetcode/blob/master/src/_046_Permutations/Solution.java) | Medium | `Backtracking`  | backtrack template + select to add | 
| 047 | [Permutations II](https://github.com/interviewcoder/leetcode/blob/master/src/_047_PermutationsII/Solution.java) | Hard | `Backtracking`  | backtrack template + select to add + skip duplicate using set | 
| 048 | [Rotate Image](https://github.com/interviewcoder/leetcode/blob/master/src/_048_RotateImage/Solution.java) | Medium | `Array`  |  | 
| 049 | [Group Anagrams](https://github.com/interviewcoder/leetcode/blob/master/src/_049_GroupAnagrams/Solution.java) | Medium | `Hash Table` `String`  | `!!` | 
| 050 | [Pow(x, n)](https://github.com/interviewcoder/leetcode/blob/master/src/_050_PowxN/Solution.java) | Medium | `Math` `Binary Search`  |  | 
| 051 | [N-Queens](https://github.com/interviewcoder/leetcode/blob/master/src/_051_NQueens/Solution.java) | Hard | `Backtracking`  |  | 
| 052 | [N-Queens II](https://github.com/interviewcoder/leetcode/blob/master/src/_052_NQueensII/Solution.java) | Hard | `Backtracking`  |  | 
| 053 | [Maximum Subarray](https://github.com/interviewcoder/leetcode/blob/master/src/_053_MaximumSubarray/Solution.java) | Medium | `Divide and Conquer` `Array` `Dynamic Programming`  |  | 
| 054 | [Spiral Matrix](https://github.com/interviewcoder/leetcode/blob/master/src/_054_SpiralMatrix/Solution.java) | Medium | `Array`  |  | 
| 055 | [Jump Game](https://github.com/interviewcoder/leetcode/blob/master/src/_055_JumpGame/Solution.java) | Medium | `Array` `Greedy`  |  | 
| 056 | [Merge Intervals](https://github.com/interviewcoder/leetcode/blob/master/src/_056_MergeIntervals/Solution.java) | Hard | `Array` `Sort`  | how to decide the boundary of merged interval | 
| 057 | [Insert Interval](https://github.com/interviewcoder/leetcode/blob/master/src/_057_InsertInterval/Solution.java) | Hard | `Array` `Sort`  | `!` enlarge to merge interval | 
| 058 | [Length of Last Word](https://github.com/interviewcoder/leetcode/blob/master/src/_058_LengthOfLastWord/Solution.java) | Easy | `String`  |  | 
| 059 | [Spiral Matrix II](https://github.com/interviewcoder/leetcode/blob/master/src/_059_SpiralMatrixII/Solution.java) | Medium | `Array`  |  | 
| 060 | [Permutation Sequence](https://github.com/interviewcoder/leetcode/blob/master/src/_060_PermutationSequence/Solution.java) | Medium | `Backtracking` `Math`  |  | 
| 061 | [Rotate List](https://github.com/interviewcoder/leetcode/blob/master/src/_061_RotateList/Solution.java) | Medium | `Linked List` `Two Pointers`  | fast-slow pointers; [189] Rotate Array | 
| 062 | [Unique Paths](https://github.com/interviewcoder/leetcode/blob/master/src/_062_UniquePaths/Solution.java) | Medium | `Array` `Dynamic Programming`  |  | 
| 063 | [Unique Paths II](https://github.com/interviewcoder/leetcode/blob/master/src/_063_UniquePathsII/Solution.java) | Medium | `Array` `Dynamic Programming`  |  | 
| 064 | [Minimum Path Sum](https://github.com/interviewcoder/leetcode/blob/master/src/_064_MinimumPathSum/Solution.java) | Medium | `Array` `Dynamic Programming`  |  | 
| 065 | [Valid Number](https://github.com/interviewcoder/leetcode/blob/master/src/_065_ValidNumber/Solution.java) | Hard | `Math` `String`  |  | 
| 066 | [Plus One](https://github.com/interviewcoder/leetcode/blob/master/src/_066_PlusOne/Solution.java) | Easy | `Array` `Math`  |  | 
| 067 | [Add Binary](https://github.com/interviewcoder/leetcode/blob/master/src/_067_AddBinary/Solution.java) | Easy | `Math` `String`  |  add binary numbers  | 
| 068 | [Text Justification](https://github.com/interviewcoder/leetcode/blob/master/src/_068_TextJustification/Solution.java) | Hard | `String`  | `!` very careful string operations | 
| 069 | [Sqrt(x)](https://github.com/interviewcoder/leetcode/blob/master/src/_069_Sqrtx/Solution.java) | Medium | `Math` `Binary Search`  | `!`binary search along y-axle  | 
| 070 | [Climbing Stairs](https://github.com/interviewcoder/leetcode/blob/master/src/_070_ClimbingStairs/Solution.java) | Easy | `Dynamic Programming`  |  | 
| 071 | [Simplify Path](https://github.com/interviewcoder/leetcode/blob/master/src/_071_SimplifyPath/Solution.java) | Medium | `Stack` `String`  |  | 
| 072 | [Edit Distance](https://github.com/interviewcoder/leetcode/blob/master/src/_072_EditDistance/Solution.java) | Hard | `Dynamic Programming` `String`  |  | 
| 073 | [Set Matrix Zeroes](https://github.com/interviewcoder/leetcode/blob/master/src/_073_SetMatrixZeroes/Solution.java) | Medium | `Array`  |  | 
| 074 | [Search a 2D Matrix](https://github.com/interviewcoder/leetcode/blob/master/src/_074_SearchA2DMatrix/Solution.java) | Medium | `Array` `Binary Search`  | 2D coordidates --> 1D index | 
| 075 | [Sort Colors](https://github.com/interviewcoder/leetcode/blob/master/src/_075_SortColors/Solution.java) | Medium | `Array` `Two Pointers` `Sort`  |  | 
| 076 | [Minimum Window Substring](https://github.com/interviewcoder/leetcode/blob/master/src/_076_MinimumWindowSubstring/Solution.java) | Hard | `Hash Table` `Two Pointers` `String`  | `!`**[substring/sublist]** hashing + two pointers -> O(N) | 
| 077 | [Combinations](https://github.com/interviewcoder/leetcode/blob/master/src/_077_Combinations/Solution.java) | Medium | `Backtracking`  |  | 
| 078 | [Subsets](https://github.com/interviewcoder/leetcode/blob/master/src/_078_Subsets/Solution.java) | Medium | `Array` `Backtracking` `Bit Manipulation`  | backtrack template | 
| 079 | [Word Search](https://github.com/interviewcoder/leetcode/blob/master/src/_079_WordSearch/Solution.java) | Medium | `Array` `Backtracking`  |  | 
| 080 | [Remove Duplicates from Sorted Array II](https://github.com/interviewcoder/leetcode/blob/master/src/_080_RemoveDuplicatesFromSortedArrayII/Solution.java) | Medium | `Array` `Two Pointers`  |  | 
| 081 | [Search in Rotated Sorted Array II](https://github.com/interviewcoder/leetcode/blob/master/src/_081_SearchInRotatedSortedArrayII/Solution.java) | Medium | `Array` `Binary Search`  |  | 
| 082 | [Remove Duplicates from Sorted List II](https://github.com/interviewcoder/leetcode/blob/master/src/_082_RemoveDuplicatesFromSortedListII/Solution.java) | Medium | `Linked List`  |  | 
| 083 | [Remove Duplicates from Sorted List](https://github.com/interviewcoder/leetcode/blob/master/src/_083_RemoveDuplicatesFromSortedList/Solution.java) | Easy | `Linked List`  |  | 
| 084 | [Largest Rectangle in Histogram](https://github.com/interviewcoder/leetcode/blob/master/src/_084_LargestRectangleInHistogram/Solution.java) | Hard | `Array` `Stack`  |  | 
| 085 | [Maximal Rectangle](https://github.com/interviewcoder/leetcode/blob/master/src/_085_MaximalRectangle/Solution.java) | Hard | `Array` `Hash Table` `Stack` `Dynamic Programming`  |  | 
| 086 | [Partition List](https://github.com/interviewcoder/leetcode/blob/master/src/_086_PartitionList/Solution.java) | Medium | `Linked List` `Two Pointers`  |  | 
| 087 | [Scramble String](https://github.com/interviewcoder/leetcode/blob/master/src/_087_ScrambleString/Solution.java) | Hard | `Dynamic Programming` `String`  |  | 
| 088 | [Merge Sorted Array](https://github.com/interviewcoder/leetcode/blob/master/src/_088_MergeSortedArray/Solution.java) | Easy | `Array` `Two Pointers`  | in-place merging -> from end to begin; two pointers on two lists | 
| 089 | [Gray Code](https://github.com/interviewcoder/leetcode/blob/master/src/_089_GrayCode/Solution.java) | Medium | `Backtracking`  |  | 
| 090 | [Subsets II](https://github.com/interviewcoder/leetcode/blob/master/src/_090_SubsetsII/Solution.java) | Medium | `Array` `Backtracking`  | backtrack template + skip duplicate | 
| 091 | [Decode Ways](https://github.com/interviewcoder/leetcode/blob/master/src/_091_DecodeWays/Solution.java) | Medium | `Dynamic Programming` `String`  |  | 
| 092 | [Reverse Linked List II](https://github.com/interviewcoder/leetcode/blob/master/src/_092_ReverseLinkedListII/Solution.java) | Medium | `Linked List`  |  | 
| 093 | [Restore IP Addresses](https://github.com/interviewcoder/leetcode/blob/master/src/_093_RestoreIPAddresses/Solution.java) | Medium | `Backtracking` `String`  |  | 
| 094 | [Binary Tree Inorder Traversal](https://github.com/interviewcoder/leetcode/blob/master/src/_094_BinaryTreeInorderTraversal/Solution.java) | Medium | `Tree` `Hash Table` `Stack`  |  | 
| 095 | [Unique Binary Search Trees II](https://github.com/interviewcoder/leetcode/blob/master/src/_095_UniqueBinarySearchTreesII/Solution.java) | Medium | `Tree` `Dynamic Programming`  |  | 
| 096 | [Unique Binary Search Trees](https://github.com/interviewcoder/leetcode/blob/master/src/_096_UniqueBinarySearchTrees/Solution.java) | Medium | `Tree` `Dynamic Programming`  |  | 
| 097 | [Interleaving String](https://github.com/interviewcoder/leetcode/blob/master/src/_097_InterleavingString/Solution.java) | Hard | `Dynamic Programming` `String`  |  | 
| 098 | [Validate Binary Search Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_098_ValidateBinarySearchTree/Solution.java) | Medium | `Tree` `Depth-first Search`  |  | 
| 099 | [Recover Binary Search Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_099_RecoverBinarySearchTree/Solution.java) | Hard | `Tree` `Depth-first Search`  |  | 
| 100 | [Same Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_100_SameTree/Solution.java) | Easy | `Tree` `Depth-first Search`  |  | 
| 101 | [Symmetric Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_101_SymmetricTree/Solution.java) | Easy | `Tree` `Depth-first Search`  |  | 
| 102 | [Binary Tree Level Order Traversal](https://github.com/interviewcoder/leetcode/blob/master/src/_102_BinaryTreeLevelOrderTraversal/Solution.java) | Easy | `Tree` `Breadth-first Search`  |  | 
| 103 | [Binary Tree Zigzag Level Order Traversal](https://github.com/interviewcoder/leetcode/blob/master/src/_103_BinaryTreeZigzagLevelOrderTraversal/Solution.java) | Medium | `Tree` `Breadth-first Search` `Stack`  |  | 
| 104 | [Maximum Depth of Binary Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_104_MaximumDepthOfBinaryTree/Solution.java) | Easy | `Tree` `Depth-first Search`  |  | 
| 105 | [Construct Binary Tree from Preorder and Inorder Traversal](https://github.com/interviewcoder/leetcode/blob/master/src/_105_ConstructBinaryTreeFromPreorderAndInorderTraversal/Solution.java) | Medium | `Tree` `Array` `Depth-first Search`  |  | 
| 106 | [Construct Binary Tree from Inorder and Postorder Traversal](https://github.com/interviewcoder/leetcode/blob/master/src/_106_ConstructBinaryTreeFromInorderAndPostorderTraversal/Solution.java) | Medium | `Tree` `Array` `Depth-first Search`  |  | 
| 107 | [Binary Tree Level Order Traversal II](https://github.com/interviewcoder/leetcode/blob/master/src/_107_BinaryTreeLevelOrderTraversalII/Solution.java) | Easy | `Tree` `Breadth-first Search`  |  | 
| 108 | [Convert Sorted Array to Binary Search Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_108_ConvertSortedArrayToBinarySearchTree/Solution.java) | Medium | `Tree` `Depth-first Search`  |  | 
| 109 | [Convert Sorted List to Binary Search Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_109_ConvertSortedListToBinarySearchTree/Solution.java) | Medium | `Depth-first Search` `Linked List`  |  | 
| 110 | [Balanced Binary Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_110_BalancedBinaryTree/Solution.java) | Easy | `Tree` `Depth-first Search`  |  | 
| 111 | [Minimum Depth of Binary Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_111_MinimumDepthOfBinaryTree/Solution.java) | Easy | `Tree` `Depth-first Search` `Breadth-first Search`  |  | 
| 112 | [Path Sum](https://github.com/interviewcoder/leetcode/blob/master/src/_112_PathSum/Solution.java) | Easy | `Tree` `Depth-first Search`  |  | 
| 113 | [Path Sum II](https://github.com/interviewcoder/leetcode/blob/master/src/_113_PathSumII/Solution.java) | Medium | `Tree` `Depth-first Search`  |  | 
| 114 | [Flatten Binary Tree to Linked List](https://github.com/interviewcoder/leetcode/blob/master/src/_114_FlattenBinaryTreeToLinkedList/Solution.java) | Medium | `Tree` `Depth-first Search`  |  | 
| 115 | [Distinct Subsequences](https://github.com/interviewcoder/leetcode/blob/master/src/_115_DistinctSubsequences/Solution.java) | Hard | `Dynamic Programming` `String`  |  | 
| 116 | [Populating Next Right Pointers in Each Node](https://github.com/interviewcoder/leetcode/blob/master/src/_116_PopulatingNextRightPointersInEachNode/Solution.java) | Medium | `Tree` `Depth-first Search`  |  | 
| 117 | [Populating Next Right Pointers in Each Node II](https://github.com/interviewcoder/leetcode/blob/master/src/_117_PopulatingNextRightPointersInEachNodeII/Solution.java) | Hard | `Tree` `Depth-first Search`  |  | 
| 118 | [Pascal's Triangle](https://github.com/interviewcoder/leetcode/blob/master/src/_118_PascalsTriangle/Solution.java) | Easy | `Array`  |  | 
| 119 | [Pascal's Triangle II](https://github.com/interviewcoder/leetcode/blob/master/src/_119_PascalsTriangleII/Solution.java) | Easy | `Array`  |  | 
| 120 | [Triangle](https://github.com/interviewcoder/leetcode/blob/master/src/_120_Triangle/Solution.java) | Medium | `Array` `Dynamic Programming`  |  | 
| 121 | [Best Time to Buy and Sell Stock](https://github.com/interviewcoder/leetcode/blob/master/src/_121_BestTimeToBuyAndSellStock/Solution.java) | Medium | `Array` `Dynamic Programming`  |  | 
| 122 | [Best Time to Buy and Sell Stock II](https://github.com/interviewcoder/leetcode/blob/master/src/_122_BestTimeToBuyAndSellStockII/Solution.java) | Medium | `Array` `Greedy`  |  | 
| 123 | [Best Time to Buy and Sell Stock III](https://github.com/interviewcoder/leetcode/blob/master/src/_123_BestTimeToBuyAndSellStockIII/Solution.java) | Hard | `Array` `Dynamic Programming`  |  | 
| 124 | [Binary Tree Maximum Path Sum](https://github.com/interviewcoder/leetcode/blob/master/src/_124_BinaryTreeMaximumPathSum/Solution.java) | Hard | `Tree` `Depth-first Search`  |  | 
| 125 | [Valid Palindrome](https://github.com/interviewcoder/leetcode/blob/master/src/_125_ValidPalindrome/Solution.java) | Easy | `Two Pointers` `String`  |  | 
| 126 | [Word Ladder II](https://github.com/interviewcoder/leetcode/blob/master/src/_126_WordLadderII/Solution.java) | Hard | `Array` `Backtracking` `Breadth-first Search` `String`  |  | 
| 127 | [Word Ladder](https://github.com/interviewcoder/leetcode/blob/master/src/_127_WordLadder/Solution.java) | Medium | `Breadth-first Search`  |  | 
| 128 | [Longest Consecutive Sequence](https://github.com/interviewcoder/leetcode/blob/master/src/_128_LongestConsecutiveSequence/Solution.java) | Hard | `Array`  |  | 
| 129 | [Sum Root to Leaf Numbers](https://github.com/interviewcoder/leetcode/blob/master/src/_129_SumRootToLeafNumbers/Solution.java) | Medium | `Tree` `Depth-first Search`  |  | 
| 130 | [Surrounded Regions](https://github.com/interviewcoder/leetcode/blob/master/src/_130_SurroundedRegions/Solution.java) | Medium | `Breadth-first Search`  |  | 
| 131 | [Palindrome Partitioning](https://github.com/interviewcoder/leetcode/blob/master/src/_131_PalindromePartitioning/Solution.java) | Medium | `Backtracking`  |  | 
| 132 | [Palindrome Partitioning II](https://github.com/interviewcoder/leetcode/blob/master/src/_132_PalindromePartitioningII/Solution.java) | Hard | `Dynamic Programming`  |  | 
| 133 | [Clone Graph](https://github.com/interviewcoder/leetcode/blob/master/src/_133_CloneGraph/Solution.java) | Medium | `Depth-first Search` `Breadth-first Search` `Graph`  |  | 
| 134 | Gas Station | Medium | `Greedy`  |  | 
| 135 | [Candy](https://github.com/interviewcoder/leetcode/blob/master/src/_135_Candy/Solution.java) | Hard | `Greedy`  |  | 
| 136 | [Single Number](https://github.com/interviewcoder/leetcode/blob/master/src/_136_SingleNumber/Solution.java) | Medium | `Hash Table` `Bit Manipulation`  |  | 
| 137 | Single Number II | Medium | `Bit Manipulation`  |  | 
| 138 | [Copy List with Random Pointer](https://github.com/interviewcoder/leetcode/blob/master/src/_138_CopyListWithRandomPointer/Solution.java) | Hard | `Hash Table` `Linked List`  |  | 
| 139 | [Word Break](https://github.com/interviewcoder/leetcode/blob/master/src/_139_WordBreak/Solution.java) | Medium | `Dynamic Programming`  |  | 
| 140 | [Word Break II](https://github.com/interviewcoder/leetcode/blob/master/src/_140_WordBreakII/Solution.java) | Hard | `Dynamic Programming` `Backtracking`  |  | 
| 141 | [Linked List Cycle](https://github.com/interviewcoder/leetcode/blob/master/src/_141_LinkedListCycle/Solution.java) | Medium | `Linked List` `Two Pointers`  |  | 
| 142 | [Linked List Cycle II](https://github.com/interviewcoder/leetcode/blob/master/src/_142_LinkedListCycleII/Solution.java) | Medium | `Linked List` `Two Pointers`  |  | 
| 143 | [Reorder List](https://github.com/interviewcoder/leetcode/blob/master/src/_143_ReorderList/Solution.java) | Medium | `Linked List`  |  | 
| 144 | [Binary Tree Preorder Traversal](https://github.com/interviewcoder/leetcode/blob/master/src/_144_BinaryTreePreorderTraversal/Solution.java) | Medium | `Tree` `Stack`  |  | 
| 145 | [Binary Tree Postorder Traversal](https://github.com/interviewcoder/leetcode/blob/master/src/_145_BinaryTreePostorderTraversal/Solution.java) | Hard | `Tree` `Stack`  |  | 
| 146 | [LRU Cache](https://github.com/interviewcoder/leetcode/blob/master/src/_146_LRUCache/Solution.java) | Hard | `Data Structure`  |  | 
| 147 | [Insertion Sort List](https://github.com/interviewcoder/leetcode/blob/master/src/_147_InsertionSortList/Solution.java) | Medium | `Linked List` `Sort`  |  | 
| 148 | [Sort List](https://github.com/interviewcoder/leetcode/blob/master/src/_148_SortList/Solution.java)  | Medium | `Linked List` `Sort`  | `!` fast-slow to find middle + iterative reverse + merge sort | 
| 149 | [Max Points on a Line](https://github.com/interviewcoder/leetcode/blob/master/src/_149_MaxPointsOnALine/Solution.java) | Hard | `Hash Table` `Math`  |  | 
| 150 | [Evaluate Reverse Polish Notation](https://github.com/interviewcoder/leetcode/blob/master/src/_150_EvaluateReversePolishNotation/Solution.java) | Medium | `Stack`  |  | 
| 151 | [Reverse Words in a String](https://github.com/interviewcoder/leetcode/blob/master/src/_151_ReverseWordsInAString/Solution.java) | Medium | `String`  |  | 
| 152 | [Maximum Product Subarray](https://github.com/interviewcoder/leetcode/blob/master/src/_152_MaximumProductSubarray/Solution.java) | Medium | `Array` `Dynamic Programming`  |  | 
| 153 | [Find Minimum in Rotated Sorted Array](https://github.com/interviewcoder/leetcode/blob/master/src/_153_FindMinimumInRotatedSortedArray/Solution.java)  | Medium | `Array` `Binary Search`  |  | 
| 154 | [Find Minimum in Rotated Sorted Array II](https://github.com/interviewcoder/leetcode/blob/master/src/_154_FindMinimumInRotatedSortedArrayII/Solution.java)  | Hard | `Array` `Binary Search`  |  | 
| 155 | [Min Stack](https://github.com/interviewcoder/leetcode/blob/master/src/_155_MinStack/Solution.java) | Easy | `Stack` `Data Structure`  |  | 
| 160 | [Intersection of Two Linked Lists](https://github.com/interviewcoder/leetcode/blob/master/src/_160_IntersectionOfTwoLinkedLists/Solution.java)  | Easy | `Linked List`  | two pointers on two lists; combine long and short lists into one  | 
| 162 | [Find Peak Element](https://github.com/interviewcoder/leetcode/blob/master/src/_162_FindPeakElement/Solution.java)  | Medium | `Array` `Binary Search`  |  | 
| 164 | [Maximum Gap](https://github.com/interviewcoder/leetcode/blob/master/src/_164_MaximumGap/Solution.java) | Hard | `Sort`  |  | 
| 165 | [Compare Version Numbers](https://github.com/interviewcoder/leetcode/blob/master/src/_165_CompareVersionNumbers/Solution.java) | Easy | `String`  |  | 
| 166 | Fraction to Recurring Decimal | Medium | `Hash Table` `Math`  |  | 
| 168 | [Excel Sheet Column Title](https://github.com/interviewcoder/leetcode/blob/master/src/_168_ExcelSheetColumnTitle/Solution.java) | Easy | `Math`  | convert decimal to other BASE system  | 
| 169 | Majority Element | Easy | `Divide and Conquer` `Array` `Bit Manipulation`  |  | 
| 171 | [Excel Sheet Column Number](https://github.com/interviewcoder/leetcode/blob/master/src/_171_ExcelSheetColumnNumber/Solution.java) | Easy | `Math`  | convert other BASE system to decimal system  | 
| 172 | [Factorial Trailing Zeroes](https://github.com/interviewcoder/leetcode/blob/master/src/_172_FactorialTrailingZeroes/Solution.java) | Easy | `Math`  | count the number of certain number (e.g. 5) in n! | 
| 173 | [Binary Search Tree Iterator](https://github.com/interviewcoder/leetcode/blob/master/src/_173_BinarySearchTreeIterator/Solution.java)  | Medium | `Tree` `Stack`  |  | 
| 174 | [Dungeon Game](https://github.com/interviewcoder/leetcode/blob/master/src/_174_DungeonGame/Solution.java)  | Hard | `Dynamic Programming` `Binary Search`  |  | 
| 179 | [Largest Number](https://github.com/interviewcoder/leetcode/blob/master/src/_179_LargestNumber/Solution.java) | Medium | `Sort`  |  | 
| 187 | Repeated DNA Sequences | Medium | `Hash Table` `Bit Manipulation`  |  | 
| 188 | Best Time to Buy and Sell Stock IV | Hard | `Dynamic Programming`  |  | 
| 189 | [Rotate Array](https://github.com/interviewcoder/leetcode/blob/master/src/_189_RotateArray/Solution.java) | Easy | `Array`  |  | 
| 190 | Reverse Bits | Easy | `Bit Manipulation`  |  | 
| 191 | Number of 1 Bits | Easy | `Bit Manipulation`  |  | 
| 198 | House Robber | Easy | `Dynamic Programming`  |  | 
| 199 | [Binary Tree Right Side View](https://github.com/interviewcoder/leetcode/blob/master/src/_199_BinaryTreeRightSideView/Solution.java) | Medium | `Tree` `Depth-first Search` `Breadth-first Search`  |  | 
| 200 | [Number of Islands](https://github.com/interviewcoder/leetcode/blob/master/src/_200_NumberOfIslands/Solution.java) | Medium | `Depth-first Search` `Breadth-first Search`  |  | 
| 201 | Bitwise AND of Numbers Range | Medium | `Bit Manipulation`  |  | 
| 202 | Happy Number | Easy | `Hash Table` `Math`  |  | 
| 203 | [Remove Linked List Elements](https://github.com/interviewcoder/leetcode/blob/master/src/_203_RemoveLinkedListElements/Solution.java) | Easy | `Linked List`  |  | 
| 204 | [Count Primes](https://github.com/interviewcoder/leetcode/blob/master/src/_204_CountPrimes/Solution.java) | Easy | `Hash Table` `Math`  | sieve algorithm | 
| 205 | Isomorphic Strings | Easy | `Hash Table`  |  | 
| 206 | [Reverse Linked List](https://github.com/interviewcoder/leetcode/blob/master/src/_206_ReverseLinkedList/Solution.java) | Easy | `Linked List`  |  | 
| 207 | [Course Schedule](https://github.com/interviewcoder/leetcode/blob/master/src/_207_CourseSchedule/Solution.java) | Medium | `Depth-first Search` `Breadth-first Search` `Graph` `Topological Sort`  |  | 
| 208 | [Implement Trie (Prefix Tree)](https://github.com/interviewcoder/leetcode/blob/master/src/_208_ImplementTriePrefixTree/Solution.java) | Medium | `Data Structure` `Trie`  |  | 
| 209 | [Minimum Size Subarray Sum](https://github.com/interviewcoder/leetcode/blob/master/src/_209_MinimumSizeSubarraySum/Solution.java) | Medium | `Array` `Two Pointers` `Binary Search`  |  | 
| 210 | Course Schedule II | Medium | `Depth-first Search` `Breadth-first Search` `Graph` `Topological Sort`  |  | 
| 211 | [Add and Search Word - Data structure design](https://github.com/interviewcoder/leetcode/blob/master/src/_211_AddAndSearchWordDataStructureDesign/Solution.java)  | Medium | `Backtracking` `Data Structure` `Trie`  |  | 
| 212 | [Word Search II](https://github.com/interviewcoder/leetcode/blob/master/src/_212_WordSearchII/Solution.java) | Hard | `Backtracking` `Trie`  |  | 
| 213 | [House Robber II](https://github.com/interviewcoder/leetcode/blob/master/src/_213_HouseRobberII/Solution.java) | Medium | `Dynamic Programming`  |  | 
| 214 | Shortest Palindrome | Hard | `String`  |  | 
| 215 | [Kth Largest Element in an Array](https://github.com/interviewcoder/leetcode/blob/master/src/_215_KthLargestElementInAnArray/Solution.java)  | Medium | `Divide and Conquer` `Heap`  | max-heap using Java's Priority Queue | 
| 216 | [Combination Sum III](https://github.com/interviewcoder/leetcode/blob/master/src/_216_CombinationSumIII/Solution.java)  | Medium | `Array` `Backtracking`  |  | 
| 217 | [Contains Duplicate](https://github.com/interviewcoder/leetcode/blob/master/src/_217_ContainsDuplicate/Solution.java) | Easy | `Array` `Hash Table`  |  | 
| 218 | The Skyline Problem | Hard | `Divide and Conquer` `Heap`  |  | 
| 219 | [Contains Duplicate II](https://github.com/interviewcoder/leetcode/blob/master/src/_219_ContainsDuplicateII/Solution.java) | Easy | `Array` `Hash Table`  |  | 
| 220 | [Contains Duplicate III](https://github.com/interviewcoder/leetcode/blob/master/src/_220_ContainsDuplicateIII/Solution.java) | Medium | `Binary Search Tree`  |  | 
| 221 | Maximal Square | Medium | `Dynamic Programming`  |  | 
| 222 | Count Complete Tree Nodes | Medium | `Tree` `Binary Search`  |  | 
| 223 | [Rectangle Area](https://github.com/interviewcoder/leetcode/blob/master/src/_223_RectangleArea/Solution.java)  | Easy | `Math`  |  | 
| 224 | [Basic Calculator](https://github.com/interviewcoder/leetcode/blob/master/src/_224_BasicCalculator/Solution.java) | Medium | `Stack` `Math`  |  | 
| 225 | [Implement Stack using Queues](https://github.com/interviewcoder/leetcode/blob/master/src/_225_ImplementStackUsingQueues/Solution.java)  | Easy | `Stack` `Data Structure`  |  | 
| 226 | Invert Binary Tree | Easy | `Tree`  |  | 
| 227 | Basic Calculator II | Medium | `String`  |  | 
| 228 | [Summary Ranges](https://github.com/interviewcoder/leetcode/blob/master/src/_228_SummaryRanges/Solution.java) | Easy | `Array`  |  | 
| 229 | [Majority Element II](https://github.com/interviewcoder/leetcode/blob/master/src/_229_MajorityElementII/Solution.java) | Medium | `Array`  | `!`vote algorithm | 
| 230 | [Kth Smallest Element in a BST](https://github.com/interviewcoder/leetcode/blob/master/src/_230_KthSmallestElementInABST/Solution.java) | Medium | `Tree` `Binary Search`  |  | 
| 231 | Power of Two | Easy | `Math` `Bit Manipulation`  |  | 
| 232 | [Implement Queue using Stacks](https://github.com/interviewcoder/leetcode/blob/master/src/_232_ImplementQueueUsingStacks/Solution.java)  | Easy | `Stack` `Data Structure`  |  | 
| 233 | Number of Digit One | Medium | `Math`  |  | 
| 234 | Palindrome Linked List | Easy | `Linked List` `Two Pointers`  |  | 
| 235 | [Lowest Common Ancestor of a Binary Search Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_235_LowestCommonAncestorOfABinarySearchTree/Solution.java)  | Easy | `Tree`  |  | 
| 236 | [Lowest Common Ancestor of a Binary Tree](https://github.com/interviewcoder/leetcode/blob/master/src/_236_LowestCommonAncestorOfABinaryTree/Solution.java)  | Medium | `Tree`  |  | 
| 237 | [Delete Node in a Linked List](https://github.com/interviewcoder/leetcode/blob/master/src/_237_DeleteNodeInALinkedList/Solution.java)  | Easy | `Linked List`  |  | 
| 238 | [Product of Array Except Self](https://github.com/interviewcoder/leetcode/blob/master/src/_238_ProductOfArrayExceptSelf/Solution.java)  | Medium | `Array`  |  | 
| 239 | [Sliding Window Maximum](https://github.com/interviewcoder/leetcode/blob/master/src/_239_SlidingWindowMaximum/Solution.java)  | Hard | `Heap`  | descending queue | 
| 240 | [Search a 2D Matrix II](https://github.com/interviewcoder/leetcode/blob/master/src/_240_SearchA2DMatrixII/Solution.java)  | Medium | `Divide and Conquer` `Binary Search`  | | 
| 241 | Different Ways to Add Parentheses | Medium | `Divide and Conquer`  |  | 
| 242 | [Valid Anagram](https://github.com/interviewcoder/leetcode/blob/master/src/_242_ValidAnagram/Solution.java) | Easy | `Hash Table` `Sort`  |  | 
| 257 | Binary Tree Paths | Easy | `Tree`  |  | 
| 258 | Add Digits | Easy | `Math`  |  | 
| 260 | Single Number III | Medium | `Bit Manipulation`  |  | 
| 263 | Ugly Number | Easy | `Math`  |  | 
| 264 | Ugly Number II | Medium | `Math` `Heap`  |  | 
| 268 | Missing Number | Medium | `Array` `Math` `Bit Manipulation`  |  | 

