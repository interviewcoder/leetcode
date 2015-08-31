package _224_BasicCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _224_BasicCalculator.Solution } */
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
        String s = "1 + 1   ";
        int actual = solution.calculate(s);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = " 2-1 + 2 ";
        int actual = solution.calculate(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int actual = solution.calculate(s);
        int expected = 23;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s = " 1 -  ( 2 + 3)";
        int actual = solution.calculate(s);
        int expected = -4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s = " 1 -  ( 2 + 3) + 4";
        int actual = solution.calculate(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
