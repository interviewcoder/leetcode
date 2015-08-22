package _014_LongestCommonPrefix;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _014_LongestCommonPrefix.Solution } */
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
        String[] strs = {"aa", "a"};
        String actual = solution.longestCommonPrefix(strs);
        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String[] strs = {"abcdefgh", "aefghijk", "abcefgh"};
        String actual = solution.longestCommonPrefix(strs);
        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String[] strs = {"", "aefghijk", "abcefgh"};
        String actual = solution.longestCommonPrefix(strs);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String[] strs = {"bcdefgh", "befghijk", "bcefgh"};
        String actual = solution.longestCommonPrefix(strs);
        String expected = "b";
        assertEquals(expected, actual);
    }

}
