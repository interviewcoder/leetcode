##Leetcode solutions in Java (in progress)
###Solutions, unit tests, and code skeletons for problems from [Leetcode OJ](https://leetcode.com/problemset/algorithms/). 

* Discussions and code reviews are more than welcome.
* `Solution.java` provides OJ-accepted solution.
* `Practice.java` provides code skeleton for each problem
* `SolutionTest.java` and `PracticeTest.java` provides basic unit tests to verify your solution.

P.S.:

- Many solutions are from online sources, like Leetcode OJ discussion, coders' blogs, etc.
- Solution that passed unit tests does not guarantee to pass Leetcode OJ.

#### Summary

| # |  Problem              |   Difficulty  | Tags             | Description  |
| :-: | --------------------- | ------------- | ---------------- | ------------------ |
| 005 | [Longest Palindromic Substring](https://github.com/interviewcoder/leetcode/blob/master/java/src/_005_LongestPalindromicSubstring/Solution.java) | Medium | `String` | span palindrome from center towards left and rigth |
| 007 | [Reverse Integer](https://github.com/interviewcoder/leetcode/blob/master/java/src/_007_ReverseInteger/Solution.java)             | Easy   | `Math`  | How to monitor Stack Overflow |
| 041 | [First Missing Positive](https://github.com/interviewcoder/leetcode/blob/master/java/src/_041_FisrtMissingPositive/Solution.java)      | Hard   | `Array` |swap-until techinique |
| 056 | [Merge Intervals](https://github.com/interviewcoder/leetcode/blob/master/java/src/_056_MergeIntervals/Solution.java)             | Hard   |`Array` `Sort` | how to decide the boundary of merged interval |
| 057 | [Insert Intervals](https://github.com/interviewcoder/leetcode/blob/master/java/src/_057_InsertInterval/Solution.java)            | Hard   | `Array` `Sort` | ! enlarge to merge interval  |
| 067 | [Add Binary](https://github.com/interviewcoder/leetcode/blob/master/java/src/_067_AddBinary/Solution.java) | Easy | `Math` `String` | add binary numbers |
| 068 | [Text Justification](https://github.com/interviewcoder/leetcode/blob/master/java/src/_068_TextJustification/Solution.java) | Hard | `String` | ! very careful string operations |
| 168 | [Excel Sheet Column Title](https://github.com/interviewcoder/leetcode/blob/master/java/src/_168_ExcelSheetColumnTitle/Solution.java)    | Easy   | `Math` | convert decimal to other BASE system |
| 171 | [Excel Sheet Column Number](https://github.com/interviewcoder/leetcode/blob/master/java/src/_171_ExcelSheetColumnNumber/Solution.java)   | Easy   | `Math` | convert other BASE system to decimal system |
| 172 | [Factorial Trailing Zeros](https://github.com/interviewcoder/leetcode/blob/master/java/src/_172_FactorialTrailingZeros/Solution.java)    | Easy   | `Math` | count the number of certain number (e.g. 5) in n! |
| 204 | [Count Primes](https://github.com/interviewcoder/leetcode/blob/master/java/src/_204_CountPrimes/Solution.java)                | Easy   | `Hash Table` `Math` | sieve algorithm |
| 229 | [Majority Element II](https://github.com/interviewcoder/leetcode/blob/master/java/src/_229_MajorityElementII/Solution.java)         | Medium | `Array` | ! vote algorithm |

#### Category
- Using two pointers to keep a sliding window
    - [209] Minimum Size Subarray Sum
- Both DFS and BFS do the job 
    - [207] Course Schedule
    - [103] Clone Graph
    