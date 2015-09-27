package _026_RemoveDuplicatesFromSortedArray;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _026_RemoveDuplicatesFromSortedArray.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

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
        int[] nums = { 1, 1, 2 };
        int actual = solution.removeDuplicates(nums);
        int expected = 2;
        int[] exps = { 1, 2 };
        assertEquals(actual, expected);
        assertArrayEquals(exps, Arrays.copyOfRange(nums, 0, expected));
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 1, 2, 2, 2, 3, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        int[] exps = { 1, 2, 3 };
        assertEquals(actual, expected);
        assertArrayEquals(exps, Arrays.copyOfRange(nums, 0, expected));
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 2, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        int[] exps = { 1, 2, 3 };
        assertEquals(actual, expected);
        assertArrayEquals(exps, Arrays.copyOfRange(nums, 0, expected));
    }

    @Test
    public void Test4() {
        int[] nums = { 1, 2, 3, 3, 3, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        int[] exps = { 1, 2, 3 };
        assertEquals(actual, expected);
        assertArrayEquals(exps, Arrays.copyOfRange(nums, 0, expected));
    }

    @Test
    public void Test5() {
        int[] nums = { 1, 2, 2, 2, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        int[] exps = { 1, 2, 3 };
        assertEquals(actual, expected);
        assertArrayEquals(exps, Arrays.copyOfRange(nums, 0, expected));
    }

    @Test
    public void Test6() {
        int[] nums = { };
        int actual = solution.removeDuplicates(nums);
        int expected = 0;
        int[] exps = { };
        assertEquals(actual, expected);
        assertArrayEquals(exps, Arrays.copyOfRange(nums, 0, expected));
    }

    @Test
    public void Test7() {
        int[] nums = { 10, 20, 20, 30, 40, 40, 50};
        int actual = solution.removeDuplicates(nums);
        int expected = 5;
        int[] exps = { 10, 20, 30, 40, 50 };
        assertEquals(actual, expected);
        assertArrayEquals(exps, Arrays.copyOfRange(nums, 0, expected));
    }

}
