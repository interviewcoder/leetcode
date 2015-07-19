package _136_SingleNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _136_SingleNumber.Practice } */
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
    public void Test0() {
        int[] nums = {};
        int actual = solution.singleNumber(nums);
        assertEquals("empty array", 0, actual);
    }

    @Test
    public void Test1() {
        int[] nums = { 1 };
        int actual = solution.singleNumber(nums);
        assertEquals("one number in array", 1, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 1, 2, 2 };
        int actual = solution.singleNumber(nums);
        assertEquals(nums.toString(), 1, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 2, 1, 2 };
        int actual = solution.singleNumber(nums);
        assertEquals(nums.toString(), 1, actual);
    }
}
