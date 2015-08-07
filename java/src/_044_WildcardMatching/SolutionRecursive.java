/**
 * Time : O(); Space : O()
 * @tag : Dynamic Programming; Backtracking; Greedy; String
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 */
package _044_WildcardMatching;

/** see test {@link _044_WildcardMatching.SolutionRecursiveTest } */
public class SolutionRecursive {

    public boolean isMatch(String s, String p) {
        return isMatchCore(s, p, 0, 0, s.length(), p.length());
    }

    private boolean isMatchCore(String s, String p, int sIndex, int pIndex,
            int sLen, int pLen) {
        // base case
        if (sIndex >= s.length() && pIndex == p.length()) {
            // both string and pattern end
            return true;
        }
        if (sIndex < s.length() && pIndex == p.length()) {
            // string not ends, but pattern ends
            return false;
        }

        // recursive case 1: met '*' in pattern
        if (p.charAt(pIndex) == '*') {
            // use '*' to match empty sequence in string
            // return isMatchCore(s, p, sIndex, pIndex + 1, sLen, pLen)
            // use '*' to match a sequence including s.charAt(sIndex) in string
            // || isMatchCore(s, p, sIndex + 1, pIndex, sLen, pLen);
            return isMatchCore(s, p, sIndex, pIndex + 1, sLen, pLen) 
                    || (sIndex < sLen && isMatchCore(s, p, sIndex + 1, pIndex, sLen, pLen));
        }
        // recursive case 2: met character other than '*' in pattern
        if (sIndex < sLen
                && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '?')) {
            // met same characters in string and pattern || met '?' in pattern
            return isMatchCore(s, p, sIndex + 1, pIndex + 1, sLen, pLen);
        }

        return false;
    }

}
