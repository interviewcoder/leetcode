/**
 * Time : O(N); Space: O(N)
 * @tag : String
 * @by  : Steven Cooks
 * @date: Jul 10, 2015
 *************************************************************************
 * Description: 
 *  
 * Implement the next permutation, which rearranges numbers into the 
 * numerically next greater permutation of numbers. 
 * 
 * If such arrangement is not possible, it must be rearranged as the 
 * lowest possible order ie, sorted in an ascending order. 
 * 
 * The replacement must be in-place, do not allocate extra memory. 
 * 
 * Examples: 
 *  1,2,3 → 1,3,2 
 *  3,2,1 → 1,2,3 
 *  1,1,5 → 1,5,1 
 *  20, 50, 113 → 20, 113, 50 
 *  
 * Inputs are in the left-hand column and its corresponding 
 * outputs are in the right-hand column.
 *
 *************************************************************************
 * {@link https://leetcode.com/problems/count-and-say/ }
 */
package _038_CountAndSay;

/** see test {@link _038_CountAndSay.SolutionTest } */
public class Solution {

    public String countAndSay(int n) {
        if (n < 1) {
            return "";
        }
        // initialize 
        StringBuilder str = new StringBuilder("1");
        for (int i = 1; i < n ; i++) {
            StringBuilder say = new StringBuilder();
            // count the number by group
            int len = str.length();
            int index = 0;
            while (index < len) {
                int count = 1;
                while (index < len - 1 && str.charAt(index) == str.charAt(index + 1)) {
                    count++;
                    index++;
                }
                say.append(count + "" + str.charAt(index));
                index++;
            }
            str = say;
        }
        return str.toString();
    }

}
