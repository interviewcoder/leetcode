package _013_RomanToInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _013_RomanToInteger.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

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
        String A = "I";
        int actual = solution.romanToInt(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String A = "IV";
        int actual = solution.romanToInt(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String A = "IX";
        int actual = solution.romanToInt(A);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String A = "CCVII";
        int actual = solution.romanToInt(A);
        int expected = 207;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String A = "MLXVI";
        int actual = solution.romanToInt(A);
        int expected = 1066;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String A = "MCMLIV";
        int actual = solution.romanToInt(A);
        int expected = 1954;
        assertEquals(expected, actual);
    }

}
