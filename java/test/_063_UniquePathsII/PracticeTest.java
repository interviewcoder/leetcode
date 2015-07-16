package _063_UniquePathsII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _063_UniquePathsII.Practice } */
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
        int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[][] obstacleGrid = { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[][] obstacleGrid = { { 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } };
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[][] obstacleGrid = { { 0, 0 }, { 0, 0 }, { 1, 0 } };
        int actual = solution.uniquePathsWithObstacles(obstacleGrid);
        int expected = 2;
        assertEquals(expected, actual);
    }

}
