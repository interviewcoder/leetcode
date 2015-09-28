package _218_TheSkylineProblem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionHeapTest {

    /** Test method for {@link _218_TheSkylineProblem.SolutionHeap } */
    SolutionHeap solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionHeap();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[][] buildings = { };
        List<List<Integer>> actuals = toList(solution.getSkyline(buildings));
        List<List<Integer>> expecteds = new ArrayList<>();
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[][] buildings = {
                { 2,  9, 10 },
                { 3,  7, 15 },
                { 5, 12, 12 },
                {15, 20, 10 },
                {19, 24,  8 }
        };
        List<List<Integer>> actuals = toList(solution.getSkyline(buildings));
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(2, 10));
        expecteds.add(Arrays.asList(3, 15));
        expecteds.add(Arrays.asList(7, 12));
        expecteds.add(Arrays.asList(12, 0));
        expecteds.add(Arrays.asList(15,10));
        expecteds.add(Arrays.asList(20, 8));
        expecteds.add(Arrays.asList(24, 0));
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test3() {
        int[][] buildings = {
                { 2,  9, 10 },
                { 3,  4,  4},
                { 4,  5,  4},
        };
        List<List<Integer>> actuals = toList(solution.getSkyline(buildings));
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(2, 10));
        expecteds.add(Arrays.asList(9,  0));
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test4() {
        int[][] buildings = {
                { 1,  4, 10 },
                { 2,  5,  18},
        };
        List<List<Integer>> actuals = toList(solution.getSkyline(buildings));
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(1, 10));
        expecteds.add(Arrays.asList(2, 18));
        expecteds.add(Arrays.asList(5,  0));
        assertEquals(expecteds, actuals);
    }

    private List<List<Integer>> toList(List<int[]> lists) {
        List<List<Integer>> res = new ArrayList<>();
        for (int[] list : lists) {
            res.add(toList(list));
        }
        return res;
    }

    private List<Integer> toList(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            res.add(num);
        }
        return res;
    }


}
