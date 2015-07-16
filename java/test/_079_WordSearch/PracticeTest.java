package _079_WordSearch;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _079_WordSearch.Practice } */
    Practice solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

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
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        boolean actual = solution.exist(board, word);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' } };
        String word = "SEE";
        boolean actual = solution.exist(board, word);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' } };
        String word = "ABCB";
        boolean actual = solution.exist(board, word);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        char[][] board = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' },
                { 'G', 'H', 'I' } };
        String word = "BEDGH";
        boolean actual = solution.exist(board, word);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        char[][] board = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' },
                { 'G', 'H', 'I' } };
        String word = "BEDGI";
        boolean actual = solution.exist(board, word);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
