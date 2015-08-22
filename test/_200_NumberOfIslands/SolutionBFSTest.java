package _200_NumberOfIslands;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionBFSTest {

    /** Test method for {@link _200_NumberOfIslands.SolutionBFS } */
    SolutionBFS solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionBFS();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        char[][] grid = { { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' } };
        int actual = solution.numIslands(grid);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        char[][] grid = { { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' } };
        int actual = solution.numIslands(grid);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        char[][] grid = { { '1' } };
        int actual = solution.numIslands(grid);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        char[][] grid = { { '0' } };
        int actual = solution.numIslands(grid);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        char[][] grid = { { '1' }, { '1' }, { '1' }, { '1' }, { '1' } };
        int actual = solution.numIslands(grid);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        char[][] grid = { { '1' }, { '0' }, { '1' }, { '0' }, { '0' } };
        int actual = solution.numIslands(grid);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        char[][] grid = { { '1', '1', '0', '1' } };
        int actual = solution.numIslands(grid);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        String[] strs = { 
                "10011101100000000000", 
                "10011001000101010010",
                "00011110101100001010", 
                "00011001000111001001",
                "00000001110000000000", 
                "10000101011000000101",
                "00010001010101010101", 
                "00010100110101101110",
                "00001001100001000101", 
                "00100100000100100010",
                "10010000000100101010", 
                "01000101011011101100",
                "11010000100000010001", 
                "01001110001111101000",
                "00111000110001010000", 
                "10010100001000101011",
                "10100000010001010000", 
                "01100011101010111100",
                "01000011001010010011", 
                "00000011110100011000" 
        };
        char[][] grid = new char[strs.length][strs[0].length()];
        int row = 0;
        int col = 0;
        for (String string : strs) {
            for (char ch : string.toCharArray()) {
                grid[row][col++] = ch;
            }
            row++;
            col = 0;
        }
        int actual = solution.numIslands(grid);
        int expected = 58;
        assertEquals(expected, actual);
    }

}
