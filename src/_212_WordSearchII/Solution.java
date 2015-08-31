/**
 * Time : O(); Space : O()
 * @tag : Backtracking; Trie
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a 2D board and a list of words from the dictionary, find all 
 * words in the board. 
 * 
 * Each word must be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once in a word. 
 * 
 * For example, 
 * 
 * Given words = ["oath","pea","eat","rain"] and board = 
 * [ 
 *  ['o','a','a','n'], 
 *  ['e','t','a','e'], 
 *  ['i','h','k','r'], 
 *  ['i','f','l','v'] 
 * ] 
 * 
 * Return ["eat","oath"]. 
 * 
 * Note: You may assume that all inputs are consist of lowercase letters a-z.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/word-search-ii/ }
 */
package _212_WordSearchII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** see test {@link _212_WordSearchII.SolutionTest } */
public class Solution {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        if (board.length == 0 || board[0].length == 0) {
            return result;
        }

        Trie trie = buildTrie(words);

        Set<String> res = new HashSet<>();
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                StringBuilder prefix = new StringBuilder("");
                findWords(board, words, prefix, i, j, visited, res, trie);
            }
        }
        return new ArrayList<String>(res);
    }

    // insert all words from dictionary into trie
    private Trie buildTrie(String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        return trie;
    }

    // before: String word
    // visit : board[i][j] and its children
    // after : back to state `word`
    private void findWords(char[][] board, String[] words, StringBuilder word,
            int i, int j, boolean[][] visited, Set<String> res, Trie trie) {
        int rows = board.length;
        int cols = board[0].length;
        // base case
        if (!res.contains(word) && trie.contains(word)) {
            res.add(word.toString());
        }
        // recursive case
        if (i >= 0 && i < rows && j >= 0 && j < cols && !visited[i][j]) {
            visited[i][j] = true;
            StringBuilder prefix = new StringBuilder(word);
            prefix.append(board[i][j]);
            if (trie.startsWith(prefix)) {
                findWords(board, words, prefix, i + 1, j, visited, res, trie);
                findWords(board, words, prefix, i - 1, j, visited, res, trie);
                findWords(board, words, prefix, i, j + 1, visited, res, trie);
                findWords(board, words, prefix, i, j - 1, visited, res, trie);
            }
            visited[i][j] = false;
        }

    }

    /**  same implementation as problem {@link _208_ImplementTriePrefixTree.Solution} */
    private class Trie {

        class TrieNode {
            private TrieNode[] children = new TrieNode[26];
            private boolean end = false;
        }

        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
            node.end = true;
        }

        public boolean contains(StringBuilder word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (node.children[index] == null) {
                    return false;
                }
                node = node.children[index];
            }
            return node.end;
        }

        public boolean startsWith(StringBuilder prefix) {
            TrieNode node = root;
            for (int i = 0; i < prefix.length(); i++) {
                int index = prefix.charAt(i) - 'a';
                if (node.children[index] == null) {
                    return false;
                }
                node = node.children[index];
            }
            return true;
        }
    }

}
