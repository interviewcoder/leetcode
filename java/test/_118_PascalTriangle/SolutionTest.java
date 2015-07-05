package _118_PascalTriangle;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _118_PascalTriangle.Solution }*/
    Solution solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(20);

    List<List<Integer>> expectedList = new ArrayList<List<Integer>>();

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1, 2, 1)));
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1, 3, 3, 1)));
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1, 4, 6, 4, 1)));
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
        expectedList = null;
    }

    @Test
    public void Test0() {
        int numRows = -1;
        List<List<Integer>> actual = solution.generate(numRows);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        assertEquals("corner case", expected, actual);
    }

    @Test
    public void Test1() {
        int numRows = 0;
        List<List<Integer>> actual = solution.generate(numRows);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        assertEquals("corner case", expected, actual);
    }

    @Test
    public void Test2() {
        int numRows = 1;
        List<List<Integer>> actual = solution.generate(numRows);
        List<List<Integer>> expected = expectedList.subList(0, numRows);
        assertEquals("corner case", expected, actual);
    }

    @Test
    public void Test3() {
        int numRows = 4;
        List<List<Integer>> actual = solution.generate(numRows);
        List<List<Integer>> expected = expectedList.subList(0, numRows);
        assertEquals("corner case", expected, actual);
    }

}
