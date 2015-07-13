/**
 * Time : O(N); Space: O(N)
 * @tag : Stack; String
 * @by  : Steven Cooks
 * @date: Jun 5, 2015
 * --------------------------------------------------------
 * P.S. :1.global constant; double-brace initialization
 *       2. str1.equals(str2)
 *       3. String.join(delimiter, sequences);
 *          str.parse(delimiter);
 */
package _071_SimplifyPath;

import java.util.Stack;

/** see test {@link _071_SimplifyPath.SolutionParsingTest } */
public class SolutionParsing {

    /**
     * Parsing the input string manually instead of using library's "split"
     */
    public String simplifyPath(String path) {
        Stack<String> paths = new Stack<String>();
        String result = "";
        int beginIndex = 0;
        int endIndex = 0;
        String p = "";

        while (endIndex != -1) {
            // parse path
            endIndex = path.indexOf("/", beginIndex);
            if (endIndex != -1) {
                p = path.substring(beginIndex, endIndex);
            } else {
                p = path.substring(beginIndex);
            }

            if (!(p.length() == 0 || p.equals("."))) {
                // ignore empty string and "."
                if (p.equals("..")) {
                    // for parent directory
                    if (!paths.isEmpty()) {
                        paths.pop();
                    }
                } else {
                    // for other valid directory
                    paths.push(p);
                }
            }
            beginIndex = endIndex + 1;
        }

        // construct result
        for (String str : paths) {
            result += "/" + str;
        }
        // System.out.println("stack: " + paths.size() + " " + paths);
        return paths.empty() ? "/" : result;
    }

}
