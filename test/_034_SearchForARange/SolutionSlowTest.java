package _034_SearchForARange;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionSlowTest {

    /** Test method for {@link _034_SearchForARange.SolutionSlow } */
    SolutionSlow solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionSlow();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = { 3, 4 };
        assertArrayEquals(Arrays.toString(nums), expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 5;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = { 0, 0 };
        assertArrayEquals(Arrays.toString(nums), expecteds, actuals);
    }

    @Test
    public void Test3() {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 10;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = { 5, 5 };
        assertArrayEquals(Arrays.toString(nums), expecteds, actuals);
    }

    @Test
    public void Test4() {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 3;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = { -1, -1 };
        assertArrayEquals(Arrays.toString(nums), expecteds, actuals);
    }

    @Test
    public void Test5() {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = { -1, -1 };
        assertArrayEquals(Arrays.toString(nums), expecteds, actuals);
    }

    @Test
    public void Test6() {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 12;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = { -1, -1 };
        assertArrayEquals(Arrays.toString(nums), expecteds, actuals);
    }

    @Test
    public void Test7() {
        int[] nums = { 5, 7, 7, 8, 8, 10, 10, 10 };
        int target = 10;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = { 5, 7 };
        assertArrayEquals(Arrays.toString(nums), expecteds, actuals);
    }

    @Test
    public void Test8() {
        int[] nums = { 5, 5, 5, 7, 7, 8, 8, 10, 10, 10 };
        int target = 5;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = { 0, 2 };
        assertArrayEquals(Arrays.toString(nums), expecteds, actuals);
    }

    @Test
    public void Test9() {
        int[] nums = { 5, 7, 8, 8, 8, 8, 10, 10 };
        int target = 8;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = { 2, 5 };
        assertArrayEquals(Arrays.toString(nums), expecteds, actuals);
    }

    // might fail because of TLE
    @Test
    public void Test10() {
        int size = 3000000;
        int[] nums = new int[size]; 
        for (int i = 0; i < size; i++) {
            nums[i] = 1;
        }
        int target = 1;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = {0, size - 1};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test11() {
        int size = 100000;
        int[] nums = new int[size]; 
        int pos = (size - 1) / 2;
        for (int i = 0; i < pos; i++) {
            nums[i] = 2;
        }
        nums[pos] = 5;
        for (int i = pos + 1; i < size; i++) {
            nums[i] = 8;
        }
        int target = 5;
        int[] actuals = solution.searchRange(nums, target);
        int[] expecteds = {pos, pos};
        assertArrayEquals(expecteds, actuals);
    }

}
