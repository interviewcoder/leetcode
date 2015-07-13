package _020_ValidParentheses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _020_ValidParentheses.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

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
        String s = "[]";
        boolean actual = solution.isValid(s);
        assertTrue("[]", actual);
    }

    @Test
    public void Test1() {
        String s = "{}";
        boolean actual = solution.isValid(s);
        assertTrue("{}", actual);
    }

    @Test
    public void Test2() {
        String s = "()";
        boolean actual = solution.isValid(s);
        assertTrue("()", actual);
    }

    @Test
    public void Test3() {
        String s = "";
        boolean actual = solution.isValid(s);
        assertTrue("empty string", actual);
    }

    @Test
    public void Test4() {
        String s = ")";
        boolean actual = solution.isValid(s);
        assertTrue("only right", !actual);
    }

    @Test
    public void Test5() {
        String s = "([{}])";
        boolean actual = solution.isValid(s);
        assertTrue("nested string", actual);
    }

    @Test
    public void Test6() {
        String s = "([{(}])";
        boolean actual = solution.isValid(s);
        assertTrue("wrong nested string", !actual);
    }

    @Test
    public void Test7() {
        String s = "([{}](){[]})";
        boolean actual = solution.isValid(s);
        assertTrue(s, actual);
    }

    @Test
    public void Test8() {
        String s = "([{})";
        boolean actual = solution.isValid(s);
        assertTrue(s, !actual);
    }

    @Test
    public void Test9() {
        String s = "(}";
        boolean actual = solution.isValid(s);
        assertTrue(s, !actual);
    }

    @Test
    public void Test10() {
        String s = "({}]";
        boolean actual = solution.isValid(s);
        assertTrue(s, !actual);
    }

}
