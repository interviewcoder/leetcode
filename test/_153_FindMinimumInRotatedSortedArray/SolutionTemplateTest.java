package _153_FindMinimumInRotatedSortedArray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTemplateTest {
    
    /** Test method for {@link _153_FindMinimumInRotatedSortedArray.SolutionTemplate } */
    SolutionTemplate solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionTemplate();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] nums = { 2 };
        int actual = solution.findMin(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 0, 1, 2, 3 };
        int actual = solution.findMin(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 3, 4, 2 };
        int actual = solution.findMin(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 3, 1, 2 };
        int actual = solution.findMin(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 0, 1, 2, 3, 4, 5 };
        int actual = solution.findMin(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = { 4, 0, 1, 2, 3 };
        int actual = solution.findMin(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void Test7() {
        int[] nums = { 2, 3, 4, 0, 1 };
        int actual = solution.findMin(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
