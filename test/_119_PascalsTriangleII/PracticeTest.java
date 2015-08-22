package _119_PascalsTriangleII;

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

    /** Test method for {@link _119_PascalsTriangleII.Practice } */
    Practice solution;
    List<List<Integer>> expectedList = new ArrayList<List<Integer>>();
    
    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1, 2, 1)));
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1, 3, 3, 1)));
        expectedList.add(new ArrayList<Integer>(Arrays.asList(1, 4, 6, 4, 1)));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void Test0() {
        int rowIndex = -1;
        List<Integer> actual = solution.getRow(rowIndex);
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals("corner case", expected, actual);
    }

    @Test
    public void Test1() {
        int rowIndex = 0;
        List<Integer> actual = solution.getRow(rowIndex);
        List<Integer> expected = expectedList.get(rowIndex);
        assertEquals("corner case", expected, actual);
    }

    @Test
    public void Test2() {
        int rowIndex = 1;
        List<Integer> actual = solution.getRow(rowIndex);
        List<Integer> expected = expectedList.get(rowIndex);
        assertEquals("corner case", expected, actual);
    }

    @Test
    public void Test3() {
        int rowIndex = 2;
        List<Integer> actual = solution.getRow(rowIndex);
        List<Integer> expected = expectedList.get(rowIndex);
        assertEquals("normal case", expected, actual);
    }

    @Test
    public void Test4() {
        int rowIndex = 4;
        List<Integer> actual = solution.getRow(rowIndex);
        List<Integer> expected = expectedList.get(rowIndex);
        assertEquals("normal case", expected, actual);
    }

}
