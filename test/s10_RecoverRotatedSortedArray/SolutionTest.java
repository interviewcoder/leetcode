package s10_RecoverRotatedSortedArray;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link s10_RecoverRotatedSortedArray.Solution } */
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
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 3));
        solution.recoverRotatedSortedArray(nums);
        ArrayList<Integer> exps = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(exps, nums);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 4));
        solution.recoverRotatedSortedArray(nums);
        ArrayList<Integer> exps = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(exps, nums);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        solution.recoverRotatedSortedArray(nums);
        ArrayList<Integer> exps = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(exps, nums);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 5, 1, 2));
        solution.recoverRotatedSortedArray(nums);
        ArrayList<Integer> exps = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(exps, nums);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1,
                1, 1, 1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
        solution.recoverRotatedSortedArray(nums);
        ArrayList<Integer> exps = new ArrayList<>(Arrays.asList(-1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
        assertEquals(exps, nums);
    }

}
