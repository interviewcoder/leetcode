### [035] [Search Insert Position](https://github.com/interviewcoder/leetcode/blob/master/src/_035_SearchInsertPosition/Solution.java)

To make life easier, we can consider the very easy situation, only one number exists.

```java
/**
 * Before search       left & right
                            |
                     index  0               
                     number 5
                     
 * case I  : (target = 5) => expect = 0 => return left or right
 * case II : (target > 5) => expect = 1 => return left
    after  left = mid + 1;
                  right   left
                    |       |          
        index       0       1 
        number      5     (null)
 * case III: (target < 5) => expect = 0 => return left
    after   right = mid - 1;
                  right    left
                    |        |
        index      -1        0
        number    (null)     5
 * Summary: return left        
 */
 
```