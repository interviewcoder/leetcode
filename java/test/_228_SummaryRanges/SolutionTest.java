package _228_SummaryRanges;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _228_SummaryRanges.Solution } */
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
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> actual = solution.summaryRanges(nums);
        List<String> expected = new ArrayList<>();
        expected.add("0->2");
        expected.add("4->5");
        expected.add("7");
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = {0};
        List<String> actual = solution.summaryRanges(nums);
        List<String> expected = new ArrayList<>();
        expected.add("0");
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = {0, 1, 2, 3};
        List<String> actual = solution.summaryRanges(nums);
        List<String> expected = new ArrayList<>();
        expected.add("0->3");
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = {1, 3, 5, 7};
        List<String> actual = solution.summaryRanges(nums);
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("3");
        expected.add("5");
        expected.add("7");
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = {1, 2, 3, 5, 6, 7};
        List<String> actual = solution.summaryRanges(nums);
        List<String> expected = new ArrayList<>();
        expected.add("1->3");
        expected.add("5->7");
        assertEquals(expected, actual);
    }

}
