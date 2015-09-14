package _268_MissingNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionSwapTest {

    /** Test method for {@link _268_MissingNumber.SolutionSwap } */
    SolutionSwap solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionSwap();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] nums = { 0, 1, 3 };
        int actual = solution.missingNumber(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 2, 3, 1 };
        int actual = solution.missingNumber(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 0, 2, 3, 1 };
        int actual = solution.missingNumber(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 2, 0 };
        int actual = solution.missingNumber(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
