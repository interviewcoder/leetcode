package _130_SurroundedRegions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _130_SurroundedRegions.Solution } */
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
        char[][] board = {};
        solution.solve(board);
        char[][] expected = {};
        assertArrayEquals(expected, board);
    }

    @Test
    public void Test1() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', '0', '0', 'X'},
                {'X', 'X', '0', 'X'},
                {'X', '0', 'X', 'X'}
        };
        solution.solve(board);
        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', '0', 'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    public void Test2() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', '0', '0', 'X'},
                {'X', '0', '0', 'X'},
                {'X', 'X', 'X', 'X'}
        };
        solution.solve(board);
        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    public void Test3() {
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        solution.solve(board);
        char[][] expected = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    public void Test4() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', '0', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', '0', 'X'}
        };
        solution.solve(board);
        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', '0', 'X'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    public void Test5() {
        char[][] board = {
                {'X', 'X', '0', '0'},
                {'0', 'X', 'X', 'X'},
                {'X', '0', 'X', 'X'},
                {'X', '0', '0', 'X'}
        };
        solution.solve(board);
        char[][] expected = {
                {'X', 'X', '0', '0'},
                {'0', 'X', 'X', 'X'},
                {'X', '0', 'X', 'X'},
                {'X', '0', '0', 'X'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    public void Test6() {
        char[][] board = {
                {'X', 'X', 'X'},
                {'X', '0', 'X'},
                {'X', 'X', 'X'}
        };
        solution.solve(board);
        char[][] expected = {
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }

}
