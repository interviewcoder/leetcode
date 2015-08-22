/**
 * Time : O() ; Space: O()
 * @tag : Backtracking; Data Structure; Trie
 * @by  : Steven Cooks
 * @date: Aug 22, 2015
 ***************************************************************************
 * Description:
 * 
 * Design a data structure that supports the following two operations: 
 * void addWord(word) 
 * bool search(word) 
 * search(word) can search a literal word or a regular expression string 
 * containing only letters a-z or .. A . means it can represent any one letter. 
 * 
 * For example: 
 * addWord("bad") 
 * addWord("dad")
 * addWord("mad") 
 * search("pad") -> false 
 * search("bad") -> true 
 * search(".ad") -> true 
 * search("b..") -> true 
 * 
 * Note: 
 * You may assume that all words are consist of lowercase letters a-z.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/add-and-search-word-data-structure-design/ }
 */
package _211_AddAndSearchWordDataStructureDesign;

/** see test {@link _211_AddAndSearchWordDataStructureDesign.SolutionTest } */
public class Solution {

    class Node {
        boolean isLeaf;
        Node[] children = new Node[26];
    }

    private Node root;

    public Solution() {
        root = new Node();
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        Node node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                // fill in new child
                node.children[index] = new Node();
            }
            node = node.children[index];
        }
        node.isLeaf = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return search(root, word, 0);
    }

    private boolean search(Node root, String word, int wordIndex) {
        // base case
        if (root == null) {
            return false;
        } else if (wordIndex == word.length()) {
            return root.isLeaf;
        }
        // recursive case
        if (word.charAt(wordIndex) == '.') {
            // try all children of current root
            for (Node child : root.children) {
                if (search(child, word, wordIndex + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            int index = word.charAt(wordIndex) - 'a';
            return search(root.children[index], word, wordIndex + 1);
        }
    }

}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");