#### Category
| Type         | # | Description |
| ---------------------: |:---:| ------------|
|-------------------------------------- | ----------------- | ------------------------------------------------- |
| **`Backtracking template`** |  |  |
| [...] + `[.]` + `[]` + pure  | 078 | Subsets |
| `[..]` + select + skip + pure | 090 | SubsetsII: skip duplicates |
| `[..]` + select + `[]` + pure | 046 | Permutation |
| `[..]` + select + skip + pure | 047 | PermuationII: template + select qualified + skip duplicates |
| prune + select + `[]` + pure | 039 | Combination Sum: template + select qualified + prune sibilings |
| prune + select + skip + pure | 040 | Combination SumII: template + select qualified + skip duplicates + prune siblings |
|-------------------------------------- | ----------------- | ------------------------------------------------- |
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
|-------------------------------------- | ----------------- | ------------------------------------------------- |
| Contiguous Subarray sum |     |             |
| | 209 | Minimum Size Subarray Sum | Two pointers to keep a sliding window |
| Both BFS and DFS can do |     |             |
|                         | 207 | Course Schedule |
| | 103 | Clone Graph |
| pair matching using stack | | |
| | 020 | Valid Parentheses | using stack to match parenthesis pair |
| | 071 | Simplify Path | using stack to counteract the latest path for ".." |
| use stack to keep indices of ascending element | | |
| | 084 | Largest Rectangle In Histogram | |
| |     | [Find Next Greater/Smaller Element]() | |
| [Subarray/sublist] Window-two-pointer |     | left-right pointers to keep a window to solve `sub` problem  |
| | 003 | Longest Substring Without Repeating Characters |
| | 076 | Minimum Window Substring |
| | interview.TwoPointers | [MAXONE](http://www.interviewbit.com/courses/programming/topics/two-pointers/problems/maxone/) |