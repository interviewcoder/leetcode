package _087_ScrambleString;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _087_ScrambleString.Solution } */
    Solution solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

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
        String s1 = "great";
        String s2 = "rgeat";
        boolean actual = solution.isScramble(s1, s2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s1 = "great";
        String s2 = "rgtae";
        boolean actual = solution.isScramble(s1, s2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s1 = "dbdac";
        String s2 = "abcdd";
        boolean actual = solution.isScramble(s1, s2);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s1 = "great";
        String s2 = "great";
        boolean actual = solution.isScramble(s1, s2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s1 = "great";
        String s2 = "greata";
        boolean actual = solution.isScramble(s1, s2);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String s1 = "abbbcbaaccacaacc";
        String s2 = "acaaaccabcabcbcb";
        boolean actual = solution.isScramble(s1, s2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}