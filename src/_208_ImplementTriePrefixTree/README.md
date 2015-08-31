### [208] Implement Trie (Prefix Tree)

```java
class Node {
    // since input is a-z, each slot represents one character
    Node[] children = new Node[26];  
    boolean end = false;  // whether a word ends at this node
}
/**
    empty slot means there is no character following that path
    e.g. in level 1, it means no words starting with 'b', 'd' exist
 Trie:                  root
              / /   / |       \  \   \
            [a],[],[c],[],... ,[x],[],[z]    ---- level 1
             |
    [a],[ ],[ ],[d],[e]                        ---- level 2
 */

```
