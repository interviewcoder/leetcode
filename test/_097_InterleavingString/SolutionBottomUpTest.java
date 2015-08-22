package _097_InterleavingString;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionBottomUpTest {

    /** Test method for {@link _097_InterleavingString.SolutionBottomUp } */
    SolutionBottomUp solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionBottomUp();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(true, actual);
    }

    @Test
    public void Test2() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(false, actual);
    }

    @Test
    public void Test3() {
        String s1 = "bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbb"
                + "ababbbbbabbbbababbabaabababbbaabababababbbaaababaa";
        String s2 = "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaaba"
                + "aabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab";
        String s3 = "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbba"
                + "aaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababb"
                + "bbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabb"
                + "bbbabbbbaabbabaabbbbabaaabbababbabbabbab";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(false, actual);
    }

    @Test
    public void Test4() {
        String s1 = "";
        String s2 = "dbbca";
        String s3 = "dbbca";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(true, actual);
    }

    @Test
    public void Test5() {
        String s1 = "aabc";
        String s2 = "";
        String s3 = "aabd";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(false, actual);
    }

    @Test
    public void Test6() {
        String s1 = "a";
        String s2 = "bc";
        String s3 = "bac";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(true, actual);
    }

    @Test
    public void Test7() {
        String s1 = "ab";
        String s2 = "bc";
        String s3 = "bcab";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(true, actual);
    }

    @Test
    public void Test8() {
        String s1 = "aa";
        String s2 = "ab";
        String s3 = "aaab";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(true, actual);
    }

    @Test
    public void Test9() {
        String s1 = "aa";
        String s2 = "ab";
        String s3 = "aaba";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(true, actual);
    }
    
    @Test
    public void Test10() {
        String s1 = "bab";
        String s2 = "abbbcba";
        String s3 = "babbbabcba";
        boolean actual = solution.isInterleave(s1, s2, s3);
        assertEquals(true, actual);
    }

}
