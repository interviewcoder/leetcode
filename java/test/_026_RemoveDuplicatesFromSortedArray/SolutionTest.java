package _026_RemoveDuplicatesFromSortedArray;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _026_RemoveDuplicatesFromSortedArray.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

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
        int[] nums = { 1, 1, 2 };
        int actual = solution.removeDuplicates(nums);
        int expected = 2;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 1, 2, 2, 2, 3, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 2, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 1, 2, 3, 3, 3, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 1, 2, 2, 2, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = {};
        int actual = solution.removeDuplicates(nums);
        int expected = 0;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

}
