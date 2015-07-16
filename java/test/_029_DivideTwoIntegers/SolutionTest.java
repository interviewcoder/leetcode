package _029_DivideTwoIntegers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _029_DivideTwoIntegers.Solution } */
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
        int dividend = 8;
        int divisor = 4;
        int actual = solution.divide(dividend, divisor);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int dividend = 4;
        int divisor = 8;
        int actual = solution.divide(dividend, divisor);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int dividend = 9;
        int divisor = 4;
        int actual = solution.divide(dividend, divisor);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int dividend = 0;
        int divisor = 4;
        int actual = solution.divide(dividend, divisor);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int dividend = -5;
        int divisor = 2;
        int actual = solution.divide(dividend, divisor);
        int expected = -2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int dividend = 5;
        int divisor = -2;
        int actual = solution.divide(dividend, divisor);
        int expected = -2;
        // System.out.println(dividend / divisor + "");
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int dividend = -2147483648;
        int divisor = -1;
        int actual = solution.divide(dividend, divisor);
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int dividend = -2147483648;
        int divisor = 1;
        int actual = solution.divide(dividend, divisor);
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int dividend = -2147483648;
        int divisor = 2;
        int actual = solution.divide(dividend, divisor);
        int expected = -1073741824;
        assertEquals(expected, actual);
    }

}
