package _220_ContainsDuplicateIII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _220_ContainsDuplicateIII.Practice } */
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
        int[] nums = {-1, -1};
        int k = 1;
        int t = 0;
        assertTrue(solution.containsNearbyAlmostDuplicate(nums, k, t));
    }

    @Test
    public void Test2() {
        int[] nums = {-1, 2147483647};
        int k = 1;
        int t = 2147483647;
        assertTrue(!solution.containsNearbyAlmostDuplicate(nums, k, t));
    }

}
