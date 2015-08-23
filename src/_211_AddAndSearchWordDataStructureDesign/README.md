### [211]  [Add and Search Word - Data structure design](https://github.com/interviewcoder/leetcode/blob/master/src/_211_AddAndSearchWordDataStructureDesign/Solution.java) 

`Tag`: Backtracking; Data Structure; Trie

1. implement Prefix Trie
   ```java
              []
          / ..|.. \
        [a]   [h]   [z]
       /   \
     [a] .. [z]  
     
     class Node {
        // whether one word ending at this node
        boolean isLeaf;  
        // since input only contains a~z
        Node[] children = new Node[26]; 
     }
    ```
2. insert(String word)    
   ```java
   Assuming current Trie is 
       [ ] <- root 
        |
       [a]
    And we want to insert word =  "ab"
    
    Node node = root
    for char ch : word
        index = ch - 'a'
        if node.children[index] is not null   // this character exists in children, then go to
           do nothing
        else 
           fill in a new node at this index  => node.childrent[index] = new Node()
        node = node.children[index]   
    // ! label the last node as ending leaf
    node.isLeaf = true;
   ```
3. search in Prefix Trie
    ```java
    for each char in word:
        if node.children[index] not exists:
            return false
    // check if one word ending here
    return node.isLeaf
    ```
   
4. pattern matching in Prefix Trie
 
   For '.',  try all children nodes to match the rest part of word using DFS