package _239_SlidingWindowMaximum;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _239_SlidingWindowMaximum.Solution } */
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
        int[] nums = { };
        int k = 0;
        int[] actuals = solution.maxSlidingWindow(nums, k);
        int[] expecteds = { };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] actuals = solution.maxSlidingWindow(nums, k);
        int[] expecteds = {3, 3, 5, 5, 6, 7};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[] nums = { 3 };
        int k = 1;
        int[] actuals = solution.maxSlidingWindow(nums, k);
        int[] expecteds = { 3 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test3() {
        int[] nums = {1, -1};
        int k = 1;
        int[] actuals = solution.maxSlidingWindow(nums, k);
        int[] expecteds = {1, -1};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test4() {
        int[] nums = {1,3,1,2,0,5};
        int k = 3;
        int[] actuals = solution.maxSlidingWindow(nums, k);
        int[] expecteds = {3, 3, 2, 5};
        assertArrayEquals(expecteds, actuals);
    }

}
