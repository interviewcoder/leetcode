package _011_ContainerWithMostWater;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _011_ContainerWithMostWater.Practice } */
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
        int[] height = {};
        int actual = solution.maxArea(height);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] height = {5};
        int actual = solution.maxArea(height);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] height = {3, 2};
        int actual = solution.maxArea(height);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] height = {1, 2, 3, 4, 5};
        int actual = solution.maxArea(height);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] height = {2, 4, 3, 5, 1};
        int actual = solution.maxArea(height);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] height = {8, 4, 3, 2, 1};
        int actual = solution.maxArea(height);
        int expected = 6;
        assertEquals(expected, actual);
    }

}
