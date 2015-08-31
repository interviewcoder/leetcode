package _022_GenerateParentheses;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _022_GenerateParentheses.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int n = 0;
        List<String> actual = solution.generateParenthesis(n);
        List<String> expected = new ArrayList<String>();
        expected.add("");
        assertEqualsIgnoreOrder(actual, expected);
    }

    @Test
    public void Test1() {
        int n = 1;
        List<String> actual = solution.generateParenthesis(n);
        List<String> expected = new ArrayList<String>(Arrays.asList("()"));
        assertEqualsIgnoreOrder(actual, expected);
    }

    @Test
    public void Test2() {
        int n = 2;
        List<String> actual = solution.generateParenthesis(n);
        List<String> expected = Arrays.asList("()()", "(())");
        assertEqualsIgnoreOrder(actual, expected);
    }

    @Test
    public void Test3() {
        int n = 3;
        List<String> actual = solution.generateParenthesis(n);
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()",
                "()(())", "()()()");
        assertEqualsIgnoreOrder(actual, expected);
    }

}
