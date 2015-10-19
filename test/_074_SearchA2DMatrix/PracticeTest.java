package _074_SearchA2DMatrix;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _074_SearchA2DMatrix.Practice } */
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
                {  1,  3,  5,  7 }, 
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } 
        };
        int target = 3;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[][] matrix = { 
                {  1,  3,  5,  7 }, 
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } 
        };
        int target = 100;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[][] matrix = { 
                {  1,  3,  5,  7 }, 
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } 
        };
        int target = 15;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[][] matrix = { 
                {  1,  3,  5,  7 }, 
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } 
        };
        int target = 30;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[][] matrix = { 
                {  1,  3,  5,  7 }, 
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } 
        };
        int target = 0;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[][] matrix = { 
                {  1,  3,  5,  7 }, 
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 } 
        };
        int target = 10;
        boolean actual = solution.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[][] matrix = { {  1,  3,  5,  7 } };
        int target = 10;
        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test8() {
        int[][] matrix = { {  1,  3,  5,  7 } };
        int target = 7;
        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test9() {
        int[][] matrix = { {  1,  3,  5,  7 } };
        int target = 1;
        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test10() {
        int[][] matrix = { {  1,  3,  5,  7 } };
        int target = 4;
        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test11() {
        int[][] matrix = { {  1,  3,  5,  7 } };
        int target = 5;
        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test12() {
        int[][] matrix = { 
                { 1 },
                { 5 },
                { 9 },
        };
        int target = 9;
        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test13() {
        int[][] matrix = { 
                { 1 },
                { 5 },
                { 9 },
        };
        int target = 1;
        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test14() {
        int[][] matrix = { 
                { 1 },
                { 5 },
                { 9 },
        };
        int target = 5;
        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test15() {
        int[][] matrix = { 
                { 1 },
                { 5 },
                { 9 },
        };
        int target = 18;
        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test16() {
        int[][] matrix = { 
                { 1 },
                { 5 },
                { 9 },
        };
        int target = 0;
        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test17() {
        int[][] matrix = { 
                { 1 },
                { 5 },
                { 9 },
        };
        int target = 3;
        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    public void Test18() {
        int[][] matrix = { 
                { 1 },
                { 5 },
                { 9 },
        };
        int target = 7;
        assertFalse(solution.searchMatrix(matrix, target));
    }

}