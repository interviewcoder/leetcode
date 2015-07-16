package _073_SetMatrixZeroes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _073_SetMatrixZeroes.Solution } */
    Solution solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

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
        int[][] matrix = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };
        solution.setZeroes(matrix);
        int[][] expecteds = { { 1, 0, 3 }, { 0, 0, 0 }, { 7, 0, 9 } };
        assertArrayEquals(expecteds, matrix);
    }

    @Test
    public void Test2() {
        int[][] matrix = { { 0, 2, 3 }, { 4, 0, 6 }, { 7, 8, 0 } };
        solution.setZeroes(matrix);
        int[][] expecteds = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        assertArrayEquals(expecteds, matrix);
    }

    @Test
    public void Test3() {
        int[][] matrix = { { 0, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        solution.setZeroes(matrix);
        int[][] expecteds = { { 0, 0, 0 }, { 0, 5, 6 }, { 0, 8, 9 } };
        assertArrayEquals(expecteds, matrix);
    }

    @Test
    public void Test4() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 } };
        solution.setZeroes(matrix);
        int[][] expecteds = { { 1, 2, 0 }, { 4, 5, 0 }, { 0, 0, 0 } };
        assertArrayEquals(expecteds, matrix);
    }

    @Test
    public void Test5() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 0 }, { 7, 0, 9 } };
        solution.setZeroes(matrix);
        int[][] expecteds = { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        assertArrayEquals(expecteds, matrix);
    }

}
