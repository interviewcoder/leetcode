package _076_MinimumWindowSubstring;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _076_MinimumWindowSubstring.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String actual = solution.minWindow(s, t);
        String expected = "BANC";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "ABDC";
        String t = "D";
        String actual = solution.minWindow(s, t);
        String expected = "D";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "aa";
        String t = "aa";
        String actual = solution.minWindow(s, t);
        String expected = "aa";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "ABDC";
        String t = "DSDF";
        String actual = solution.minWindow(s, t);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "ADOBECDEBAN";
        String t = "ABC";
        String actual = solution.minWindow(s, t);
        String expected = "CDEBA";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String s = "aaaaaaaaaaaabbbbbcdd";
        String t = "abcdd";
        String actual = solution.minWindow(s, t);
        String expected = "abbbbbcdd";
        assertEquals(expected, actual);
    }

}
