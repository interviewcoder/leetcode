package _213_HouseRobberII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _213_HouseRobberII.Solution } */
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
        int[] nums = {1};
        int actual = solution.rob(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = {1, 2, 3};
        int actual = solution.rob(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = {1, 3, 4, 3};
        int actual = solution.rob(nums);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int actual = solution.rob(nums);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int actual = solution.rob(nums);
        int expected = 15;
        assertEquals(expected, actual);
    }

}
