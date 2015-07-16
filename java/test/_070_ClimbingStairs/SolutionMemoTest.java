package _070_ClimbingStairs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionMemoTest {

    /** Test method for {@link _070_ClimbingStairs.SolutionMemo } */
    SolutionMemo solution;

    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionMemo();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int n = 1;
        int actual = solution.climbStairs(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int n = 2;
        int actual = solution.climbStairs(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int n = 3;
        int actual = solution.climbStairs(n);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
