package _162_FindPeakElement;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _162_FindPeakElement.Solution } */
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
        int[] nums = { 1, 2, 0 };
        int actual = solution.findPeakElement(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test1() {
        int[] nums = { 1, 2, 3, 1 };
        int actual = solution.findPeakElement(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 2, 3, 4, 10, 9, 5, 9, 5, 9, 5, 10, 9, 8, 7, 5 };
        int actual = solution.findPeakElement(nums);
        Set<Integer> exps = new HashSet<>(Arrays.asList(4, 7, 9, 11));
        assertTrue(exps.contains(actual));
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 2, 1, 3, 4, 5, 7, 6 };
        int actual = solution.findPeakElement(nums);
        Set<Integer> exps = new HashSet<>(Arrays.asList(1, 6));
        assertTrue(exps.contains(actual));
    }

    @Test
    public void Test4() {
        int[] nums = { 1, 10, 9, 8, 7, 6, 5, 4 };
        int actual = solution.findPeakElement(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 1 };
        int actual = solution.findPeakElement(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = { 1, 2 };
        int actual = solution.findPeakElement(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] nums = { 2, 1 };
        int actual = solution.findPeakElement(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
