package _050_PowxN;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _050_PowxN.Practice } */
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
        double x = 20;
        int n = 3;
        double actual = solution.myPow(x, n);
        double expected = 8000;
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void Test2() {
        double x = 8.88023;
        int n = 3;
        double actual = solution.myPow(x, n);
        double expected = 700.28148;
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void Test3() {
        double x = 8;
        int n = 3;
        double actual = solution.myPow(x, n);
        double expected = 512;
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void Test4() {
        double x = 1.00000;
        int n = -2147483648;
        double actual = solution.myPow(x, n);
        double expected = 1;
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void Test5() {
        double x = -1.00000;
        int n = -2147483648;
        double actual = solution.myPow(x, n);
        double expected = 1;
        assertEquals(expected, actual, 0.00001);
    }

}
