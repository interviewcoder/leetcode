package _075_SortColors;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _075_SortColors.Practice } */
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
        int[] nums = { 0, 0, 1, 2, 2 };
        solution.sortColors(nums);
        int[] expecteds = { 0, 0, 1, 2, 2 };
        assertArrayEquals(expecteds, nums);
    }

    @Test
    public void Test2() {
        int[] nums = { 2, 2, 1, 1, 0 };
        solution.sortColors(nums);
        int[] expecteds = { 0, 1, 1, 2, 2 };
        assertArrayEquals(expecteds, nums);
    }

    @Test
    public void Test3() {
        int[] nums = { 2, 0, 1, 2, 0 };
        solution.sortColors(nums);
        int[] expecteds = { 0, 0, 1, 2, 2 };
        assertArrayEquals(expecteds, nums);
    }

    @Test
    public void Test4() {
        int[] nums = { 2, 1, 2, 1 };
        solution.sortColors(nums);
        int[] expecteds = { 1, 1, 2, 2 };
        assertArrayEquals(expecteds, nums);
    }

    @Test
    public void Test5() {
        int[] nums = { 2, 1, 0, 1, 2, 1 };
        solution.sortColors(nums);
        int[] expecteds = { 0, 1, 1, 1, 2, 2 };
        assertArrayEquals(expecteds, nums);
    }

}
