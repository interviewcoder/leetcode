package _004_MedianOfTwoSortedArrays;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _004_MedianOfTwoSortedArrays.Solution } */
    Solution solution;

    private static final double DELTA = 10e-5;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

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
        int[] nums1 = { 1, 2, 3, 4, 5, 6 };
        int[] nums2 = { 2, 3, 4, 5 };
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        double expected = 3.5;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test2() {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3 };
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        double expected = 2;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test3() {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4, 5 };
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        double expected = 3;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test4() {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        double expected = 2.5;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test5() {
        int[] nums1 = { 1, 3, 5 };
        int[] nums2 = { 2, 4, 6 };
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        double expected = 3.5;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test6() {
        int[] nums1 = { 2, 4, 6, 8 };
        int[] nums2 = { 1, 3, 5 };
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        double expected = 4;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test7() {
        int[] nums1 = { };
        int[] nums2 = { 1 };
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        double expected = 1.0;
        assertEquals(expected, actual, DELTA);
    }
}
