package _204_CountPrimes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _204_CountPrimes.Solution } */
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
        int n = 2;
        int actual = solution.countPrimes(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int n = 20;
        int actual = solution.countPrimes(n);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int n = 1;
        int actual = solution.countPrimes(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int n = 200;
        int actual = solution.countPrimes(n);
        int expected = 46;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int n = 500;
        int actual = solution.countPrimes(n);
        int expected = 95;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int n = -10;
        int actual = solution.countPrimes(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
