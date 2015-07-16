package _051_NQueens;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _051_NQueens.Solution } */
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
        int n = 0;
        List<String[]> actual = solution.solveNQueens(n);
        List<String[]> expected = new ArrayList<String[]>();
        assertArrayEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test1() {
        int n = 1;
        List<String[]> actual = solution.solveNQueens(n);
        List<String[]> expected = new ArrayList<String[]>();
        String[] s1 = { "Q" };
        expected.add(s1);
        assertArrayEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        int n = 4;
        List<String[]> actual = solution.solveNQueens(n);
        List<String[]> expected = new ArrayList<String[]>();
        String[] s1 = { ".Q..", "...Q", "Q...", "..Q." };
        String[] s2 = { "..Q.", "Q...", "...Q", ".Q.." };
        expected.add(s1);
        expected.add(s2);
        assertArrayEqualsIgnoreOrder(expected, actual);
    }

}
