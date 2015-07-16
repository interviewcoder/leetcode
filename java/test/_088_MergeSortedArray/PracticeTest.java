package _088_MergeSortedArray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _088_MergeSortedArray.Practice } */
    Practice solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

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
        int m = 3;
        int n = 2;
        int[] nums1 = new int[m + n];
        int[] nums2 = { 5, 6 };
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        solution.merge(nums1, m, nums2, n);
        int[] expecteds = { 1, 2, 3, 5, 6 };
        assertArrayEquals(expecteds, nums1);
    }

    @Test
    public void Test2() {
        int m = 3;
        int n = 2;
        int[] nums1 = new int[m + n];
        int[] nums2 = { 1, 2 };
        nums1[0] = 3;
        nums1[1] = 5;
        nums1[2] = 6;
        solution.merge(nums1, m, nums2, n);
        int[] expecteds = { 1, 2, 3, 5, 6 };
        assertArrayEquals(expecteds, nums1);
    }

    @Test
    public void Test3() {
        int m = 3;
        int n = 2;
        int[] nums1 = new int[m + n];
        int[] nums2 = { 1, 6 };
        nums1[0] = 2;
        nums1[1] = 3;
        nums1[2] = 5;
        solution.merge(nums1, m, nums2, n);
        int[] expecteds = { 1, 2, 3, 5, 6 };
        assertArrayEquals(expecteds, nums1);
    }

    @Test
    public void Test4() {
        int m = 3;
        int n = 2;
        int[] nums1 = new int[m + n];
        int[] nums2 = { 1, 5 };
        nums1[0] = 2;
        nums1[1] = 3;
        nums1[2] = 6;
        solution.merge(nums1, m, nums2, n);
        int[] expecteds = { 1, 2, 3, 5, 6 };
        assertArrayEquals(expecteds, nums1);
    }

    @Test
    public void Test5() {
        int m = 3;
        int n = 0;
        int[] nums1 = new int[m + n];
        int[] nums2 = {};
        nums1[0] = 2;
        nums1[1] = 3;
        nums1[2] = 6;
        solution.merge(nums1, m, nums2, n);
        int[] expecteds = { 2, 3, 6 };
        assertArrayEquals(expecteds, nums1);
    }

}