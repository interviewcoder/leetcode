package _216_CombinationSumIII;

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
    
    /** Test method for {@link _216_CombinationSumIII.Practice } */
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
        int k = 3;
        int n = 7;
        List<List<Integer>> actual = solution.combinationSum3(k, n);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 4));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        int k = 3;
        int n = 9;
        List<List<Integer>> actual = solution.combinationSum3(k, n);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 6));
        expected.add(Arrays.asList(1, 3, 5));
        expected.add(Arrays.asList(2, 3, 4));
        assertEqualsIgnoreOrder(expected, actual);
    }

}
