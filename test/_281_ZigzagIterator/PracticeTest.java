package _281_ZigzagIterator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _281_ZigzagIterator.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Test
    public void Test1() {
        List<Integer> v1 = Arrays.asList(1, 2);
        List<Integer> v2 = Arrays.asList(3, 4, 5, 6);
        Practice i = new Practice(v1, v2);
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
        Practice i = new Practice(v1, v2);
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
        Practice i = new Practice(v1, v2);
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
        Practice i = new Practice(v1, v2);
        List<Integer> actual = new ArrayList<>();
        while (i.hasNext()) {
            actual.add(i.next());
        }
        List<Integer> expected = Arrays.asList(4);
        assertEquals(expected, actual);
    }

}
