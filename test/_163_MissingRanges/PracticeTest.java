package _163_MissingRanges;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _163_MissingRanges.Practice } */
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
    public void Test1() {
        int[] nums = { 0, 1, 3, 50, 75 };
        int lower = 0;
        int upper = 99;
        List<String> actual = solution.findMissingRanges(nums, lower, upper);
        List<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("4->49");
        expected.add("51->74");
        expected.add("76->99");
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 0, 1, 2, 3 };
        int lower = 0;
        int upper = 3;
        List<String> actual = solution.findMissingRanges(nums, lower, upper);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 1, 3, 5 };
        int lower = 0;
        int upper = 5;
        List<String> actual = solution.findMissingRanges(nums, lower, upper);
        List<String> expected = new ArrayList<>();
        expected.add("0");
        expected.add("2");
        expected.add("4");
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 3, 6 };
        int lower = 0;
        int upper = 5;
        List<String> actual = solution.findMissingRanges(nums, lower, upper);
        List<String> expected = new ArrayList<>();
        expected.add("0->2");
        expected.add("4->5");
        assertEquals(expected, actual);
    }
}
