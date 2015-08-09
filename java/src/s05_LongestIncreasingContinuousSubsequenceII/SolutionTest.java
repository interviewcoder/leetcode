package s05_LongestIncreasingContinuousSubsequenceII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /**
     * Test method for
     * {@link s05_LongestIncreasingContinuousSubsequenceII.Solution }
     */
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
        int[][] A = {
                {1 ,2 ,3 ,4 ,5},
                {16,17,24,23,6},
                {15,18,25,22,7},
                {14,19,20,21,8},
                {13,12,11,10,9}
        };
        int actual = solution.longestIncreasingContinuousSubsequenceII(A);
        int expected = 25;
        assertEquals(expected, actual);
    }

}
