package _065_ValidNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _065_ValidNumber.Solution } */
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
        String s = "0";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test2() {
        String s = "0.1";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test3() {
        String s = "abc";
        assertTrue(!solution.isNumber(s));
    }

    @Test
    public void Test4() {
        String s = "1 a";
        assertTrue(!solution.isNumber(s));
    }

    @Test
    public void Test5() {
        String s = "2e10";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test6() {
        String s = "-2e10";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test7() {
        String s = "-2.1";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test8() {
        String s = "-2.10";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test9() {
        String s = "01";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test10() {
        String s = "00";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test11() {
        String s = "46.e3";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test12() {
        String s = "256523.e02";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test13() {
        String s = "256523.e+02";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test14() {
        String s = "-.1";
        assertTrue(solution.isNumber(s));
    }

    @Test
    public void Test15() {
        String s = "-e";
        assertTrue(!solution.isNumber(s));
    }
}
