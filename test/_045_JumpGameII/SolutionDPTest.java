package _045_JumpGameII;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.Helper;

public class SolutionDPTest {
    
    /** Test method for {@link _045_JumpGameII.SolutionDP } */
    SolutionDP solution;

    @Rule
    public Timeout globalTimeout = new Timeout(800);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionDP();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] nums = {2, 3, 1, 1, 4};
        int actual = solution.jump(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = {2, 1};
        int actual = solution.jump(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String filename = "test/_045_JumpGameII/input3.txt";
        List<String> in = Helper.readInput(filename);
        String[] strs = in.get(0).split(",");
        int[] nums = new int[strs.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        int actual = solution.jump(nums);
        int expected = 24999;
        assertEquals(expected, actual);
    }

}
