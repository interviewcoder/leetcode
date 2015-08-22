package _240_SearchA2DMatrixII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _240_SearchA2DMatrixII.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

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
        int[][] matrix = { 
                { 1, 4, 7, 11, 15 }, 
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 }, 
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } 
        };
        int target = 5;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[][] matrix = { 
                {  1,  4,  7, 11, 15 }, 
                {  2,  5,  8, 12, 19 },
                {  3,  6,  9, 16, 22 }, 
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } 
        };
        int target = 20;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[][] matrix = { 
                {  1,  4,  7, 11, 15 }, 
                {  2,  5,  8, 12, 19 },
                {  3,  6,  9, 16, 22 }, 
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } 
        };
        int target = 15;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[][] matrix = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        int target = 19;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}
