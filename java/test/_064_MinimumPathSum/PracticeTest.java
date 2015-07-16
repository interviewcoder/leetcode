package _064_MinimumPathSum;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _064_MinimumPathSum.Practice } */
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
    public void Test1() {
        int[][] grid = { { 1 } };
        int actual = solution.minPathSum(grid);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[][] grid = { { 1, 1 }, { 3, 1 } };
        int actual = solution.minPathSum(grid);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[][] grid = { { 1, 1, 3 }, { 4, 1, 1 } };
        int actual = solution.minPathSum(grid);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[][] grid = { { 1, 2, 3 }, { 1, 1, 8 }, { 4, 1, 1 }, { 4, 8, 1 } };
        int actual = solution.minPathSum(grid);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[][] grid = { { 1, 2, 3, 2, 1 } };
        int actual = solution.minPathSum(grid);
        int expected = 9;
        assertEquals(expected, actual);
    }

}
