package _215_KthLargestElementInAnArray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import _215_KthLargestElementInAnArray.Solution;

public class SolutionTest {

    /** Test method for {@link _215_KthLargestElementInAnArray.Solution } */
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
        int[] nums = { 60, 94, 63, 3, 86, 40, 93, 36, 56, 48, 17, 10, 23, 43,
                77, 1, 1, 93, 79, 4, 10, 47, 1, 99, 91, 53, 99, 18, 52, 61, 84,
                10, 13, 52, 3, 9, 78, 16, 7, 6 };
        int k = 18;
        int actual = solution.findKthLargest(nums, k);
        int expected = 52;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 2, 1, 4, 3, 2 };
        int k = 3;
        int actual = solution.findKthLargest(nums, k);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 2, 1 };
        int k = 1;
        int actual = solution.findKthLargest(nums, k);
        int expected = 2;
        assertEquals(expected, actual);
    }

}
