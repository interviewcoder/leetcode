package _037_SudokuSolver;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _037_SudokuSolver.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

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
        char[][] board = {
                // 0 1 2 3 4 5 6 7 8
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, // 0
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, // 1
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, // 2
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, // 3
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, // 4
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, // 5
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, // 6
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, // 7
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } // 8
        };

        char[][] expecteds = {
                // 0 1 2 3 4 5 6 7 8
                { '5', '3', '4', '6', '7', '8', '9', '1', '2' }, // 0
                { '6', '7', '2', '1', '9', '5', '3', '4', '8' }, // 1
                { '1', '9', '8', '3', '4', '2', '5', '6', '7' }, // 2
                { '8', '5', '9', '7', '6', '1', '4', '2', '3' }, // 3
                { '4', '2', '6', '8', '5', '3', '7', '9', '1' }, // 4
                { '7', '1', '3', '9', '2', '4', '8', '5', '6' }, // 5
                { '9', '6', '1', '5', '3', '7', '2', '8', '4' }, // 6
                { '2', '8', '7', '4', '1', '9', '6', '3', '5' }, // 7
                { '3', '4', '5', '2', '8', '6', '1', '7', '9' } // 8
        };

        solution.solveSudoku(board);

        assertArrayEquals(expecteds, board);

    }

}
