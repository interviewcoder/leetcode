package _283_MoveZeroes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _283_MoveZeroes.Practice } */
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
        int[] nums = { 0, 1, 0, 3, 12 };
        solution.moveZeroes(nums);
        int[] exps = { 1, 3, 12, 0, 0 };
        assertArrayEquals(exps, nums);
    }

    @Test
    public void Test2() {
        int[] nums = { 4, 3, 2, 0, 0, 0 };
        solution.moveZeroes(nums);
        int[] exps = { 4, 3, 2, 0, 0, 0 };
        assertArrayEquals(exps, nums);
    }

    @Test
    public void Test3() {
        int[] nums = { 0, 0, 0, 4, 2, 1 };
        solution.moveZeroes(nums);
        int[] exps = { 4, 2, 1, 0, 0, 0 };
        assertArrayEquals(exps, nums);
    }

    @Test
    public void Test4() {
        int[] nums = { 3, 1, 2 };
        solution.moveZeroes(nums);
        int[] exps = { 3, 1, 2 };
        assertArrayEquals(exps, nums);
    }

    @Test
    public void Test5() {
        int[] nums = { 0, 0 };
        solution.moveZeroes(nums);
        int[] exps = { 0, 0 };
        assertArrayEquals(exps, nums);
    }

    @Test
    public void Test6() {
        int[] nums = { 0 };
        solution.moveZeroes(nums);
        int[] exps = { 0 };
        assertArrayEquals(exps, nums);
    }

    @Test
    public void Test7() {
        int[] nums = { 1 };
        solution.moveZeroes(nums);
        int[] exps = { 1 };
        assertArrayEquals(exps, nums);
    }

}
