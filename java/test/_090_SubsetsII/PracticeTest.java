package _090_SubsetsII;

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

    /** Test method for {@link _090_SubsetsII.Practice } */
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
        int[] nums = {};
        List<List<Integer>> actual = solution.subsetsWithDup(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList());
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test1() {
        int[] nums = { 1, 2, 2 };
        List<List<Integer>> actual = solution.subsetsWithDup(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(1, 2, 2));
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(1, 2));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 2 };
        List<List<Integer>> actual = solution.subsetsWithDup(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(1, 2));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 1 };
        List<List<Integer>> actual = solution.subsetsWithDup(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList());
        expected.add(Arrays.asList(1));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = {1, 1, 2, 3, 3};
        List<List<Integer>> actual = solution.subsetsWithDup(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(3, 3));
        expected.add(Arrays.asList(1, 1, 2));
        expected.add(Arrays.asList(1, 1, 3));
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 3));
        expected.add(Arrays.asList(2, 3, 3));
        expected.add(Arrays.asList(1, 1, 2, 3));
        expected.add(Arrays.asList(1, 1, 3, 3));
        expected.add(Arrays.asList(1, 2, 3, 3));
        expected.add(Arrays.asList(1, 1, 2, 3, 3));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 1, 1, 1 };
        List<List<Integer>> actual = solution.subsetsWithDup(nums);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 1, 1));
        assertEqualsIgnoreOrder(expected, actual);
    }

}
