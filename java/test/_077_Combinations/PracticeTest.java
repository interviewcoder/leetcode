package _077_Combinations;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _077_Combinations.Practice } */
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
    public void Test1() {
        int n = 4;
        int k = 2;
        List<List<Integer>> actual = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 4));
        expected.add(Arrays.asList(3, 4));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(1, 4));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        int n = 4;
        int k = 1;
        List<List<Integer>> actual = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(4));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        int n = 4;
        int k = 3;
        List<List<Integer>> actual = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(2, 3, 4));
        expected.add(Arrays.asList(1, 3, 4));
        expected.add(Arrays.asList(1, 2, 4));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        int n = 4;
        int k = 4;
        List<List<Integer>> actual = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3, 4));
        assertEqualsIgnoreOrder(expected, actual);
    }

}
