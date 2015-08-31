package _018_4Sum;

import static com.leetcode.Test.assertEqualsIgnoreOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _018_4Sum.Practice } */
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
    public void Test0() {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> actual = solution.fourSum(nums, target);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2, 0, 0, 2));
        expected.add(Arrays.asList(-1, 0, 0, 1));
        // order of sets in expected list does not matter
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test1() {
        int[] nums = { 1, -2, -5, -4, -3, 3, 3, 5 };
        int target = -11;
        List<List<Integer>> actual = solution.fourSum(nums, target);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(-5, -4, -3, 1));
        assertEqualsIgnoreOrder(expected, actual);
    }

}
