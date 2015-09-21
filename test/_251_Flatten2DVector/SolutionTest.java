package _251_Flatten2DVector;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _251_Flatten2DVector.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Test
    public void Test1() {
        List<List<Integer>> vec2d = new ArrayList<>();
        vec2d.add(Arrays.asList(1, 2));
        vec2d.add(Arrays.asList(3));
        vec2d.add(Arrays.asList(4, 5, 6));
        List<Integer> actual = new ArrayList<>();
        Solution i = new Solution(vec2d);
        while (i.hasNext()) {
            actual.add(i.next());
        }
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<List<Integer>> vec2d = new ArrayList<>();
        vec2d.add(Arrays.asList());
        vec2d.add(Arrays.asList(3));
        List<Integer> actual = new ArrayList<>();
        Solution i = new Solution(vec2d);
        while (i.hasNext()) {
            actual.add(i.next());
        }
        List<Integer> expected = Arrays.asList(3);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        List<List<Integer>> vec2d = new ArrayList<>();
        vec2d.add(Arrays.asList());
        vec2d.add(Arrays.asList(3));
        vec2d.add(Arrays.asList());
        List<Integer> actual = new ArrayList<>();
        Solution i = new Solution(vec2d);
        while (i.hasNext()) {
            actual.add(i.next());
        }
        List<Integer> expected = Arrays.asList(3);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        List<List<Integer>> vec2d = new ArrayList<>();
        vec2d.add(Arrays.asList());
        vec2d.add(Arrays.asList(3));
        vec2d.add(Arrays.asList());
        vec2d.add(Arrays.asList(4));
        List<Integer> actual = new ArrayList<>();
        Solution i = new Solution(vec2d);
        while (i.hasNext()) {
            actual.add(i.next());
        }
        List<Integer> expected = Arrays.asList(3, 4);
        assertEquals(expected, actual);
    }

}
