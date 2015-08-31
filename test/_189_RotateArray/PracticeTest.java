package _189_RotateArray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _189_RotateArray.Practice } */
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
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 1;
        solution.rotate(nums, k);
        int[] actuals = nums;
        int[] expecteds = {6, 1, 2, 3, 4, 5};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 0;
        solution.rotate(nums, k);
        int[] actuals = nums;
        int[] expecteds = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test3() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 55;
        solution.rotate(nums, k);
        int[] actuals = nums;
        int[] expecteds = {6, 1, 2, 3, 4, 5};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test4() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 5;
        solution.rotate(nums, k);
        int[] actuals = nums;
        int[] expecteds = {2, 3, 4, 5, 6, 1};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test5() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 17;
        solution.rotate(nums, k);
        int[] actuals = nums;
        int[] expecteds = {2, 3, 4, 5, 6, 1};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test6() {
        int[] nums = {1};
        int k = 0;
        solution.rotate(nums, k);
        int[] actuals = nums;
        int[] expecteds = {1};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test7() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);
        int[] actuals = nums;
        int[] expecteds = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expecteds, actuals);
    }

}
