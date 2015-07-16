package _035_SearchInsertPosition;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _035_SearchInsertPosition.Practice } */
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
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        int actual = solution.searchInsert(nums, target);
        int expected = 2;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        int actual = solution.searchInsert(nums, target);
        int expected = 1;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        int actual = solution.searchInsert(nums, target);
        int expected = 4;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 0;
        int actual = solution.searchInsert(nums, target);
        int expected = 0;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 1 };
        int target = 0;
        int actual = solution.searchInsert(nums, target);
        int expected = 0;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = { 1 };
        int target = 1;
        int actual = solution.searchInsert(nums, target);
        int expected = 0;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test7() {
        int[] nums = { 1 };
        int target = 2;
        int actual = solution.searchInsert(nums, target);
        int expected = 1;
        assertEquals(target + " in " + Arrays.toString(nums), expected, actual);
    }
}
