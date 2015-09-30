package _276_PaintFence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _276_PaintFence.Solution } */
    Solution solution;

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

//    @Test
//    public void Test1() {
//        int n = 0;
//        int k = 1;
//        int actual = solution.numWays(n, k);
//        int expected = 0;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Test2() {
//        int n = 1;
//        int k = 0;
//        int actual = solution.numWays(n, k);
//        int expected = 0;
//        assertEquals(expected, actual);
//    }

    @Test
    public void Test3() {
        int n = 1;
        int k = 1;
        int actual = solution.numWays(n, k);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int n = 1;
        int k = 5;
        int actual = solution.numWays(n, k);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int n = 2;
        int k = 3;
        int actual = solution.numWays(n, k);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int n = 3;
        int k = 4;
        int actual = solution.numWays(n, k);
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int n = 2;
        int k = 1;
        int actual = solution.numWays(n, k);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
