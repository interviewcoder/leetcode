package _001_TwoSum;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _001_TwoSum.Practice } */
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
    public void Test0() {
        int[] nums = { 2, 7, 11, 13 };
        int target = 9;
        int[] actuals = solution.twoSum(nums, target);
        int[] expecteds = { 1, 2 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[] nums = { 13, 7, 11, 2 };
        int target = 9;
        int[] actuals = solution.twoSum(nums, target);
        int[] expecteds = { 2, 4 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test4() {
        int[] nums = { 13, 11, 7, 2 };
        int target = 9;
        int[] actuals = solution.twoSum(nums, target);
        int[] expecteds = { 3, 4 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test5() {
        int[] nums = { 13, 11, 7, 2 };
        int target = 24;
        int[] actuals = solution.twoSum(nums, target);
        int[] expecteds = { 1, 2 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test6() {
        int[] nums = { 13, 11, 7, 2 };
        int target = 15;
        int[] actuals = solution.twoSum(nums, target);
        int[] expecteds = { 1, 4 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test7() {
        int[] nums = { 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9,
                4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 };
        int target = -3;
        int[] actuals = solution.twoSum(nums, target);
        int[] expecteds = { 6, 8 };
        assertArrayEquals(expecteds, actuals);
    }

}
