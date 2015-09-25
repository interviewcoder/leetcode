package _221_MaximalSquare;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _221_MaximalSquare.Solution } */
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
    public void Test1 () {
        char[][] matrix = {
                { '1' }
        };
        int actual = solution.maximalSquare(matrix);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2 () {
        char[][] matrix = {
                { '0' }
        };
        int actual = solution.maximalSquare(matrix);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3 () {
        char[][] matrix = {
                { '1', '1' },
                { '1', '1' },
        };
        int actual = solution.maximalSquare(matrix);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4 () {
        char[][] matrix = {
                { '1', '0', '1', '0', '0'},
                { '1', '0', '1', '1', '1'},
                { '1', '1', '1', '1', '1'},
                { '1', '0', '0', '1', '0'}
        };
        int actual = solution.maximalSquare(matrix);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5 () {
        char[][] matrix = {
                { '1', '1', '1', '1', '1', '1', '1', '1' },
                { '1', '1', '1', '1', '1', '1', '1', '0' },
                { '1', '1', '1', '1', '1', '1', '1', '0' },
                { '1', '1', '1', '1', '1', '0', '0', '0' },
                { '0', '1', '1', '1', '0', '0', '0', '0' },
        };
        int actual = solution.maximalSquare(matrix);
        int expected = 16;
        assertEquals(expected, actual);
    }

}
