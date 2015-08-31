package _179_LargestNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _179_LargestNumber.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] A = { 3, 30, 34, 5, 9};
        String actual = solution.largestNumber(A);
        String expected = "9534330";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] A = { 0, 0, 0};
        String actual = solution.largestNumber(A);
        String expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] A = { 0, 1, 0 };
        String actual = solution.largestNumber(A);
        String expected = "100";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        String actual = solution.largestNumber(A);
        String expected = "111111111";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] A = {12, 121};
        String actual = solution.largestNumber(A);
        String expected = "12121";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] A = {12, 13};
        String actual = solution.largestNumber(A);
        String expected = "1312";
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] A = {12, 123};
        String actual = solution.largestNumber(A);
        String expected = "12312";
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int[] A = {12, 1201};
        String actual = solution.largestNumber(A);
        String expected = "121201";
        assertEquals(expected, actual);
    }

}
