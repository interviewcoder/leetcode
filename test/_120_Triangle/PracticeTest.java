package _120_Triangle;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _120_Triangle.Solution } */
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
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        int actual = solution.minimumTotal(triangle);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        int actual = solution.minimumTotal(triangle);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1));
        triangle.add(Arrays.asList(2, 3));
        int actual = solution.minimumTotal(triangle);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
