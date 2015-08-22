/**
 *************************************************************************
 * Implement a trie with insert, search, and startsWith methods. 
 * 
 * Note: 
 * You may assume that all inputs are consist of lowercase letters a-z.
 * 
 *************************************************************************
 * @tag : Data Structure; Trie
 * {@link https://leetcode.com/problems/implement-trie-prefix-tree/ }
 */
package _208_ImplementTriePrefixTree;

class TrieNode {
    // Initialize your data structure here.
    public TrieNode() {
    }
}

/** see test {@link _208_ImplementTriePrefixTree.PracticeTest } */
public class Practice {

    private TrieNode root;

    public Practice() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {

    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        return root == null;
    }
    
    // Returns if there is any word in the trie
    // that starts with the given prefix.
    // Note, does not need to check 'sub-word' in 'word'
    public boolean startsWith(String prefix) {
        return false;
    }

}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
