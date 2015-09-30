package _275_HIndexII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTemplateTest {
    
    /** Test method for {@link _275_HIndexII.SolutionTemplate } */
    SolutionTemplate solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionTemplate();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] citations = {  };
        int actual = solution.hIndex(citations);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test1() {
        int[] citations = { 0 };
        int actual = solution.hIndex(citations);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] citations = { 5, 5, 5, 5, 7 };
        int actual = solution.hIndex(citations);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] citations = { 0, 5, 5, 6, 8 };
        int actual = solution.hIndex(citations);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] citations = { 0, 0, 0, 0, 0 }; 
        int actual = solution.hIndex(citations);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] citations = { 1, 2, 3, 4, 5 };
        int actual = solution.hIndex(citations);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] citations = { 2, 5 };
        int actual = solution.hIndex(citations);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] citations = { 1, 8 };
        int actual = solution.hIndex(citations);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int[] citations = { 0, 1 };
        int actual = solution.hIndex(citations);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int[] citations = { 0, 0 };
        int actual = solution.hIndex(citations);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        int[] citations = { 11, 15 };
        int actual = solution.hIndex(citations);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        int[] citations = { 100 };
        int actual = solution.hIndex(citations);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test12() {
        int[] citations = { 1 };
        int actual = solution.hIndex(citations);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test13() {
        int[] citations = { 0 };
        int actual = solution.hIndex(citations);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test14() {
        int[] citations = { 1, 1, 2, 3, 4, 5, 7 };
        int actual = solution.hIndex(citations);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test15() {
        int[] citations = { 0, 0, 1 };
        int actual = solution.hIndex(citations);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
