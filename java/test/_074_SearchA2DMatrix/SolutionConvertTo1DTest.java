package _074_SearchA2DMatrix;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionConvertTo1DTest {

    /** Test method for {@link _074_SearchA2DMatrix.SolutionConvertTo1D } */
    SolutionConvertTo1D solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionConvertTo1D();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } };
        int target = 3;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } };
        int target = 100;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } };
        int target = 15;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } };
        int target = 30;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } };
        int target = 0;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } };
        int target = 10;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}
