package _012_IntegerToRoman;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _012_IntegerToRoman.Solution } */
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
        int A = 1;
        String actual = solution.intToRoman(A);
        String expected = "I";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int A = 4;
        String actual = solution.intToRoman(A);
        String expected = "IV";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int A = 9;
        String actual = solution.intToRoman(A);
        String expected = "IX";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int A = 207;
        String actual = solution.intToRoman(A);
        String expected = "CCVII";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int A = 1066;
        String actual = solution.intToRoman(A);
        String expected = "MLXVI";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int A = 1954;
        String actual = solution.intToRoman(A);
        String expected = "MCMLIV";
        assertEquals(expected, actual);
    }

}
