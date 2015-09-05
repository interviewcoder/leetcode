package _055_JumpGame;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.Helper;

public class SolutionDPTest {

    /** Test method for {@link _055_JumpGame.SolutionDP } */
    SolutionDP solution;

    @Rule
    public Timeout globalTimeout = new Timeout(300);

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
        int[] nums = { 2, 3, 1, 1, 4 };
        boolean actual = solution.canJump(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = { 3, 2, 1, 0, 4 };
        boolean actual = solution.canJump(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    // expected TLE
    @Test
    public void Test3() {
        String filename = "test/_055_JumpGame/Input3.txt";
        List<String> in = Helper.readInput(filename);
        String[] strs = in.get(0).split(",");
        int[] nums = new int[strs.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        boolean actual = solution.canJump(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
