package _150_EvaluateReversePolishNotation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _150_EvaluateReversePolishNotation.Practice } */
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
    public void Test1() {
        String[] tokens = { "2", "1", "+", "3", "*" };
        int actual = solution.evalRPN(tokens);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String[] tokens = { "4", "13", "5", "/", "+" };
        int actual = solution.evalRPN(tokens);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String[] tokens = { "4", "13", "+" };
        int actual = solution.evalRPN(tokens);
        int expected = 17;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String[] tokens = { "8", "4", "/" };
        int actual = solution.evalRPN(tokens);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String[] tokens = { "8", "4", "-" };
        int actual = solution.evalRPN(tokens);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String[] tokens = { "8", "4", "-", "3", "+", "2", "*" };
        int actual = solution.evalRPN(tokens);
        int expected = 14;
        assertEquals(expected, actual);
    }

}
