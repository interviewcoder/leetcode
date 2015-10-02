package _281_ZigzagIterator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _281_ZigzagIterator.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Test
    public void Test1() {
        List<Integer> v1 = Arrays.asList(1, 2);
        List<Integer> v2 = Arrays.asList(3, 4, 5, 6);
        Solution i = new Solution(v1, v2);
        List<Integer> actual = new ArrayList<>();
        while (i.hasNext()) {
            actual.add(i.next());
        }
        List<Integer> expected = Arrays.asList(1, 3, 2, 4, 5, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<Integer> v1 = Arrays.asList(1, 2);
        List<Integer> v2 = Arrays.asList(3);
        Solution i = new Solution(v1, v2);
        List<Integer> actual = new ArrayList<>();
        while (i.hasNext()) {
            actual.add(i.next());
        }
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        List<Integer> v1 = Arrays.asList();
        List<Integer> v2 = Arrays.asList(3, 5);
        Solution i = new Solution(v1, v2);
        List<Integer> actual = new ArrayList<>();
        while (i.hasNext()) {
            actual.add(i.next());
        }
        List<Integer> expected = Arrays.asList(3, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        List<Integer> v1 = Arrays.asList(4);
        List<Integer> v2 = Arrays.asList();
        Solution i = new Solution(v1, v2);
        List<Integer> actual = new ArrayList<>();
        while (i.hasNext()) {
            actual.add(i.next());
        }
        List<Integer> expected = Arrays.asList(4);
        assertEquals(expected, actual);
    }

}
