package _039_CombinationSum;

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

    /** Test method for {@link _039_CombinationSum.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

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
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> actuals = solution.combinationSum(candidates,
                target);
        List<Integer> l1 = Arrays.asList(2, 2, 3);
        List<Integer> l2 = Arrays.asList(7);
        List<List<Integer>> expecteds = new ArrayList<List<Integer>>();
        expecteds.add(l1);
        expecteds.add(l2);
        assertEqualsIgnoreOrder(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[] candidates = { 2 };
        int target = 2;
        List<List<Integer>> actuals = solution.combinationSum(candidates,
                target);
        List<Integer> l1 = Arrays.asList(2);
        List<List<Integer>> expecteds = new ArrayList<List<Integer>>();
        expecteds.add(l1);
        assertEqualsIgnoreOrder(expecteds, actuals);
    }

    @Test
    public void Test3() {
        int[] candidates = { 3 };
        int target = 2;
        List<List<Integer>> actuals = solution.combinationSum(candidates,
                target);
        List<List<Integer>> expecteds = new ArrayList<List<Integer>>();
        assertEqualsIgnoreOrder(expecteds, actuals);
    }

    @Test
    public void Test4() {
        int[] candidates = { 2, 3, 4, 6, 7 };
        int target = 10;
        List<List<Integer>> actuals = solution.combinationSum(candidates,
                target);
        List<List<Integer>> expecteds = new ArrayList<List<Integer>>();
        expecteds.add(Arrays.asList(2, 2, 2, 2, 2));
        expecteds.add(Arrays.asList(2, 2, 2, 4));
        expecteds.add(Arrays.asList(2, 2, 3, 3));
        expecteds.add(Arrays.asList(2, 2, 6));
        expecteds.add(Arrays.asList(2, 4, 4));
        expecteds.add(Arrays.asList(3, 3, 4));
        expecteds.add(Arrays.asList(3, 7));
        expecteds.add(Arrays.asList(4, 6));
        assertEqualsIgnoreOrder(expecteds, actuals);
    }

}
