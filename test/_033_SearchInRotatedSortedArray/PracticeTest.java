package _033_SearchInRotatedSortedArray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _033_SearchInRotatedSortedArray.Practice } */
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
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        int actual = solution.search(nums, target);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int actual = solution.search(nums, target);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;
        int actual = solution.search(nums, target);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 7;
        int actual = solution.search(nums, target);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        int actual = solution.search(nums, target);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = { 1, 2, 3 };
        int target = 1;
        int actual = solution.search(nums, target);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] nums = { 1, 2, 3 };
        int target = 2;
        int actual = solution.search(nums, target);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int[] nums = { 1, 2, 3 };
        int target = 3;
        int actual = solution.search(nums, target);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int[] nums = { 6, 4, 5 };
        int target = 6;
        int actual = solution.search(nums, target);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        int[] nums = { 6, 4, 5 };
        int target = 4;
        int actual = solution.search(nums, target);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        int[] nums = { 6, 4, 5 };
        int target = 5;
        int actual = solution.search(nums, target);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test12() {
        int[] nums = { 6, 4, 5 };
        int target = 8;
        int actual = solution.search(nums, target);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test13() {
        int[] nums = { 6, 4, 5 };
        int target = 3;
        int actual = solution.search(nums, target);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test14() {
        int[] nums = {180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177};
        int target = 42;
        int actual = solution.search(nums, target);
        int expected = 43;
        assertEquals(expected, actual);
    }

    @Test
    public void Test15() {
        int[] nums = {101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
        int target = 202;
        int actual = solution.search(nums, target);
        int expected = 8;
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test16() {
        int[] nums = { 4, 5, 6, 7, 8, 1, 2, 3 };
        int target = 8;
        int actual = solution.search(nums, target);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
