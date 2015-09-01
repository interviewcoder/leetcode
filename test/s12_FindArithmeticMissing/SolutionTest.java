package s12_FindArithmeticMissing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link s12_FindArithmeticMissing.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

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
        int[] nums = {1, 3, 7};
        int actual = solution.findMissing(nums);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = {1, 3, 7, 9};
        int actual = solution.findMissing(nums);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = {1, 3, 7, 9, 11};
        int actual = solution.findMissing(nums);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = {1, 3, 5, 9, 11, 13, 15};
        int actual = solution.findMissing(nums);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = {1, 2, 3, 5, 6, 7};
        int actual = solution.findMissing(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = {100, 300, 400};
        int actual = solution.findMissing(nums);
        int expected = 200;
        assertEquals(expected, actual);
    }

}
