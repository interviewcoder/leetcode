package _171_ExcelSheetColumnNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _171_ExcelSheetColumnNumber.Practice } */
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
        String A = "A";
        int actual = solution.titleToNumber(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String A = "Z";
        int actual = solution.titleToNumber(A);
        int expected = 26;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String A = "AA";
        int actual = solution.titleToNumber(A);
        int expected = 27;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String A = "AZ";
        int actual = solution.titleToNumber(A);
        int expected = 52;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String A = "ZZ";
        int actual = solution.titleToNumber(A);
        int expected = 702;
        assertEquals(expected, actual);
    }

}
