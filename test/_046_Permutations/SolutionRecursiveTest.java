package _046_Permutations;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionRecursiveTest {

    /** Test method for {@link _046_Permutations.SolutionRecursive } */
    SolutionRecursive solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionRecursive();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] nums = {};
        List<List<Integer>> actual = solution.permute(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test1() {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> actual = solution.permute(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 2));
        expected.add(Arrays.asList(2, 1, 3));
        expected.add(Arrays.asList(2, 3, 1));
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(3, 2, 1));

        // order of set in list does not matter
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 1 };
        List<List<Integer>> actual = solution.permute(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 2 };
        List<List<Integer>> actual = solution.permute(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(2, 1));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 4, 5, 6, 7};
        List<List<Integer>> actual = solution.permute(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(4, 5, 6, 7));
        expected.add(Arrays.asList(4, 5, 7, 6));
        expected.add(Arrays.asList(4, 6, 5, 7));
        expected.add(Arrays.asList(4, 6, 7, 5));
        expected.add(Arrays.asList(4, 7, 5, 6));
        expected.add(Arrays.asList(4, 7, 6, 5));

        expected.add(Arrays.asList(5, 4, 6, 7));
        expected.add(Arrays.asList(5, 4, 7, 6));
        expected.add(Arrays.asList(5, 6, 4, 7));
        expected.add(Arrays.asList(5, 6, 7, 4));
        expected.add(Arrays.asList(5, 7, 4, 6));
        expected.add(Arrays.asList(5, 7, 6, 4));

        expected.add(Arrays.asList(6, 4, 5, 7));
        expected.add(Arrays.asList(6, 4, 7, 5));
        expected.add(Arrays.asList(6, 5, 4, 7));
        expected.add(Arrays.asList(6, 5, 7, 4));
        expected.add(Arrays.asList(6, 7, 4, 5));
        expected.add(Arrays.asList(6, 7, 5, 4));

        expected.add(Arrays.asList(7, 4, 5, 6));
        expected.add(Arrays.asList(7, 4, 6, 5));
        expected.add(Arrays.asList(7, 5, 4, 6));
        expected.add(Arrays.asList(7, 5, 6, 4));
        expected.add(Arrays.asList(7, 6, 4, 5));
        expected.add(Arrays.asList(7, 6, 5, 4));
        assertEqualsIgnoreOrder(expected, actual);
    }

}
