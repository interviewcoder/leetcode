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
    public Timeout globalTimeout = new Timeout(2000);

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

    @Test
    public void Test2() {
        int[][] A = {
                {16,17,24,23,6},
                {15,18,25,22,7},
                {1 ,2 ,3, 4 ,5},
                {14,19,10, 7,6},
                {13,12, 9, 8,9}
        };
        int actual = solution.longestIncreasingContinuousSubsequenceII(A);
        int expected = 13;
        assertEquals(expected, actual);
    }

    //  0,1,. ...  9
    //  19,18,    10
    //  20,21,....29
    //  39,38,... 30
    //      ....
    @Test
    public void Test3() {
        int nums = 10000;
        int rows = (int) Math.sqrt(nums);
        int[][] A = new int[rows][rows];
        boolean odd = true;
        int num = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                int col = odd ? j : (rows - 1 - j);
                A[i][col] = num++;
            }
            odd = !odd;
        }
        int actual = solution.longestIncreasingContinuousSubsequenceII(A);
        int expected = nums;
        assertEquals(expected, actual);
    }

}
