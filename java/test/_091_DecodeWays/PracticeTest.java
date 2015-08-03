package _091_DecodeWays;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _091_DecodeWays.Practice } */
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
        String s = "1212";
        int actual = solution.numDecodings(s);
        int expected = 5;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test2() {
        String s = "611";
        int actual = solution.numDecodings(s);
        int expected = 2;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test3() {
        String s = "012";
        int actual = solution.numDecodings(s);
        int expected = 0;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test4() {
        String s = "27";
        int actual = solution.numDecodings(s);
        int expected = 1;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test5() {
        String s = "10";
        int actual = solution.numDecodings(s);
        int expected = 1;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test6() {
        String s = "0";
        int actual = solution.numDecodings(s);
        int expected = 0;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test7() {
        String s = "100";
        int actual = solution.numDecodings(s);
        int expected = 0;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test8() {
        String s = "101";
        int actual = solution.numDecodings(s);
        int expected = 1;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test9() {
        String s = "";
        int actual = solution.numDecodings(s);
        int expected = 0;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test10() {
        String s = "1";
        int actual = solution.numDecodings(s);
        int expected = 1;
        assertEquals(s, expected, actual);
    }

    @Test
    public void Test11() {
        String s = "8";
        int actual = solution.numDecodings(s);
        int expected = 1;
        assertEquals(s, expected, actual);
    }
}
