/**
 * Time : O(); Space: O()
 * @tag : Backtracking; String
 * @date: Jun 10, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description: 
 * Given a string containing only digits, restore it by returning all
 * possible valid IP address combinations. 
 * For example:
 *  Given "25525511135", 
 *  return ["255.255.11.135", "255.255.111.35"]. 
 * (Order does not matter) 
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/restore-ip-addresses/ }
 */
package _093_RestoreIPAddresses;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _093_RestoreIPAddresses.SolutionTest } */
public class Solution {
    // backtracking: cut into required parts
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        String combination = "";
        restoreIpAddresses(0, 4, s, combination, result);
        return result;
    }

    private void restoreIpAddresses(int index, int parts, String s,
            String combination, List<String> result) {
        // base case
        if (index == s.length() && parts == 0) {
            // one combination is found!
            // remove the last '.' at the end of combination
            result.add(combination.substring(0, combination.length() - 1));
        }
        // recursive case
        if (parts > 0) {
            // the 1st part of ip address can at most take 3 characters
            for (int i = index; i < s.length() && i < index + 3; i++) {
                String ip = s.substring(index, i + 1);
                if (isValidIPNumber(ip)) {
                    String newCombination = combination + ip + ".";
                    restoreIpAddresses(i + 1, parts - 1, s, newCombination, result);
                }
            }
        }
    }

    // whether number is ["0" ~ "255"]
    private boolean isValidIPNumber(String number) {
        int num = Integer.parseInt(number);
        if (num <= 9) {
            return number.length() == 1;
        } else if (num <= 99) {
            return number.length() == 2;
        } else {
            return num <= 255;
        }
    }

}
