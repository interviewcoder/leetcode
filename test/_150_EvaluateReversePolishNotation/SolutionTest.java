package _150_EvaluateReversePolishNotation;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _150_EvaluateReversePolishNotation.Solution } */
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
    public void Test1() {
        String[] tokens = { "2", "1", "+", "3", "*" };
        int actual = solution.evalRPN(tokens);
        int expected = 9;
        assertEquals(Arrays.toString(tokens), expected, actual);
    }

    @Test
    public void Test2() {
        String[] tokens = { "4", "13", "5", "/", "+" };
        int actual = solution.evalRPN(tokens);
        int expected = 6;
        assertEquals(Arrays.toString(tokens), expected, actual);
    }

    @Test
    public void Test3() {
        String[] tokens = { "4", "13", "+" };
        int actual = solution.evalRPN(tokens);
        int expected = 17;
        assertEquals(Arrays.toString(tokens), expected, actual);
    }

    @Test
    public void Test4() {
        String[] tokens = { "8", "4", "/" };
        int actual = solution.evalRPN(tokens);
        int expected = 2;
        assertEquals(Arrays.toString(tokens), expected, actual);
    }

}
