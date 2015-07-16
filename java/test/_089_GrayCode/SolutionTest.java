package _089_GrayCode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _089_GrayCode.Solution } */
    Solution solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

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
        int n = 2;
        List<Integer> actual = solution.grayCode(n);
        List<Integer> expected = Arrays.asList(0, 1, 3, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int n = 0;
        List<Integer> actual = solution.grayCode(n);
        List<Integer> expected = Arrays.asList(0);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int n = 1;
        List<Integer> actual = solution.grayCode(n);
        List<Integer> expected = Arrays.asList(0, 1);
        assertEquals(expected, actual);
    }

}
