/**
 * Time : O(N); Space: O(1)
 * @tag : Array; Backtracking
 * @by  : Steven Cooks
 * @date: Jun 7, 2015
 *************************************************************************
 * Description: 
 * 
 * Given a 2D board and a word, find if the word exists in the grid. 
 * The word can be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once. 
 * 
 * For example, Given board = 
 * [ 
 *  ["ABCE"], 
 *  ["SFCS"], 
 *  ["ADEE"] 
 * ] 
 * word = "ABCCED", -> returns true, 
 * word = "SEE", -> returns true, 
 * word = "ABCB", -> returns false.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/word-search/ }
 */
package _080_RemoveDuplicatesFromSortedArrayII;

/** see test {@link _080_RemoveDuplicatesFromSortedArrayII.SolutionGeneralTest } */
public class SolutionGeneral {
    
    private static final int K = 2;

    public int removeDuplicates(int[] nums) {
        return removeDuplicatesAtMostKDuplicates(nums, K);
    }

    // counting the number of duplicates of each number in array
    public int removeDuplicatesAtMostKDuplicates(int[] nums, int K) {
        int j = -1;  // index of last valid elements
        int duplicates = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[j]) {
                // first-time appeared number
                nums[++j] = nums[i];
                duplicates = 1;
            } else if (duplicates < K) {
                nums[++j] = nums[i];
                duplicates++;
            }
            // ignore more than enough duplicates
        }
        return j + 1;
    }

}
