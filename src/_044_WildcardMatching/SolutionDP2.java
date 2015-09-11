/**
 * Time : O(); Space : O()
 * @tag : Dynamic Programming; Backtracking; Greedy; String
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 */
package _044_WildcardMatching;

/** see test {@link _044_WildcardMatching.SolutionDP2Test} */
public class SolutionDP2 {

    // converted from memo version
    public boolean isMatch3(String s, String p) {
        boolean[][] f = new boolean[s.length() + 1][p.length() + 1];
        for (int j = p.length(); j >= 0; j--) {
            for (int i = s.length(); i >= 0; i--) {
                boolean isMatch = false;
                if (i == s.length() && j == p.length()) {
                    isMatch = true;
                } else if (j == p.length()) {
                    isMatch = false;
                } else if (i == s.length()) {
                    isMatch = p.charAt(j) == '*' && f[i][j + 1];
                } else {
                    if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
                        isMatch = f[i + 1][j + 1];
                    } else if (p.charAt(j) == '*') {
                        isMatch = f[i + 1][j] || f[i][j + 1];
                    }
                }
                f[i][j] = isMatch;
            }
        }
        return f[0][0];
    }

    // purely converted from memo version
    public boolean isMatch(String s, String p) {
        boolean[][] f = new boolean[s.length() + 1][p.length() + 1];
        for (int j = p.length(); j >= 0; j--) {
            for (int i = s.length(); i >= 0; i--) {
                boolean isMatch = false;
                if (i == s.length() && j == p.length()) {
                    isMatch = true;
                } else if (j == p.length()) {
                    isMatch = false;
                } else if (p.charAt(j) == '*') {
                    isMatch = f[i][j + 1] || (i < s.length() && f[i + 1][j]);
                } else if (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                    isMatch = f[i + 1][j + 1];
                }
                f[i][j] = isMatch;
            }
        }
        return f[0][0];
    }

}
