package _080_RemoveDuplicatesFromSortedArrayII;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionGeneralTest {

    /** Test solution {@Link _080_RemoveDuplicatesFromSortedArrayII.SolutionGeneral  } */
    SolutionGeneral solution;

    @Before
    public void setUp() throws Exception {
        solution = new SolutionGeneral();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }


    @Test
    public void Test0() {
        int[] nums = { };
        int actual = solution.removeDuplicates(nums);
        int expected = 0;
        assertEquals(expected, actual);

        // the part after expected length does not matter
        int[] expecteds = { };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test1() {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 5;
        assertEquals(expected, actual);

        // the part after expected length does not matter
        int[] expecteds = { 1, 1, 2, 2, 3 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 6;
        assertEquals(expected, actual);

        int[] expecteds = { 1, 1, 2, 2, 3, 3 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 2, 3, 4, 4, 4 };
        int actual = solution.removeDuplicates(nums);
        int expected = 5;
        assertEquals(expected, actual);

        int[] expecteds = { 1, 2, 3, 4, 4 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test4() {
        int[] nums = { 1, 2, 3, 4, 4, 4, 5, 5 };
        int actual = solution.removeDuplicates(nums);
        int expected = 7;
        assertEquals(expected, actual);

        int[] expecteds = { 1, 2, 3, 4, 4, 5, 5 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test5() {
        int[] nums = { 1, 1, 1, 2, 3, 4, 5 };
        int actual = solution.removeDuplicates(nums);
        int expected = 6;
        assertEquals(expected, actual);

        int[] expecteds = { 1, 1, 2, 3, 4, 5 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test6() {
        int[] nums = { 1, 1 };
        int actual = solution.removeDuplicates(nums);
        int expected = 2;
        assertEquals(expected, actual);

        int[] expecteds = { 1, 1 };
        assertArrayEquals(expecteds, nums);
    }

    @Test
    public void Test7() {
        int[] nums = { 1, 2, 2 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        assertEquals(expected, actual);

        int[] expecteds = { 1, 2, 2 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test8() {
        int[] nums = { 1 };
        int actual = solution.removeDuplicates(nums);
        int expected = 1;
        assertEquals(expected, actual);

        int[] expecteds = { 1 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

}
