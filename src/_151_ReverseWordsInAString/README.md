### [151] Reverse Words In A String

- Solution I: Two Pointers, see [Solution.java](https://github.com/interviewcoder/leetcode/blob/master/src/_151_ReverseWordsInAString/Solution.java)

    - Time: O(N);   Space: O(N)
    - We parse out words from end to begin using two pointers
    ```java
    // problem 1: how to parse word ==> how to find the beginIndex and endIndex
    if (s.charAt(i) != ' ' && i == 0 || s.charAt(i - 1) == ' ') {
        // i is the begin index of a word
    }
    if (s.charAt(i) == ' ') {
        // i is the end index of a word for substring(begin, end)
    }
    // to combine
    int end = s.length();
    for (int i = s.length() - 1; i >= 0 ; i--) {
        if (s.charAt(i) == ' ') {
            end = i;
        } else if (i == 0 || s.charAt(i - 1) == ' ') {
            int start = i;
            String word = s.substring(start, end);
        }
    }
    ```
- Solution II: advanced native Java methods, see [SolutionAdvanced.java](https://github.com/interviewcoder/leetcode/blob/master/src/_151_ReverseWordsInAString/SolutionAdvanced.java)

    - Time: O(N); Space: O(N)
    - split string into words by delimiter `' '`
    - push words into another list reversely
    - join the new list by delimiter `' '`