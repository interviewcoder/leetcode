package _231_PowerOfTwo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _231_PowerOfTwo.Solution } */
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

    @Test
    public void Test1() {
        assertTrue(solution.isPowerOfTwo(2));
    }

    @Test
    public void Test2() {
        assertTrue(solution.isPowerOfTwo(4));
    }

    @Test
    public void Test3() {
        assertTrue(solution.isPowerOfTwo(1024));
    }

    @Test
    public void Test4() {
        assertTrue(!solution.isPowerOfTwo(1023));
    }

    @Test
    public void Test5() {
        assertTrue(!solution.isPowerOfTwo(23));
    }

    @Test
    public void Test6() {
        assertTrue(!solution.isPowerOfTwo(22));
    }

}
