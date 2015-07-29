package _047_PermutationsII;

import static com.leetcode.Test.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionIterativeTest {
    
    /** Test method for {@link _047_PermutationsII.SolutionIterative } */
    SolutionIterative solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionIterative();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }
    
    @Test
    public void Test1() {
        int[] nums = { 1, 1, 2 };
        List<List<Integer>> actual = solution.permuteUnique(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 1, 2));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(2, 1, 1));

        // order in actual is not important!
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> actual = solution.permuteUnique(nums);

        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 2));
        expected.add(Arrays.asList(2, 1, 3));
        expected.add(Arrays.asList(2, 3, 1));
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(3, 2, 1));

        // order in actual is not important!
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 1 };
        List<List<Integer>> actual = solution.permuteUnique(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1));
        // order in actual is not important!
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 1, 1, 1, 1 };
        List<List<Integer>> actual = solution.permuteUnique(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 1, 1, 1));
        // order in actual is not important!
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 1, 2, 1 };
        List<List<Integer>> actual = solution.permuteUnique(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 1, 2));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(2, 1, 1));

        // order in actual is not important!
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = {};
        List<List<Integer>> actual = solution.permuteUnique(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test7() {
        int[] nums = { 0, 1, 0, 9 };
        List<List<Integer>> actual = solution.permuteUnique(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(0, 0, 1, 9));
        expected.add(Arrays.asList(0, 0, 9, 1));
        expected.add(Arrays.asList(0, 1, 0, 9));
        expected.add(Arrays.asList(0, 1, 9, 0));
        expected.add(Arrays.asList(0, 9, 0, 1));
        expected.add(Arrays.asList(0, 9, 1, 0));
        expected.add(Arrays.asList(1, 0, 0, 9));
        expected.add(Arrays.asList(1, 0, 9, 0));
        expected.add(Arrays.asList(1, 9, 0, 0));
        expected.add(Arrays.asList(9, 0, 0, 1));
        expected.add(Arrays.asList(9, 0, 1, 0));
        expected.add(Arrays.asList(9, 1, 0, 0));

        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test8() {
        int[] nums = { 0, 1, 0, 0, 9 };
        List<List<Integer>> actual = solution.permuteUnique(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(0, 0, 0, 1, 9));
        expected.add(Arrays.asList(0, 0, 0, 9, 1));
        expected.add(Arrays.asList(0, 0, 1, 0, 9));
        expected.add(Arrays.asList(0, 0, 1, 9, 0));
        expected.add(Arrays.asList(0, 0, 9, 1, 0));
        expected.add(Arrays.asList(0, 0, 9, 0, 1));
        expected.add(Arrays.asList(0, 1, 0, 0, 9));
        expected.add(Arrays.asList(0, 1, 0, 9, 0));
        expected.add(Arrays.asList(0, 1, 9, 0, 0));
        expected.add(Arrays.asList(0, 9, 0, 0, 1));
        expected.add(Arrays.asList(0, 9, 0, 1, 0));
        expected.add(Arrays.asList(0, 9, 1, 0, 0));
        expected.add(Arrays.asList(1, 0, 0, 0, 9));
        expected.add(Arrays.asList(1, 0, 0, 9, 0));
        expected.add(Arrays.asList(1, 0, 9, 0, 0));
        expected.add(Arrays.asList(1, 9, 0, 0, 0));
        expected.add(Arrays.asList(9, 0, 0, 0, 1));
        expected.add(Arrays.asList(9, 0, 0, 1, 0));
        expected.add(Arrays.asList(9, 0, 1, 0, 0));
        expected.add(Arrays.asList(9, 1, 0, 0, 0));
        
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test9() {
        int[] nums = { 2, 2, 1, 1 };
        List<List<Integer>> actual = solution.permuteUnique(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 1, 2, 2));
        expected.add(Arrays.asList(1, 2, 1, 2));
        expected.add(Arrays.asList(1, 2, 2, 1));
        expected.add(Arrays.asList(2, 1, 1, 2));
        expected.add(Arrays.asList(2, 1, 2, 1));
        expected.add(Arrays.asList(2, 2, 1, 1));
        assertEqualsIgnoreOrder(expected, actual);
    }

}
