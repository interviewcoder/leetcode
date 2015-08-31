package _048_RotateImage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _048_RotateImage.Solution } */
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
    public void Test0() {
        int[][] matrix = { { 1 } };
        solution.rotate(matrix);
        int[][] expected = { { 1 } };
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void Test1() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        solution.rotate(matrix);
        int[][] expected = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
        // printMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void Test2() {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        solution.rotate(matrix);
        int[][] expected = { { 13, 9, 5, 1 }, { 14, 10, 6, 2 },
                { 15, 11, 7, 3 }, { 16, 12, 8, 4 } };
        // printMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void Test3() {
        int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        solution.rotate(matrix);
        int[][] expected = { { 21, 16, 11, 6, 1 }, { 22, 17, 12, 7, 2 },
                { 23, 18, 13, 8, 3 }, { 24, 19, 14, 9, 4 },
                { 25, 20, 15, 10, 5 } };
        // printMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void Test4() {
        int[][] matrix = { { 2, 29, 20, 26, 16, 28 },
                { 12, 27, 9, 25, 13, 21 }, { 32, 33, 32, 2, 28, 14 },
                { 13, 14, 32, 27, 22, 26 }, { 33, 1, 20, 7, 21, 7 },
                { 4, 24, 1, 6, 32, 34 } };
        solution.rotate(matrix);
        int[][] expected = { { 4, 33, 13, 32, 12, 2 },
                { 24, 1, 14, 33, 27, 29 }, { 1, 20, 32, 32, 9, 20 },
                { 6, 7, 27, 2, 25, 26 }, { 32, 21, 22, 28, 13, 16 },
                { 34, 7, 26, 14, 21, 28 } };
        // printMatrix(matrix);
        // System.out.println("=============");
        // printMatrix(expected);
        assertArrayEquals(expected, matrix);
    }

    public void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
