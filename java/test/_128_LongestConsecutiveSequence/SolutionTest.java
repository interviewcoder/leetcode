package _128_LongestConsecutiveSequence;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _128_LongestConsecutiveSequence.Solution } */
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
        int[] nums = { 4, 1, 3, 2 };
        int actual = solution.longestConsecutive(nums);
        int expected = 4;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test1() {
        int[] nums = {};
        int actual = solution.longestConsecutive(nums);
        int expected = 0;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 2, 3, 1000, 1001, 1002, 1003 };
        int actual = solution.longestConsecutive(nums);
        int expected = 4;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 5, 3, 2, 1 };
        int actual = solution.longestConsecutive(nums);
        int expected = 3;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

}
