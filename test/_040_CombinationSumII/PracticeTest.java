package _040_CombinationSumII;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _040_CombinationSumII.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;

        List<Integer> l3 = Arrays.asList(1, 7);
        List<Integer> l2 = Arrays.asList(1, 2, 5);
        List<Integer> l4 = Arrays.asList(2, 6);
        List<Integer> l1 = Arrays.asList(1, 1, 6);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(l1);
        expected.add(l2);
        expected.add(l3);
        expected.add(l4);

        List<List<Integer>> actual = solution.combinationSum2(candidates,
                target);
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        List<Integer> l1 = Arrays.asList(7);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(l1);

        List<List<Integer>> actual = solution.combinationSum2(candidates,
                target);
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        int[] candidates = { 3, 1, 3, 5, 1, 1 };
        int target = 8;
        List<Integer> l1 = Arrays.asList(1, 1, 1, 5);
        List<Integer> l2 = Arrays.asList(1, 1, 3, 3);
        List<Integer> l3 = Arrays.asList(3, 5);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(l1);
        expected.add(l2);
        expected.add(l3);

        List<List<Integer>> actual = solution.combinationSum2(candidates,
                target);
        assertEqualsIgnoreOrder(expected, actual);
    }

}
