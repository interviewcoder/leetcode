package _066_PlusOne;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method {@link _066_PlusOne.Solution} */
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
        int[] digits = { 1 };
        int[] actuals = solution.plusOne(digits);
        int[] expecteds = { 2 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[] digits = { 0 };
        int[] actuals = solution.plusOne(digits);
        int[] expecteds = { 1 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test3() {
        int[] digits = { 9 };
        int[] actuals = solution.plusOne(digits);
        int[] expecteds = { 1, 0 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test4() {
        int[] digits = { 1, 0 };
        int[] actuals = solution.plusOne(digits);
        int[] expecteds = { 1, 1 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test5() {
        int[] digits = { 1, 9 };
        int[] actuals = solution.plusOne(digits);
        int[] expecteds = { 2, 0 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test6() {
        int[] digits = { 9, 9, 9 };
        int[] actuals = solution.plusOne(digits);
        int[] expecteds = { 1, 0, 0, 0 };
        assertArrayEquals(expecteds, actuals);
    }

}
