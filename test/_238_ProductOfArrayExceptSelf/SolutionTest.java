package _238_ProductOfArrayExceptSelf;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _238_ProductOfArrayExceptSelf.Solution } */
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
        int[] nums = { 1, 2, 3, 4 };
        int[] actuals = solution.productExceptSelf(nums);
        int[] expecteds = { 24, 12, 8, 6 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 2 };
        int[] actuals = solution.productExceptSelf(nums);
        int[] expecteds = { 2, 1 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test3() {
        int[] nums = { 6 };
        int[] actuals = solution.productExceptSelf(nums);
        int[] expecteds = { 1 };
        assertArrayEquals(expecteds, actuals);
    }

}
