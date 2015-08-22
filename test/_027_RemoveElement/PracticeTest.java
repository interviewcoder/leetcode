package _027_RemoveElement;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _027_RemoveElement.Practice } */
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
        int[] nums = { 1, 1, 1 };
        int val = 1;
        int actual = solution.removeElement(nums, val);
        int expected = 0;
        int[] expecteds = {};
        assertEquals(Arrays.toString(nums), expected, actual);
        assertArrayEquals(expecteds, Arrays.copyOfRange(nums, 0, actual));
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 1, 1, 2, 2, 2 };
        int val = 2;
        int actual = solution.removeElement(nums, val);
        int expected = 3;
        int[] expecteds = { 1, 1, 1 };
        assertEquals(Arrays.toString(nums), expected, actual);
        assertArrayEquals(expecteds, Arrays.copyOfRange(nums, 0, actual));
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 1, 2, 3, 3, 3 };
        int val = 3;
        int actual = solution.removeElement(nums, val);
        int expected = 3;
        int[] expecteds = { 1, 1, 2 };
        assertEquals(Arrays.toString(nums), expected, actual);
        assertArrayEquals(expecteds, Arrays.copyOfRange(nums, 0, actual));
    }

    @Test
    public void Test4() {
        int[] nums = { 1, 1, 2, 3, 3, 3, 4 };
        int val = 4;
        int actual = solution.removeElement(nums, val);
        int expected = 6;
        int[] expecteds = { 1, 1, 2, 3, 3, 3 };
        assertEquals(Arrays.toString(nums), expected, actual);
        assertArrayEquals(expecteds, Arrays.copyOfRange(nums, 0, actual));
    }

    @Test
    public void Test5() {
        int[] nums = { 1, 1, 2, 3, 3, 3, 4 };
        int val = 5;
        int actual = solution.removeElement(nums, val);
        int expected = 7;
        int[] expecteds = { 1, 1, 2, 3, 3, 3, 4 };
        assertEquals(Arrays.toString(nums), expected, actual);
        assertArrayEquals(expecteds, Arrays.copyOfRange(nums, 0, actual));
    }

    @Test
    public void Test6() {
        int[] nums = {};
        int val = 0;
        int actual = solution.removeElement(nums, val);
        int expected = 0;
        int[] expecteds = {};
        assertEquals(Arrays.toString(nums), expected, actual);
        assertArrayEquals(expecteds, Arrays.copyOfRange(nums, 0, actual));
    }

    @Test
    public void Test7() {
        int[] nums = { 4, 5 };
        int val = 4;
        int actual = solution.removeElement(nums, val);
        int expected = 1;
        int[] expecteds = { 5 };
        assertEquals(Arrays.toString(nums), expected, actual);
        assertArrayEquals(expecteds, Arrays.copyOfRange(nums, 0, actual));
    }

}
