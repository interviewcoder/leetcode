/**
 * Time : O(); Space: O()
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

    public int removeDuplicates(int[] nums) {
        int k = 2;
        return removeDuplicatesAtMostKDuplicates(nums, k);
    }

    // counting the number of duplicates of each number in array
    public int removeDuplicatesAtMostKDuplicates(int[] nums, int k) {
        int len = nums.length;
        if (len <= k) {
            return len;
        }
        int lastValidIndex = 0;
        int duplicates = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[lastValidIndex]) {
                // first-time appeared number
                lastValidIndex++;
                nums[lastValidIndex] = nums[i];
                duplicates = 1;
            } else if (duplicates < k) {
                lastValidIndex++;
                nums[lastValidIndex] = nums[i];
                duplicates++;
            }
        }
        return lastValidIndex + 1;
    }

}
