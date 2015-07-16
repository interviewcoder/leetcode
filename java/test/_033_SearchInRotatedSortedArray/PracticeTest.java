package _033_SearchInRotatedSortedArray;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _033_SearchInRotatedSortedArray.Practice } */
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
    public void Test1() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        int actual = solution.search(nums, target);
        int expected = 6;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int actual = solution.search(nums, target);
        int expected = 4;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;
        int actual = solution.search(nums, target);
        int expected = 0;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 7;
        int actual = solution.search(nums, target);
        int expected = 3;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        int actual = solution.search(nums, target);
        int expected = 5;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = { 1, 2, 3 };
        int target = 1;
        int actual = solution.search(nums, target);
        int expected = 0;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test7() {
        int[] nums = { 1, 2, 3 };
        int target = 2;
        int actual = solution.search(nums, target);
        int expected = 1;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test8() {
        int[] nums = { 1, 2, 3 };
        int target = 3;
        int actual = solution.search(nums, target);
        int expected = 2;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test9() {
        int[] nums = { 6, 4, 5 };
        int target = 6;
        int actual = solution.search(nums, target);
        int expected = 0;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test10() {
        int[] nums = { 6, 4, 5 };
        int target = 4;
        int actual = solution.search(nums, target);
        int expected = 1;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test11() {
        int[] nums = { 6, 4, 5 };
        int target = 5;
        int actual = solution.search(nums, target);
        int expected = 2;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test12() {
        int[] nums = { 6, 4, 5 };
        int target = 8;
        int actual = solution.search(nums, target);
        int expected = -1;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test13() {
        int[] nums = { 6, 4, 5 };
        int target = 3;
        int actual = solution.search(nums, target);
        int expected = -1;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }
}
