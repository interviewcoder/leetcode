package _172_FactorialTrailingZeroes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _172_FactorialTrailingZeroes.Solution } */
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
        int n = 4617;
        int actual = solution.trailingZeroes(n);
        int expected = 1151;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int n = 26;
        int actual = solution.trailingZeroes(n);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int n = 1;
        int actual = solution.trailingZeroes(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int n = -1;
        int actual = solution.trailingZeroes(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int n = 100;
        int actual = solution.trailingZeroes(n);
        int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int n = 25;
        int actual = solution.trailingZeroes(n);
        int expected = 6;
        assertEquals(expected, actual);
    }

}
