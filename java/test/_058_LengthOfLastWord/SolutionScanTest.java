package _058_LengthOfLastWord;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionScanTest {

    /** Test method for {@link _058_LengthOfLastWord.SolutionScan } */
    SolutionScan solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionScan();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String s = "Hello World";
        int actual = solution.lengthOfLastWord(s);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "Hello   World";
        int actual = solution.lengthOfLastWord(s);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "Hello   World  ";
        int actual = solution.lengthOfLastWord(s);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "Hello";
        int actual = solution.lengthOfLastWord(s);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "Hello  ";
        int actual = solution.lengthOfLastWord(s);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String s = "a ";
        int actual = solution.lengthOfLastWord(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String s = " ";
        int actual = solution.lengthOfLastWord(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        String s = "   ";
        int actual = solution.lengthOfLastWord(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
