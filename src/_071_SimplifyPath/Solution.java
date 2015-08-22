/**
 * Time : O(N); Space: O(N)
 * @tag : Stack; String
 * @by  : Steven Cooks
 * @date: Jul 13, 2015
 * --------------------------------------------------------------
 * {@link https://leetcode.com/problems/simplify-path/ } 
 * P.S. : 1.String.substring(beginIndex, endIndex)  //[beginIndex,endIndex)
 *        2.String.indexOf(str, fromIndex)  // [fromIndex,],
 *                                          // fromIndex=[0,len-1]
 */
package _071_SimplifyPath;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/** see test {@link _071_SimplifyPath.SolutionTest } */
public class Solution {
    
    /**
     * add a global set to contain characters that should be skipped
     */
    @SuppressWarnings("serial")
    private Set<String> skipSet = new HashSet<String>() {
        {
            add("/");
            add(".");
            add("");
        }
    };

    /**
     * Split the input string into array by delimiter "/". 
     * Since each ".." will cause path to move back to its parent directory, 
     * we pop out the latest path from stack whenever we meet with a "..".
     * ! pay attention to empty path case
     */
    public String simplifyPath(String path) {
        Stack<String> paths = new Stack<String>();
        String[] tokens = path.split("/");
        for (String token : tokens) {
            if (skipSet.contains(token) == false) {
                if (token.equals("..") && paths.isEmpty() == false) {
                    // go back to parent directory
                    paths.pop();
                } else if (!token.equals("..")) {
                    // for valid directory other than ".."
                    paths.push(token);
                }
            }
        }
        return "/" + String.join("/", paths);
    }

}
