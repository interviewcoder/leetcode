package _219_ContainsDuplicateII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
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
        int[] nums = {};
        int k = 2;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = {1};
        int k = 2;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = {1, 2};
        int k = 2;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = {1, 1};
        int k = 2;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = {1, 2, 3, 1};
        int k = 2;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] nums = {1, 2, 1, 3};
        int k = 1;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int[] nums = {1, 2, 1, 3};
        int k = 2;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int[] nums = {1, 2, 1, 3};
        int k = 7;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        boolean expected = true;
        assertEquals(expected, actual);
    }


}
