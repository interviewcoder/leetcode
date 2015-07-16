package _080_RemoveDuplicatesFromSortedArrayII;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionGeneralTest {

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
    public void Test1() {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 5;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 1, 2, 2, 3 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3 };
        int actual = solution.removeDuplicates(nums);
        int expected = 6;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 1, 2, 2, 3, 3 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 2, 3, 4, 4, 4 };
        int actual = solution.removeDuplicates(nums);
        int expected = 5;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 2, 3, 4, 4 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test4() {
        int[] nums = { 1, 2, 3, 4, 4, 4, 5, 5 };
        int actual = solution.removeDuplicates(nums);
        int expected = 7;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 2, 3, 4, 4, 5, 5 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test5() {
        int[] nums = { 1, 1, 1, 2, 3, 4, 5 };
        int actual = solution.removeDuplicates(nums);
        int expected = 6;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 1, 2, 3, 4, 5 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test6() {
        int[] nums = { 1, 1 };
        int actual = solution.removeDuplicates(nums);
        int expected = 2;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 1 };
        assertArrayEquals(expecteds, nums);
    }

    @Test
    public void Test7() {
        int[] nums = { 1, 2, 2 };
        int actual = solution.removeDuplicates(nums);
        int expected = 3;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 2, 2 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test8() {
        int[] nums = { 1, 1, 1, 1, 2, 2 };
        int actual = solution.removeDuplicates(nums);
        int expected = 4;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 1, 2, 2 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test9() {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int actual = solution.removeDuplicatesAtMostKDuplicates(nums, 2);
        int expected = 5;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 1, 2, 2, 3 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test10() {
        int[] nums = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3 };
        int actual = solution.removeDuplicatesAtMostKDuplicates(nums, 4);
        int expected = 12;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test11() {
        int[] nums = { 1, 2, 2, 2, 2, 2, 2, 3, 4, 4, 4 };
        int actual = solution.removeDuplicatesAtMostKDuplicates(nums, 4);
        int expected = 9;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 2, 2, 2, 2, 3, 4, 4, 4 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test12() {
        int[] nums = { 1, 2, 3, 4, 4, 4, 5, 5, 5, 5 };
        int actual = solution.removeDuplicatesAtMostKDuplicates(nums, 3);
        int expected = 9;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 2, 3, 4, 4, 4, 5, 5, 5 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

    @Test
    public void Test13() {
        int[] nums = { 1, 1, 1, 1, 2, 3, 4, 5 };
        int actual = solution.removeDuplicatesAtMostKDuplicates(nums, 3);
        int expected = 7;
        assertEquals(Arrays.toString(nums), expected, actual);

        int[] expecteds = { 1, 1, 1, 2, 3, 4, 5 };
        assertArrayEquals(expecteds, Arrays.copyOf(nums, actual));
    }

}
