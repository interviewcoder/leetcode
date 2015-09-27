package _010_RegularExpressionMatching;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionDFSTest {
    
    /** Test method for {@link _010_RegularExpressionMatching.SolutionDFS } */
    SolutionDFS solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionDFS();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String s = "aa";
        String p = "a";
        assertTrue(!solution.isMatch(s, p));
    }

    @Test
    public void Test2() {
        String s = "aa";
        String p = "aa";
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void Test3() {
        String s = "aaa";
        String p = "aa";
        assertTrue(!solution.isMatch(s, p));
    }

    @Test
    public void Test4() {
        String s = "aa";
        String p = "a*";
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void Test5() {
        String s = "aa";
        String p = ".*";
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void Test6() {
        String s = "ab";
        String p = ".*";
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void Test7() {
        String s = "aab";
        String p = "c*a*b";
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void Test8() {
        String s = "aaa";
        String p = "a.a";
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void Test9() {
        String s = "aaa";
        String p = "ab*ac*a";
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void Test10() {
        String s = "aaa";
        String p = "aa.a";
        assertTrue(!solution.isMatch(s, p));
    }

    @Test
    public void Test11() {
        String s = "aaa";
        String p = "ab*a";
        assertTrue(!solution.isMatch(s, p));
    }

    @Test
    public void Test12() {
        String s = "aaa";
        String p = "*a";
        assertTrue(!solution.isMatch(s, p));
    }

    @Test
    public void Test13() {
        String s = "ab";
        String p = ".*c";
        assertTrue(!solution.isMatch(s, p));
    }

    @Test
    public void Test14() {
        String s = "";
        String p = ".*";
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void Test15() {
        String s = "baccbbcbcacacbbc";
        String p = "c*.*b*c*ba*b*b*.a*";
        assertTrue(solution.isMatch(s, p));
    }

}
