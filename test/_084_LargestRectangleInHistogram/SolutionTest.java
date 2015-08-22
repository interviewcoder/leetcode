package _084_LargestRectangleInHistogram;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _084_LargestRectangleInHistogram.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(550);

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
        int[] height = { 2, 1, 5, 6, 2, 3 };
        int actual = solution.largestRectangleArea(height);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] height = { 6, 2, 5, 4, 5, 1, 6 };
        int actual = solution.largestRectangleArea(height);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int size = 3000000;
        int[] height = new int[size]; 
        for (int i = 0; i < size; i++) {
            height[i] = 1;
        }
        int actual = solution.largestRectangleArea(height);
        int expected = size;
        assertEquals(expected, actual);
    }

}