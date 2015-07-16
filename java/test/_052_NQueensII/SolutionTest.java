package _052_NQueensII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _052_NQueensII.Solution } */
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
    public void Test0() {
        int n = 0;
        int actual = solution.totalNQueens(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test1() {
        int n = 1;
        int actual = solution.totalNQueens(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int n = 4;
        int actual = solution.totalNQueens(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int n = 8;
        int actual = solution.totalNQueens(n);
        int expected = 92;
        assertEquals(expected, actual);
    }

}
