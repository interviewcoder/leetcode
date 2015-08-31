package _062_UniquePaths;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Solution1DTest {
    
    /** Test method for {@link _062_UniquePaths.Solution1D } */
    Solution1D solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution1D();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int m = 1;
        int n = 1;
        int actual = solution.uniquePaths(m, n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int m = 1;
        int n = 2;
        int actual = solution.uniquePaths(m, n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int m = 2;
        int n = 2;
        int actual = solution.uniquePaths(m, n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int m = 3;
        int n = 2;
        int actual = solution.uniquePaths(m, n);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int m = 3;
        int n = 1;
        int actual = solution.uniquePaths(m, n);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
