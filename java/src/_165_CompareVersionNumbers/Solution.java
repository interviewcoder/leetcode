/**
 * Time : O(); Space: O()
 * @tag : String
 * @date: Jun 13, 2015
 * @by  : Steven Cooks
 *************************************************************************
 * Description:
 * 
 * Compare two version numbers version1 and version2. 
 * If version1 > version2 return 1, 
 * if version1 < version2 return -1, otherwise return 0. 
 * 
 * You may assume that the version strings are non-empty and contain only 
 * digits and the . character. 
 * The . character does not represent a decimal point and is used to 
 * separate number sequences. 
 * 
 * For instance, 2.5 is not "two and a half" or "half way to version three", 
 * it is the fifth second-level revision of the second first-level revision. 
 * 
 * Here is an example of version numbers ordering: 
 *      0.1 < 1.1 < 1.2 < 13.37
 *      
 *************************************************************************
 * {@link https://leetcode.com/problems/compare-version-numbers/ }
 */
package _165_CompareVersionNumbers;

/**
 * 1. split string using regular expression 
 * see test {@link _165_CompareVersionNumbers.SolutionTest } */
public class Solution {

    public int compareVersion(String version1, String version2) {
        // trim two strings
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int len1 = str1.length;
        int len2 = str2.length;
        int index = 0;
        while (index < len1 && index < len2) {
            int num1 = Integer.parseInt(str1[index]);
            int num2 = Integer.parseInt(str2[index]);
            if (num1 != num2) {
                return (num1 - num2) > 0 ? 1 : -1;
            }
            index++;
        }
        // checking the remaining part is all 0s
        if (index < len1) {
            return checkRemain(str1, index) ? 1 : 0;
        } else {
            return checkRemain(str2, index) ? -1 : 0;
        }
    }

    // check from index to end
    private boolean checkRemain(String[] str, int index) {
        int len = str.length;
        for (int i = index; i < len; i++) {
            if (Integer.parseInt(str[i]) != 0) {
                return true;
            }
        }
        return false;
    }

}
