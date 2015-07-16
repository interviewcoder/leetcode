package _081_SearchInRotatedSortedArrayII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _081_SearchInRotatedSortedArrayII.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(50);
    
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] nums = { 1, 1, 1, 1 };
        int target = 1;
        boolean actual = solution.search(nums, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 1, 1, 1 };
        int target = 2;
        boolean actual = solution.search(nums, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 1, 1, 1 };
        int target = 0;
        boolean actual = solution.search(nums, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 2, 5, 1, 1, 1, 2, 2 };
        int target = 2;
        boolean actual = solution.search(nums, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 2, 5, 1, 1, 1, 2, 2 };
        int target = 3;
        boolean actual = solution.search(nums, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = { 2, 5, 5, 7, 1, 1, 1, 2, 2 };
        int target = 5;
        boolean actual = solution.search(nums, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] nums = { 2, 5, 5, 7, 1, 1, 1, 2, 2 };
        int target = 3;
        boolean actual = solution.search(nums, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int[] nums = { 2, 5, 5, 7, 1, 1, 1, 2, 2 };
        int target = 8;
        boolean actual = solution.search(nums, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int[] nums = { 1, 1, 3, 1 };
        int target = 3;
        boolean actual = solution.search(nums, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        int[] nums = { 1, 3 };
        int target = 0;
        boolean actual = solution.search(nums, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        int[] nums = { 3, 1, 1 };
        int target = 3;
        boolean actual = solution.search(nums, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test12() {
        int[] nums = { 1, 3, 1, 1, 1 };
        int target = 3;
        boolean actual = solution.search(nums, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}