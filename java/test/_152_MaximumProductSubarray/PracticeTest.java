package _152_MaximumProductSubarray;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _152_MaximumProductSubarray.Practice } */
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
        int[] nums = { 2, 3, -2, 4 };
        int actual = solution.maxProduct(nums);
        int expected = 6;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 2, 3, 2, 4 };
        int actual = solution.maxProduct(nums);
        int expected = 48;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { -2, -3, -2, -4 };
        int actual = solution.maxProduct(nums);
        int expected = 48;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 2, -3, 2, 1 };
        int actual = solution.maxProduct(nums);
        int expected = 2;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 2, -3, 2, -1 };
        int actual = solution.maxProduct(nums);
        int expected = 12;
        assertEquals(Arrays.toString(nums), expected, actual);
    }

}
