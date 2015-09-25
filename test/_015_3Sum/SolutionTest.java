package _015_3Sum;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _015_3Sum.Solution } */
    Solution solution;
    
    @Rule
    public Timeout globalTimeout =  new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> actual = solution.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        // compare 2d list ignoring order
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test1() {
        int[] nums = { -1, -6, -3, -7, -4, -4, 0, 3, -2, -10, -10, 9 };
        List<List<Integer>> actual = solution.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(-2, -1, 3));
        expected.add(Arrays.asList(-7, -2, 9));
        expected.add(Arrays.asList(-6, -3, 9));
        expected.add(Arrays.asList(-3, 0, 3));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test(timeout=100)
    public void Test2() {
        int[] nums = { 5, -11, -7, -2, 4, 9, 4, 4, -5, 12, 12, -14, -5, 3, -3,
                -2, -6, 3, 3, -9, 4, -13, 6, 2, 11, 12, 10, -14, -15, 11, 0, 5,
                8, 0, 10, -11, -6, -1, 0, 4, -4, -3, 5, -2, -15, 9, 11, -13,
                -2, -8, -7, 9, -6, 7, -11, 12, 4, 14, 6, -4, 3, -9, -14, -12,
                -2, 3, -8, 7, -13, 7, -12, -9, 11, 0, 4, 12, -6, -7, 14, -1, 0,
                14, -6, 1, 6, -2, -9, -4, -11, 12, -1, -1, 10, -7, -6, -7, 11,
                1, -15, 6, -15, -12, 12, 12, 3, 1, 9, 12, 9, 0, -11, -14, -1 };
        List<List<Integer>> actual = solution.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(-15, 1, 14));
        expected.add(Arrays.asList(-15, 3, 12));
        expected.add(Arrays.asList(-15, 4, 11));
        expected.add(Arrays.asList(-15, 5, 10));
        expected.add(Arrays.asList(-15, 6, 9));
        expected.add(Arrays.asList(-15, 7, 8));

        expected.add(Arrays.asList(-14, 0, 14));
        expected.add(Arrays.asList(-14, 2, 12));
        expected.add(Arrays.asList(-14, 3, 11));
        expected.add(Arrays.asList(-14, 4, 10));
        expected.add(Arrays.asList(-14, 5, 9));
        expected.add(Arrays.asList(-14, 6, 8));
        expected.add(Arrays.asList(-14, 7, 7));

        expected.add(Arrays.asList(-13, -1, 14));
        expected.add(Arrays.asList(-13, 1, 12));
        expected.add(Arrays.asList(-13, 2, 11));
        expected.add(Arrays.asList(-13, 3, 10));
        expected.add(Arrays.asList(-13, 4, 9));
        expected.add(Arrays.asList(-13, 5, 8));
        expected.add(Arrays.asList(-13, 6, 7));

        expected.add(Arrays.asList(-12, -2, 14));
        expected.add(Arrays.asList(-12, 0, 12));
        expected.add(Arrays.asList(-12, 1, 11));
        expected.add(Arrays.asList(-12, 2, 10));
        expected.add(Arrays.asList(-12, 3, 9));
        expected.add(Arrays.asList(-12, 4, 8));
        expected.add(Arrays.asList(-12, 5, 7));
        expected.add(Arrays.asList(-12, 6, 6));

        expected.add(Arrays.asList(-11, -3, 14));
        expected.add(Arrays.asList(-11, -1, 12));
        expected.add(Arrays.asList(-11, 0, 11));
        expected.add(Arrays.asList(-11, 1, 10));
        expected.add(Arrays.asList(-11, 2, 9));
        expected.add(Arrays.asList(-11, 3, 8));
        expected.add(Arrays.asList(-11, 4, 7));
        expected.add(Arrays.asList(-11, 5, 6));

        expected.add(Arrays.asList(-9, -5, 14));
        expected.add(Arrays.asList(-9, -3, 12));
        expected.add(Arrays.asList(-9, -2, 11));
        expected.add(Arrays.asList(-9, -1, 10));
        expected.add(Arrays.asList(-9, 0, 9));
        expected.add(Arrays.asList(-9, 1, 8));
        expected.add(Arrays.asList(-9, 2, 7));
        expected.add(Arrays.asList(-9, 3, 6));
        expected.add(Arrays.asList(-9, 4, 5));

        expected.add(Arrays.asList(-8, -6, 14));
        expected.add(Arrays.asList(-8, -4, 12));
        expected.add(Arrays.asList(-8, -3, 11));
        expected.add(Arrays.asList(-8, -2, 10));
        expected.add(Arrays.asList(-8, -1, 9));
        expected.add(Arrays.asList(-8, 0, 8));
        expected.add(Arrays.asList(-8, 1, 7));
        expected.add(Arrays.asList(-8, 2, 6));
        expected.add(Arrays.asList(-8, 3, 5));
        expected.add(Arrays.asList(-8, 4, 4));

        expected.add(Arrays.asList(-7, -7, 14));
        expected.add(Arrays.asList(-7, -5, 12));
        expected.add(Arrays.asList(-7, -4, 11));
        expected.add(Arrays.asList(-7, -3, 10));
        expected.add(Arrays.asList(-7, -2, 9));
        expected.add(Arrays.asList(-7, -1, 8));
        expected.add(Arrays.asList(-7, 0, 7));
        expected.add(Arrays.asList(-7, 1, 6));
        expected.add(Arrays.asList(-7, 2, 5));
        expected.add(Arrays.asList(-7, 3, 4));

        expected.add(Arrays.asList(-6, -6, 12));
        expected.add(Arrays.asList(-6, -5, 11));
        expected.add(Arrays.asList(-6, -4, 10));
        expected.add(Arrays.asList(-6, -3, 9));
        expected.add(Arrays.asList(-6, -2, 8));
        expected.add(Arrays.asList(-6, -1, 7));
        expected.add(Arrays.asList(-6, 0, 6));
        expected.add(Arrays.asList(-6, 1, 5));
        expected.add(Arrays.asList(-6, 2, 4));
        expected.add(Arrays.asList(-6, 3, 3));

        expected.add(Arrays.asList(-5, -5, 10));
        expected.add(Arrays.asList(-5, -4, 9));
        expected.add(Arrays.asList(-5, -3, 8));
        expected.add(Arrays.asList(-5, -2, 7));
        expected.add(Arrays.asList(-5, -1, 6));
        expected.add(Arrays.asList(-5, 0, 5));
        expected.add(Arrays.asList(-5, 1, 4));
        expected.add(Arrays.asList(-5, 2, 3));

        expected.add(Arrays.asList(-4, -4, 8));
        expected.add(Arrays.asList(-4, -3, 7));
        expected.add(Arrays.asList(-4, -2, 6));
        expected.add(Arrays.asList(-4, -1, 5));
        expected.add(Arrays.asList(-4, 0, 4));
        expected.add(Arrays.asList(-4, 1, 3));

        expected.add(Arrays.asList(-3, -3, 6));
        expected.add(Arrays.asList(-3, -2, 5));
        expected.add(Arrays.asList(-3, -1, 4));
        expected.add(Arrays.asList(-3, 0, 3));
        expected.add(Arrays.asList(-3, 1, 2));

        expected.add(Arrays.asList(-2, -2, 4));
        expected.add(Arrays.asList(-2, -1, 3));
        expected.add(Arrays.asList(-2, 0, 2));
        expected.add(Arrays.asList(-2, 1, 1));

        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        expected.add(Arrays.asList(0, 0, 0));

        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test(timeout=100)
    public void Test3() {
        int[] nums = { 7, -1, 14, -12, -8, 7, 2, -15, 8, 8, -8, -14, -4, -5, 7,
                9, 11, -4, -15, -6, 1, -14, 4, 3, 10, -5, 2, 1, 6, 11, 2, -2,
                -5, -7, -6, 2, -15, 11, -6, 8, -4, 2, 1, -1, 4, -6, -15, 1, 5,
                -15, 10, 14, 9, -8, -6, 4, -6, 11, 12, -15, 7, -1, -9, 9, -1,
                0, -4, -1, -12, -2, 14, -9, 7, 0, -3, -4, 1, -2, 12, 14, -10,
                0, 5, 14, -1, 14, 3, 8, 10, -8, 8, -5, -2, 6, -11, 12, 13, -7,
                -12, 8, 6, -13, 14, -2, -5, -11, 1, 3, -6 };
        List<List<Integer>> actual = solution.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();

        expected.add(Arrays.asList(-15, 1, 14));
        expected.add(Arrays.asList(-15, 2, 13));
        expected.add(Arrays.asList(-15, 3, 12));
        expected.add(Arrays.asList(-15, 4, 11));
        expected.add(Arrays.asList(-15, 5, 10));
        expected.add(Arrays.asList(-15, 6, 9));
        expected.add(Arrays.asList(-15, 7, 8));

        expected.add(Arrays.asList(-14, 0, 14));
        expected.add(Arrays.asList(-14, 1, 13));
        expected.add(Arrays.asList(-14, 2, 12));
        expected.add(Arrays.asList(-14, 3, 11));
        expected.add(Arrays.asList(-14, 4, 10));
        expected.add(Arrays.asList(-14, 5, 9));
        expected.add(Arrays.asList(-14, 6, 8));
        expected.add(Arrays.asList(-14, 7, 7));

        expected.add(Arrays.asList(-13, -1, 14));
        expected.add(Arrays.asList(-13, 0, 13));
        expected.add(Arrays.asList(-13, 1, 12));
        expected.add(Arrays.asList(-13, 2, 11));
        expected.add(Arrays.asList(-13, 3, 10));
        expected.add(Arrays.asList(-13, 4, 9));
        expected.add(Arrays.asList(-13, 5, 8));
        expected.add(Arrays.asList(-13, 6, 7));

        expected.add(Arrays.asList(-12, -2, 14));
        expected.add(Arrays.asList(-12, -1, 13));
        expected.add(Arrays.asList(-12, 0, 12));
        expected.add(Arrays.asList(-12, 1, 11));
        expected.add(Arrays.asList(-12, 2, 10));
        expected.add(Arrays.asList(-12, 3, 9));
        expected.add(Arrays.asList(-12, 4, 8));
        expected.add(Arrays.asList(-12, 5, 7));
        expected.add(Arrays.asList(-12, 6, 6));

        expected.add(Arrays.asList(-11, -3, 14));
        expected.add(Arrays.asList(-11, -2, 13));
        expected.add(Arrays.asList(-11, -1, 12));
        expected.add(Arrays.asList(-11, 0, 11));
        expected.add(Arrays.asList(-11, 1, 10));
        expected.add(Arrays.asList(-11, 2, 9));
        expected.add(Arrays.asList(-11, 3, 8));
        expected.add(Arrays.asList(-11, 4, 7));
        expected.add(Arrays.asList(-11, 5, 6));

        expected.add(Arrays.asList(-10, -4, 14));
        expected.add(Arrays.asList(-10, -3, 13));
        expected.add(Arrays.asList(-10, -2, 12));
        expected.add(Arrays.asList(-10, -1, 11));
        expected.add(Arrays.asList(-10, 0, 10));
        expected.add(Arrays.asList(-10, 1, 9));
        expected.add(Arrays.asList(-10, 2, 8));
        expected.add(Arrays.asList(-10, 3, 7));
        expected.add(Arrays.asList(-10, 4, 6));
        expected.add(Arrays.asList(-10, 5, 5));

        expected.add(Arrays.asList(-9, -5, 14));
        expected.add(Arrays.asList(-9, -4, 13));
        expected.add(Arrays.asList(-9, -3, 12));
        expected.add(Arrays.asList(-9, -2, 11));
        expected.add(Arrays.asList(-9, -1, 10));
        expected.add(Arrays.asList(-9, 0, 9));
        expected.add(Arrays.asList(-9, 1, 8));
        expected.add(Arrays.asList(-9, 2, 7));
        expected.add(Arrays.asList(-9, 3, 6));
        expected.add(Arrays.asList(-9, 4, 5));

        expected.add(Arrays.asList(-8, -6, 14));
        expected.add(Arrays.asList(-8, -5, 13));
        expected.add(Arrays.asList(-8, -4, 12));
        expected.add(Arrays.asList(-8, -3, 11));
        expected.add(Arrays.asList(-8, -2, 10));
        expected.add(Arrays.asList(-8, -1, 9));
        expected.add(Arrays.asList(-8, 0, 8));
        expected.add(Arrays.asList(-8, 1, 7));
        expected.add(Arrays.asList(-8, 2, 6));
        expected.add(Arrays.asList(-8, 3, 5));
        expected.add(Arrays.asList(-8, 4, 4));

        expected.add(Arrays.asList(-7, -7, 14));
        expected.add(Arrays.asList(-7, -6, 13));
        expected.add(Arrays.asList(-7, -5, 12));
        expected.add(Arrays.asList(-7, -4, 11));
        expected.add(Arrays.asList(-7, -3, 10));
        expected.add(Arrays.asList(-7, -2, 9));
        expected.add(Arrays.asList(-7, -1, 8));
        expected.add(Arrays.asList(-7, 0, 7));
        expected.add(Arrays.asList(-7, 1, 6));
        expected.add(Arrays.asList(-7, 2, 5));
        expected.add(Arrays.asList(-7, 3, 4));

        expected.add(Arrays.asList(-6, -6, 12));
        expected.add(Arrays.asList(-6, -5, 11));
        expected.add(Arrays.asList(-6, -4, 10));
        expected.add(Arrays.asList(-6, -3, 9));
        expected.add(Arrays.asList(-6, -2, 8));
        expected.add(Arrays.asList(-6, -1, 7));
        expected.add(Arrays.asList(-6, 0, 6));
        expected.add(Arrays.asList(-6, 1, 5));
        expected.add(Arrays.asList(-6, 2, 4));
        expected.add(Arrays.asList(-6, 3, 3));

        expected.add(Arrays.asList(-5, -5, 10));
        expected.add(Arrays.asList(-5, -4, 9));
        expected.add(Arrays.asList(-5, -3, 8));
        expected.add(Arrays.asList(-5, -2, 7));
        expected.add(Arrays.asList(-5, -1, 6));
        expected.add(Arrays.asList(-5, 0, 5));
        expected.add(Arrays.asList(-5, 1, 4));
        expected.add(Arrays.asList(-5, 2, 3));

        expected.add(Arrays.asList(-4, -4, 8));
        expected.add(Arrays.asList(-4, -3, 7));
        expected.add(Arrays.asList(-4, -2, 6));
        expected.add(Arrays.asList(-4, -1, 5));
        expected.add(Arrays.asList(-4, 0, 4));
        expected.add(Arrays.asList(-4, 1, 3));
        expected.add(Arrays.asList(-4, 2, 2));

        expected.add(Arrays.asList(-3, -2, 5));
        expected.add(Arrays.asList(-3, -1, 4));
        expected.add(Arrays.asList(-3, 0, 3));
        expected.add(Arrays.asList(-3, 1, 2));

        expected.add(Arrays.asList(-2, -2, 4));
        expected.add(Arrays.asList(-2, -1, 3));
        expected.add(Arrays.asList(-2, 0, 2));
        expected.add(Arrays.asList(-2, 1, 1));

        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        expected.add(Arrays.asList(0, 0, 0));

        assertEqualsIgnoreOrder(expected, actual);
    }

}
