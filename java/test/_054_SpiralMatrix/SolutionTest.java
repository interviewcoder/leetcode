package _054_SpiralMatrix;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import _054_SpiralMatrix.Solution;

public class SolutionTest {

    /** Test method for {@link _054_SpiralMatrix.Solution } */
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
    public void Test1() {
        int[][] matrix = { 
                { 1, 2, 3 }, 
                { 4, 5, 6 }, 
                { 7, 8, 9 }         
        };
        List<Integer> actual = solution.spiralOrder(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[][] matrix = { 
                { 1, 2, 3 } 
        };
        List<Integer> actual = solution.spiralOrder(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[][] matrix = { 
                { 1 }, 
                { 2 }, 
                { 3 } 
        };
        List<Integer> actual = solution.spiralOrder(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[][] matrix = { 
                { 1, 2 },
                { 3, 4 }, 
                { 5, 6 }
        };
        List<Integer> actual = solution.spiralOrder(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 4, 6, 5, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[][] matrix = { 
                { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 } 
        };
        List<Integer> actual = solution.spiralOrder(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 7, 6, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[][] matrix = { 
                { 1, 11 }, 
                { 2, 12 }, 
                { 3, 13 }, 
                { 4, 14 },
                { 5, 15 }, 
                { 6, 16 }, 
                { 7, 17 }, 
                { 8, 18 }, 
                { 9, 19 },
                { 10, 20 }
        };
        List<Integer> actual = solution.spiralOrder(matrix);
        List<Integer> expected = Arrays.asList(1, 11, 12, 13, 14, 15, 16, 17,
                18, 19, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2);
        assertEquals(expected, actual);
    }

}
