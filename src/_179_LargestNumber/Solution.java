/**
 * Time : O(N^2); Space : O(N)
 * @tag : Sort
 * @by  : Steven Cooks
 * @date: Jul 5, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given a list of non negative integers, arrange them such that they form 
 * the largest number. 
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330. 
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/largest-number/  }
 */
package _179_LargestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int number : nums) {
            list.add("" + number);
        }
        
        // sort list by combination of two numbers
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String num1, String num2) {
                String s1 = num1 + num2;
                String s2 = num2 + num1;
                // not num1.compareTo(num2);
                return s2.compareTo(s1); 
            }
        });
        
        StringBuilder strBuilder = new StringBuilder();
        boolean allZeros = true;
        for (String str: list) {
            if (allZeros && !str.equals("0")) {
                allZeros = false;
            }
            strBuilder.append(str);
        }
        // for corner case all 0s
        return allZeros ? "0" : strBuilder.toString();
    }
}
