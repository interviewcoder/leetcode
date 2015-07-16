package _053_MaximumSubarray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _053_MaximumSubarray.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(100);

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
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // [4, -1, 2, 1] -> 6
        int expected = 6;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 3, 2, 1 };
        // [3, 2, 1] -> 6
        int expected = 6;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { -3, -2, -1 };
        // [-1] -> -1
        int expected = -1;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { -3, 2, -2 };
        // [2] -> -1
        int expected = 2;
        int actual = solution.maxSubArray(nums);
        assertEquals(expected, actual);
    }

}
