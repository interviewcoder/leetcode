package _168_ExcelSheetColumnTitle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _168_ExcelSheetColumnTitle.Solution } */
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
        int A = 26;
        String actual = solution.convertToTitle(A);
        String expected = "Z";
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test2() {
        int A = 1;
        String actual = solution.convertToTitle(A);
        String expected = "A";
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test3() {
        int A = 702;
        String actual = solution.convertToTitle(A);
        String expected = "ZZ";
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test4() {
        int A = 27;
        String actual = solution.convertToTitle(A);
        String expected = "AA";
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test5() {
        int A = 52;
        String actual = solution.convertToTitle(A);
        String expected = "AZ";
        assertEquals(expected, actual);
    }
}
