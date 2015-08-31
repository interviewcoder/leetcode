package _032_LongestValidParentheses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _032_LongestValidParentheses.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        String s = "";
        int actual = solution.longestValidParentheses(s);
        int expected = 0;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test1() {
        String s = "(()";
        int actual = solution.longestValidParentheses(s);
        int expected = 2;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test2() {
        String s = ")()())";
        int actual = solution.longestValidParentheses(s);
        int expected = 4;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test3() {
        String s = "(())()";
        int actual = solution.longestValidParentheses(s);
        int expected = 6;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test4() {
        String s = "()(()";
        int actual = solution.longestValidParentheses(s);
        int expected = 2;
        assertEquals(s, expected, actual);
    }

}
