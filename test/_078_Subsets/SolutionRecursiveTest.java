package _078_Subsets;

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

    /** Test method for {@link _078_Subsets.SolutionRecursive } */
    SolutionRecursive solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(500);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionRecursive();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> actuals = solution.subsets(nums);
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList());
        expecteds.add(Arrays.asList(1));
        expecteds.add(Arrays.asList(2));
        expecteds.add(Arrays.asList(3));
        expecteds.add(Arrays.asList(1, 3));
        expecteds.add(Arrays.asList(1, 2));
        expecteds.add(Arrays.asList(2, 3));
        expecteds.add(Arrays.asList(1, 2, 3));
        assertEqualsIgnoreOrder(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 2 };
        List<List<Integer>> actual = solution.subsets(nums);
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList());
        expecteds.add(Arrays.asList(1));
        expecteds.add(Arrays.asList(2));
        expecteds.add(Arrays.asList(1, 2));
        assertEqualsIgnoreOrder(expecteds, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 1 };
        List<List<Integer>> actual = solution.subsets(nums);
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList());
        expecteds.add(Arrays.asList(1));
        assertEqualsIgnoreOrder(expecteds, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 4, 1, 0 };
        List<List<Integer>> actual = solution.subsets(nums);
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList());
        expecteds.add(Arrays.asList(0));
        expecteds.add(Arrays.asList(0, 1));
        expecteds.add(Arrays.asList(0, 4));
        expecteds.add(Arrays.asList(0, 1, 4));
        expecteds.add(Arrays.asList(1));
        expecteds.add(Arrays.asList(1, 4));
        expecteds.add(Arrays.asList(4));
        assertEqualsIgnoreOrder(expecteds, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { };
        List<List<Integer>> actual = solution.subsets(nums);
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList());
        assertEqualsIgnoreOrder(expecteds, actual);
    }

}