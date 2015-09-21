package _274_HIndex;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _274_HIndex.Practice } */
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
        int[] nums = { 0 };
        int actual = solution.hIndex(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 3, 1, 0, 6, 5 };
        int actual = solution.hIndex(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
