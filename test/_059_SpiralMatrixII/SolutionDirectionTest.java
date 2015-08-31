package _059_SpiralMatrixII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionDirectionTest {

    /** Test method for {@link _059_SpiralMatrixII.SolutionDirection } */
    SolutionDirection solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionDirection();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int n = 0;
        int[][] actuals = solution.generateMatrix(n);
        int[][] expecteds = {};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int n = 1;
        int[][] actuals = solution.generateMatrix(n);
        int[][] expecteds = { 
                { 1 } 
        };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int n = 2;
        int[][] actuals = solution.generateMatrix(n);
        int[][] expecteds = { 
                { 1, 2 }, 
                { 4, 3 } 
        };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test3() {
        int n = 3;
        int[][] actuals = solution.generateMatrix(n);
        int[][] expecteds = { 
                { 1, 2, 3 }, 
                { 8, 9, 4 }, 
                { 7, 6, 5 } 
        };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test4() {
        int n = 4;
        int[][] actuals = solution.generateMatrix(n);
        int[][] expecteds = { 
                { 1, 2, 3, 4 }, 
                { 12, 13, 14, 5 },
                { 11, 16, 15, 6 }, 
                { 10, 9, 8, 7 } 
        };
        assertArrayEquals(expecteds, actuals);
    }

}
