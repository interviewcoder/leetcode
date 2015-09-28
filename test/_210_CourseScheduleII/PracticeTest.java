package _210_CourseScheduleII;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _210_CourseScheduleII.Practice } */
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
        int numCourses = 2;
        int[][] prerequisites = { 
                { 1, 0 }
        };
        int[] actuals = solution.findOrder(numCourses, prerequisites);
        int[] expecteds = { 0, 1 };
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int numCourses = 4;
        int[][] prerequisites = { 
                { 1, 0 },
                { 2, 0 },
                { 3, 1 },
                { 3, 2 }
        };
        int[] actuals = solution.findOrder(numCourses, prerequisites);
        List<Integer> actual = toList(actuals);
        Set<List<Integer>> expecteds = new HashSet<>();
        expecteds.add(Arrays.asList(0, 1, 2, 3));
        expecteds.add(Arrays.asList(0, 2, 1, 3));
        assertTrue(expecteds.contains(actual));
    }

    @Test
    public void Test3() {
        int numCourses = 3;
        int[][] prerequisites = { 
                { 1, 0 },
                { 2, 1 },
                { 0, 2 },
        };
        int[] actuals = solution.findOrder(numCourses, prerequisites);
        int[] expecteds = { };
        assertArrayEquals(expecteds, actuals);
    }

    private List<Integer> toList(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            res.add(num);
        }
        return res;
    }

}
