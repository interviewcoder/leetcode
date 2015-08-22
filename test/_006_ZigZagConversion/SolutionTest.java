package _006_ZigZagConversion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _006_ZigZagConversion.Solution } */
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
        String A = "PAYPALISHIRING";
        int B = 3;
        String actual = solution.convert(A, B);
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String A = "ABCD";
        int B = 2;
        String actual = solution.convert(A, B);
        String expected = "ACBD";
        assertEquals(expected, actual);
    }

}
