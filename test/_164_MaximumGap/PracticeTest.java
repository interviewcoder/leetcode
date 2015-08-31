package _164_MaximumGap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _164_MaximumGap.Practice } */
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
        int[] nums = {1, 10000000};
        int actual = solution.maximumGap(nums);
        int expected = 9999999;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = {3, 6, 9, 1};
        int actual = solution.maximumGap(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
