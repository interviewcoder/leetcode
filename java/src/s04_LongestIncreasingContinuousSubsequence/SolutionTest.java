package s04_LongestIncreasingContinuousSubsequence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link s04_LongestIncreasingContinuousSubsequence.Solution } */
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
    public void Test1() {
        int[] A = {5, 4, 2, 1, 3};
        int actual = solution.longestIncreasingContinuousSubsequence(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] A = {5, 1, 2, 3, 4};
        int actual = solution.longestIncreasingContinuousSubsequence(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
